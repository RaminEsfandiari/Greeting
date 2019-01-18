package app

trait BankAccount extends A {

  val accountNumber: String
  val balance: Double

  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount

}
