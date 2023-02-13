// Haga un algoritmo con un menu de opciones, 1.saludar, 2.pedir nombre de persona, 3. sumar 2 numeros
//  y que dependiendo del numero ingresado, realice la acción correspondiente.

fun main() {    
    var menu = """
    Menu de opciones
    1. Saludar
    2. Pedir nombre de persona 
    3. Sumar 2 Numeros
    Ingrese una opcion :
    """

    println(menu)

    var opcion = readLine()?.toInt()

    when(opcion){
      1 -> println("Hola!")
      2 -> {
        println("Ingrese el nombre de la persona: ")
        val name = readLine()
        println("Hola, ${name}")
      }
      3 ->{
        println("Ingresr el primer numero: ")
        val num1 = readLine()!!.toInt()
        println("Ingrese el segundo numero: ")
        val num2 = readLine()!!.toInt()
        var suma = num1 + num2;
        println("la suma de ${num1} y ${num2} es $suma ")
      }
      else -> println("opcion invalidad")
    }
}