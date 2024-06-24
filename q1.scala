object values{
	def main(args: Array[String]): Unit ={
		val k = 2
		var i = 2
		val j = 2
		val m = 5
		val n = 5
		val f = 12.0f
		val g = 4.0f
		val c = "X"
		
		val a = k + 12 * m
		val b = m / j
		val y = n % j
		val d = m / j * j
		val e = f + 10 * 5 + g
		i += 1
		val z = i * n
		println(s"a/ k + 12 * m = $a\nb/ m / j = $b\nc/ n % j = $y\nd/ m / j * j = $d\ne/ f + 10 * 5 + g = $e\nf/ ++i * n = $z")
	}
}
