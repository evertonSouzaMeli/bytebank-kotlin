fun main() {
    val conta = Conta(titular = "Everton", numero =  1, saldo = 0.0)
    val conta2 = Conta(saldo = 0.0, titular = "João", numero = 2)
    conta.depositar(100.0)
    conta.sacar(50.0)
    conta.transferir(conta2, 25.0)
    println(conta.toString())
    println(conta2.toString())
}

class Conta(var titular: String, val numero: Int, saldo: Double) {
    var saldo: Double = saldo
        private set

    fun depositar(valor: Double){
        if(valor > 0)
            saldo += valor
    }

    fun sacar(valor: Double){
        if(valor <= saldo  && valor > 0)
            saldo -= valor
    }

    fun transferir(conta: Conta, valor: Double){
        if(conta != this)
            sacar(valor)
        conta.depositar(valor)
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}


fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

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