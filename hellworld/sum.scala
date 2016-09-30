object sum {
	def main(args: Array[String]) {

		// var
		var c: Int = 0;
		var d: Int = 0;

		// call Sum for var
		c = 10;
		d = 20;
		println("c = " + c);
		println("d = " + d);
		println("sum var " + sum(c,d));
		println("====\n");
	}

	def sum(a:Int, b:Int): Int = {
		return a+b;
	}
}