package nl.rstraub.library.assessment

class Member(val name: String) {
    private val books = mutableListOf<String>()

    infix fun add(title: String) {
        books.add(title)
    }

    fun getBooks() = books
}
