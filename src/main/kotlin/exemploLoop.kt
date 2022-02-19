fun exemploLoop(titular: String) {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    //ascendente
    for (i in 1..titular.length)
        print(i)

    println("\n")

    //descendente
    for (i in titular.length downTo 1)
        print(i)

    println("\n")

    //ascendente com intervalo
    for (i in 1..titular.length step 2)
        print(i)

    println("\n")

    //descendente com intervalo
    for (i in titular.length downTo 1 step 2)
        print(i)

    println("\n")

    for (i in 1..titular.length) {
        if (i == 4)
            break
        print(i)
    }
}