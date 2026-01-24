fun main() {
    val likes = 32

    fun getLikesMessage(likes: Int): String {
        return when {
            likes % 10 == 1 && likes % 100 != 11 -> "$likes человеку"
            likes % 10 in 2..4 && likes % 100 !in 12..14 -> "$likes человекам"
            else -> "$likes людям"
        }
    }
    println("Понравилось ${getLikesMessage(likes)}")
}