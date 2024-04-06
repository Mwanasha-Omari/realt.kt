fun main(){
val text=Text("Myra","How are you doing",12)
text.message()
    val reply=Reply("Tyra","I am okay")
    reply.message()

}
data class  Text(val user: String,val message:String ,val time:Long) {
    open fun message() {
        println("Hello $user")

    }

    }

class Reply(val user2:String,val responce:String ){
     fun message(){
        println(" Hello  $user2 I am okay "){

        }
    }}





