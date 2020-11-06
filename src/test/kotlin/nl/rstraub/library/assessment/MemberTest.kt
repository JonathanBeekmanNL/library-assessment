package nl.rstraub.library.assessment

import assertk.assertThat
import assertk.assertions.contains
import assertk.assertions.hasSize
import assertk.assertions.isEmpty
import assertk.assertions.isEqualTo
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
        member add "Lotr"
        assertThat(member.getBooks()).contains("Lotr")
        assertThat(member.getBooks()).hasSize(1)
    }
}
