package PBO225443005Tugas

abstract class LibraryItem(
    open val id: String,
    open val tittle: String,
    open val year: Int
){
    abstract var status : ItemStatus
    abstract fun getDetails(): String
    open fun display()
    {
        println("[$id]$tittle($year)-${status.display()}")
        println("awikwok ${getDetails()}")
    }
}