// 1. Cree un algoritmo que lea un número y determine si éste es divisible entre 11.

fun main() {
    println("Ingrese la cantidad de numeros a procesar: ")
    val cantidad = readLine()!!.toInt()
    for (i in 1 until cantidad) {
        println("Ingrese un numero: ")
        val numero = readLine()!!.toInt()
        if(numero % 11 == 0){
         println("El numero ${numero} es divisible a 11")
        }else{
            println("El numero ${numero} no es divisible a 11")
        }
    }
    
}