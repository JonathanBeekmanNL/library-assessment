package nl.rstraub.library.assessment

import assertk.assertThat
import assertk.assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MemberTest {
    private lateinit var member: Member

    @BeforeEach
    internal fun setUp() {
        member = Member("Bob")
    }

    @Test
    internal fun `should return name of member`() {
        assertThat(member.name).isEqualTo("Bob")
    }

    @Test
    internal fun `should return list of books of member`() {
        assertThat(member.getBooks()).isEmpty()
    }

    @Test
    internal fun `should add book to member`() {
        val book = "Lotr"

        member add book

        val result = member.getBooks()

        assertThat(result).contains(book)
        assertThat(result).hasSize(1)
    }

    @Test
    internal fun `should not add book if member has seven or more books`() {
        val books = listOf("1", "2", "3", "4", "5", "6", "7")
        books.forEach { book: String -> member add book }

        assertThat { member add "8" }.isFailure()
    }
}
