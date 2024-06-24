object ticket{
	
	var perm_cost = 500
	var atten_cost = 3
	
	var max_atten = 140
	var avg_atten = 120
	var min_atten = 100
	
	def profitCal(price:Int): Int= price match{
		case x if (price == 15) => calculate(price,avg_atten)
		case x if (price == 20) => calculate(price,min_atten)
		case x if (price == 10) => calculate(price,max_atten)
	}
	
	def calculate(price:Int , attendence:Int): Int = {
		
		val ans = (price * attendence) - (500 + (3 * attendence))
		ans
	}
	
	def main(args : Array[String]): Unit = {
		var profit_of_min_price = profitCal(10)
		var profit_of_avg_price = profitCal(15)
		var profit_of_max_price = profitCal(20)
		
		println(s"Profit when ticket price is 10rs: $profit_of_min_price")
		println(s"\nProfit when ticket price is 15rs: $profit_of_avg_price")
		println(s"\nProfit when ticket price is 20rs: $profit_of_max_price")
		println("\nTicket price with highest profit is 20Rs")
	}
		
}
