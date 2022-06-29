fun main(args: Array<String>) {
    var age =15
    if (age<18){
        println("Go Home !!")
    }else{
        println("Welcome To the Party")
    }
    //Grading System

    var marks = 30
    if (marks<40){
        println("E")
    }else if (marks<50){
        println("D")
    }else if (marks<60){
        println("C")
    }else if (marks<70){
        println("B")

    }else{
        println("A")
    }

    // Betting System
    var bettingNumber=0
    when(bettingNumber){
        1->{
            println("Oops !! you've lost")

        }
        2->{
            println("Oops !! you've lost")

        }
        3->{
            println("Congrats you won")
        }
        4->{
            println("Oops !! you lost")

        }
        else->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }



}