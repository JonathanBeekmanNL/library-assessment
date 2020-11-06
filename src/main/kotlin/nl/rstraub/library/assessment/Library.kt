package nl.rstraub.library.assessment

class Library(
    inventory: List<String>,
    val members: List<String>
) {
    private val inventory = inventory.toMutableList()

    infix fun addBook(book : String) {
        inventory.add(book)
    }

    fun getInventory() : List<String> = inventory
}
