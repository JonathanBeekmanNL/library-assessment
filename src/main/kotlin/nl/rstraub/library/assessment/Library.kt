package nl.rstraub.library.assessment

class Library(
    inventory: List<String>,
    val members: List<String>
) {
    private val inventory = inventory.toMutableList()

    fun addBook() {
        inventory.add("joepie")
    }

    fun getInventory() : List<String> = inventory
}
