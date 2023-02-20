fun main() {

    println("Ingresa la cantidad de nombres: ")
    val cant = readLine()!!.toInt()
    val array = arrayOfNulls<String>(cant)

    for(i in array.indices){
        println("el nombre ${i}")
        array[i] = readLine();
    }

    var menu = """
        Bienvenid@.....
        Menu de opciones
        1. Acceder a un elemento
        2. Modificar un elemento 
        3. Recorrer arreglo
        Ingrese una opcion :
    """
    println(menu)
    val opcion = readLine()!!.toInt()
    when(opcion){
        1 ->{
            println("Que elemento deseas acceder, el arreglo es del 0 al ${cant-1}: ")
            var elem = readLine()!!.toInt()
            println(array[elem])
        }
        2 ->{
            println("Que elemento deseas modificar, el arreglo es del 0 al ${cant-1}: ")
            var elem = readLine()!!.toInt()
            println("eligiste el elemto ${elem} que contiene ${array[elem]}")
            println("ingresa el nuevo nombre")
            var newNombre: String? = readLine()
            array[elem] = newNombre;
            println("El elemento ${elem} se a modificado a ${array[elem]}")
        }
        3 ->{
            println("El array contiene estos nombres: ")
            array.forEach { nombre -> println(nombre) }
        }
        else -> println("Opcion invalidad")
    }
}