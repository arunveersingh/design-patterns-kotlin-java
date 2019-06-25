package behavioral.iterator

fun main(){
    var dashBoard: DashBoard = DashBoard()

    var topic1: Topic = Topic("topic1")
    var topic2: Topic = Topic("topic2")
    var topic3: Topic = Topic("topic3")

    dashBoard.initTopics(arrayOf(topic1, topic2, topic3))

    var itr: CustomIterator =  dashBoard.getTopicIterator()

    while (itr.hasNext()){
        println(itr.next())
    }
}