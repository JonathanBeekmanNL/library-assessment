package nl.rstraub.library.assessment

import org.junit.jupiter.api.Test

internal class BookTest{

    @Test
    internal fun `should have a title`() {
        val book = Book("The Hobbit")
    }
}
