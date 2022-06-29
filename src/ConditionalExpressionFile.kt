fun main(args: Array<String>) {
    var marks = 40
    var result = if (marks<50){
        "E"
    }else if (marks <60){
        "D"
    }else if (marks <70){
        "C"
    }else if (marks <80){
        "B"
    }else {
     "A"
    }
    println(result)

    var bettingNumber = 2
    var bettingResult =when(bettingNumber){
        1->{
            "oops !! you lost"
        }
        2->{
            "oops !! you lost"
        }
        3->{
            "oops !! you lost"
        }
        else->{
            "please enter a number from 1 - 3"
        }

    }
    println(bettingResult)


}
