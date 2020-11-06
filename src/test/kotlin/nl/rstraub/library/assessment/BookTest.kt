package nl.rstraub.library.assessment

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class BookTest{
    val book = Book("The Hobbit", true)

    @Test
    internal fun `should return an available book with title`() {
        assertThat(book.title).isEqualTo("The Hobbit")
        assertThat(book.available).isTrue()
    }
}
