package oop

fun main(args: Array<String>) {
    var firstudent=student("Faith",15)
    firstudent.viewResult()
    var firstBoardMember=BoardMember("Timothy",105)
    firstBoardMember.publishMagazine()
}
open class Teacher (open var name:String , open var age:Int){
    fun viewResult(){
        println("Hello $name ,you can view results")
    }
    fun publishMagazine(){
        println("Hello $name ,you are $age years old and you can publish a ,magazine")
    }
}
open class  student(name: String,age: Int):Teacher(name,age){
    fun sitForExams (){
        println("Hello i can sit for exams")
    }

}
class BoardMember (name:String,age: Int):student(name, age){


}
