fun main(){
val text=Text("Myra","How are you doing",12)
text.message()
    val reply=Reply("Tyra","I am good,alright")
    reply.message()

    val(name,age,gender)=getPersonDetails()
    println("($name,$age,$gender)")

}
data class  Text(val user: String,val message:String ,val time:Long) {
    open fun message() {
        println("Hello $user $message lets meet at $time")

    }

    }

class Reply(val user2:String,val responce:String ){
     fun message(){
        println(" Hello  $user2 $responce ")


    }}

fun getPersonDetails():Triple<String,Int,Char>{
    val name="Amo"
    val age=18
    val gender='F'
    return Triple(name,age,gender)


}





