fun main(args : Array<String>) {
	print("Introduce la altura de la pirámide: ")
	var altura = readLine()!!.toInt()
	var nivel = 1
	var longitud = 1
	var espacios = altura - 1
	while (nivel <= altura) {
		for (i in 1..espacios) {
			print(" ")
		}
		for (i in 1..longitud) {
			print("*")
		}
		println()
		nivel++
		espacios--
		longitud += 2
	}
	
}