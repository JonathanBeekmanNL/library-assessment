package nl.rstraub.library.assessment

class Member(val name: String) {
    private val books = mutableListOf<String>()

    infix fun add(title: String) {
        require(books.size < 7) {"member can loan a maximum of 7 books"}
        books.add(title)
    }

    fun getBooks() = books
}
