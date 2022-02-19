fun testaComportamentoConta(){
    val conta = Conta(titular = "Everton", numero =  1, saldo = 0.0)
    val conta2 = Conta(saldo = 0.0, titular = "João", numero = 2)
    conta.depositar(100.0)
    conta.sacar(50.0)
    conta.transferir(conta2, 25.0)
    println(conta.toString())
    println(conta2.toString())
}