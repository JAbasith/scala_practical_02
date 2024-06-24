object Scalaconvert{
	var a: Int = 2
	var b: Int = 3
	var c: Int = 4
	var d: Int = 5
	val k: Float = 4.3f
	
	def expr1(): Int = {
		b -= 1
		b * a + c * d
	}
	
	def expr2(): Int = {
		val x = a
		a += 1
		x
	}
	
	def expr3(): Float = {
		-2 * (a - k) + c
	}
	
	def expr4(): Int = {
		val y = c
		c += 1
		y
	}
	
	def expr5(): Int = {
		val w = a
		a += 1
		c += 1
		c * w
	}
	
	def main(args: Array[String]): Unit = {
		println(expr1())
		println(expr2())
		println(expr3())
		println(expr4())
		println(expr5())
	}
}
