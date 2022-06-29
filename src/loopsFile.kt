fun main(args: Array<String>) {
    var countOne = 0
    while (countOne<=5){
        println(countOne)
        countOne++


    }
    // DO WHILE LOOP
     var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while (countTwo<=15)

    // REPEAT LOOP
    repeat(6){
        println("Good Morning")
    }
    //FOR IN LOOP

    var  names = arrayOf("King","Faith","Shanky","Linet","Brian")
    //name.sort
    names.sortDescending()
    for (jina in names){
        println(jina)
    }
    var ascendingNumbers = 0 .. 20
    for (nambari in ascendingNumbers){
        println(nambari)
    }
    var descendingNumbers = 20 downTo 0
    for (nambari in descendingNumbers){
        println(nambari)
    }


}