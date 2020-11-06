package nl.rstraub.library.assessment

import assertk.assertThat
import assertk.assertions.contains
import assertk.assertions.isEmpty
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class LibraryTest {
    @Nested
    inner class Inventory {
        @Test
        internal fun `should return empty list given no books`() {
            val result = Library(emptyList(), emptyList()).getInventory()
            assertThat(result).isEmpty()
        }

        @Test
        internal fun `should return inventory given books`() {
            val books = listOf("bookA")
            val result = Library(books, emptyList()).getInventory()

            assertThat(result).isEqualTo(books)
        }
    }

    @Nested
    inner class Members {
        @Test
        internal fun `should return empty list given no members`() {
            val result = Library(emptyList(), emptyList()).getMembers()
            assertThat(result).isEmpty()
        }

        @Test
        internal fun `should return list of members given members`() {
            val members = listOf(Member("member Uno"))
            val result = Library(emptyList(), members).getMembers()
            assertThat(result).isEqualTo(members)
        }

        @Nested
        inner class AddMembers {
            @Test
            internal fun `should add a member to the library`() {
                val member = Member("member1")
                val library = Library(emptyList(), listOf(Member("member2")))

                library addMember member
                val result = library.getMembers()

                assertThat(result).contains(member)
                assertThat(result.size).isEqualTo(2)
            }
        }
    }

    @Nested
    inner class AddBooks {
        @Test
        internal fun `should add a book to the inventory`() {
            val book = "book1"
            val library = Library(listOf("book2"), emptyList())

            library addBook book
            val result = library.getInventory()

            assertThat(result).contains(book)
            assertThat(result.size).isEqualTo(2)
        }
    }
}
