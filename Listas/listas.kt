fun main() {
    println("Ingresa la cantidad de nombres: ")
    val cant = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for(i in 1..cant){
        println("el nombre ${i}")
        val elemento = readLine()!!.toInt()
        list.add(elemento)
    }

    var menu = """
        Bienvenid@.....
        Menu de opciones
        1. Acceder a un elemento
        2. Modificar un elemento 
        3. Agregar nuevo elemento
        4. Eliminar un elemento
        5. Ver numeros pares de la lista
        6. Recorrer arreglo
        Ingrese una opcion :
    """
    println(menu)
    val opcion = readLine()!!.toInt()

    when(opcion){
     1 ->{
        //Accediendo a un elemento
        println("Accediendo a un elemento: ")
        val worth = list[3] // o .get(posicion)
        println("El elemento en la posicion 3 es ${worth}")
     }
     2 ->{
        //modificar un elemento de la lista 
        println("Modificar un elemento de la lista: ")
        println("El elemento ${list.get(0)}")
        list[0] = 17
        println("se modifico a ${list[0]}")
     }
     3 ->{
        // Agregar un nuevo elemento al final de la lista
        list.add(31)
        println("Se ah agregado un nuevo elemento")
     }
     4 ->{
        // Eliminar un elemento de la lista
        list.remove(2)
        println("Se ah eliminado un elemento")
     }
     5 ->{
        //filtrar para devolver solo los numeros pares
        val listPares = list.filter { it % 2 == 0 } 
        val booleano: Boolean = listPares.isEmpty()

        if(booleano == false){
           println("Numeros pares ${listPares}")
        }else{
            println("No hay numeros pares")
        }
     }
     6 ->{
        // forEachIndexed para ejecutar una funvion por cada elemento
        // y acceder al indice y al valor
        list.forEachIndexed { index, value ->
            println("El elemento en la posición $index es $value")
        }
     }
     else -> println("Opcion invalidad") 
    }









    
}