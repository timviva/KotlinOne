fun main(args: Array<String>) {
motto()
userVerification("Timothy Wanyama","timothy@gmail.com")
    average(23.0,50,65.0f)
println(addition(20,30.0))
    login("King")
    login("king@gmail.com","King@123")
}

fun motto(){
    println("Hello this is our motto")
}
fun userVerification(username:String,email:String){
    println("Your username is $username and you email is $email")

}
fun  average (x:Double,y:Int,z:Float){
    var result= (x+y +z)/3.0
    println("Hello , your average is $result")
}

fun addition (x:Int ,y:Double):Double{
    var answer = x+y
    return answer

}
fun login(name:String){
    println("Hello your name is $name")
}
fun login(email: String,password:String){
    println("Hello your email ids $email and your password is $password")
}
