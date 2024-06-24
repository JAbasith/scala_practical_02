 object Takehomesalary{
 	def salaryCalculate(workh: Int, oth: Int, tax: Float, workm: Int, otm: Int): Float = {
 		val sal = (workh * workm + oth * otm)
 		val netsal = sal * (1 - tax)
 		netsal
 	}
 	
 	def main(args: Array[String]): Unit = {
 		println(salaryCalculate(40,30,0.12,250,85))
 	}
 }
