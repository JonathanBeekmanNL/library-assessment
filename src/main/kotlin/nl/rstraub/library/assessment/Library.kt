package nl.rstraub.library.assessment

class Library(
    inventory: List<String>,
    members: List<Member>
) {
    private val inventory = inventory.toMutableList()
    private val members = members.toMutableList()

    infix fun addBook(book : String) {
        inventory.add(book)
    }

    fun getInventory() : List<String> = inventory

    infix fun addMember(member: Member) {
        members.add(member)
    }

    fun getMembers() : List<Member> = members
}
