fun main(args: Array<String>) {
    var a : Int
    var c : Float
    var b : Double

    var aConverted:String
    var bConverted:String
    var cConverted: String

    a = 20
    b= 30.0
    c= 40.0f

    println(a + b + c)

    aConverted= a.toString()
    bConverted=b.toString()
    cConverted=c.toString()

    println(aConverted + bConverted + cConverted)
}

