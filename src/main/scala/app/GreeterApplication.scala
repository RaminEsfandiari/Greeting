package app


object GreeterApplication extends App {

    val raminsSavingsAccount = new SavingsAccount("12334", 3000.4,1.2,"Ramin")
    val bonniesSavingsAccount = new SavingsAccount("12335", 5000.4,1.2,"Bonnie")
    val brendansSavingsAccount = new SavingsAccount("12336", 7000.4,1.2,"Brendan")

    val x = raminsSavingsAccount.withdraw(100)
    val y = bonniesSavingsAccount.withdraw(200)
    val z = brendansSavingsAccount.withdraw(500)

    println(x.balance)
    println(y.balance)
    println(z.balance)

}










//    val paypalAccount = new BankAccount() //reduce by 5% on withdraw
//    val isaAccount = new ISAAccount() // deposit limit and no withdraw function

