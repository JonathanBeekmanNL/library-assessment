package nl.rstraub.library.assessment

import assertk.assertThat
import assertk.assertions.isEmpty
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class LibraryTest {
    @Nested
    inner class Inventory {
        @Test
        internal fun `should return empty list given no books`() {
            val result = Library(emptyList(), emptyList()).inventory
            assertThat(result).isEmpty()
        }

        @Test
        internal fun `should return inventory given books`() {
            val books = listOf("bookA")
            val result = Library(books, emptyList()).inventory

            assertThat(result).isEqualTo(books)
        }
    }

    @Nested
    inner class Members {
        @Test
        internal fun `should return empty list given no members`() {
            val result = Library(emptyList(), emptyList()).members
            assertThat(result).isEmpty()
        }

        @Test
        internal fun `should return list of members given members`() {
            val members = listOf("lidnr1")
            val result = Library(emptyList(), members).members
            assertThat(result).isEqualTo(members)
        }
    }
}
