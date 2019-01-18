package app

import java.util.Date

class SavingsAccount(val accountNumber: Int,
                     val accountNumber: String,
                     val balance: Double,
                     val interestRate: Double,
                     accountHolderName: String) extends BankAccount with InterestBearing {



  override def withdraw(amount: Double): BankAccount = {
    val newBalance = balance - amount
    new SavingsAccount(accountNumber, newBalance, interestRate, accountHolderName)
  }

  override def deposit(amount: Double): BankAccount = ???
  override def payInterest(date: Date): Double = ???

}
