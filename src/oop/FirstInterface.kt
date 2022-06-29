package oop

fun main(args: Array<String>) {
    var firstSchool= School()
    firstSchool.motto()
    print(firstSchool.login())
}
interface  FirstInterface {
    var age:Int
    fun login():String
    fun  motto(){
        println("Hello,this is our motto")
    }
}

class School ():FirstInterface{
    override var age: Int=100
    override fun login(): String {
       var loginStatement="Yeah ,I cam login"
        return loginStatement
    }

}