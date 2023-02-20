// Realeza un algoritmo que solicite un numero y que indique si este numero 
// es positivo o negativo

fun main() {
    println("Ingrese un numero")
    val numero = readLine()!!.toInt()
    if(numero > 0){
      println("El numero es positivo ")
    }else{
        if(numero < 0){
         println("El numero es negativo")
        }else{
            println("El numero es cero")
        }
    }
}