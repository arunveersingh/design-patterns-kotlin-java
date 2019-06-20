package behavioral.iterator

interface SocialNetwork<T> {
    open fun createFriendsIterator(email: String) : MyIterator<T>
    fun createCoWorkersIterator(email: String) : MyIterator<T>
}