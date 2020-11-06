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
            val result = Library(emptyList()).inventory
            assertThat(result).isEmpty()
        }

        @Test
        internal fun `should provide overview of the books`() {
            val books = listOf("bookA")
            val result = Library(books).inventory

            assertThat(result).isEqualTo(books)
        }
    }
}
