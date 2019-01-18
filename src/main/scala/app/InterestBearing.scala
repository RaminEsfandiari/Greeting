package app

import java.util.Date

trait InterestBearing {

  val accountNumber: Int
  val interestRate: Double

  def payInterest(date: Date): Double

}
