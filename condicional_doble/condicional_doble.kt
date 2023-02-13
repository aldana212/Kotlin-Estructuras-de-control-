// Algoritmo que  solicite el nombre y la materia de un estudiante, así como 
// 3 notas parciales y con esto calcule el promedio de notas, que pueda validar si el estudiante 
//saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó la materia,
// de lo contrario indique que la perdió, el mensaje deberá mencionar el nombre y 
// la materia del estudiante.

fun main() {
    println("Ingrese su nombre: ")
    val nombre = readLine().toString()
    println("Ingrese su materia: ")
    val materia = readLine().toString();
    println("Ingrese la nota1: ")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la nota2: ")
    val nota2 = readLine()!!.toFloat();
    println("Ingrese la nota3: ")
    val nota3 = readLine()!!.toFloat()

    val prom = (nota1 + nota2 + nota3) / 3;

    println("el promedio de notas es: ${prom}")

    if(prom >= 3.5){
        println("el estudiante ${nombre} Gano la materia ${materia}")
    }else{
        println("El estudiante ${nombre} Perdio la materia ${materia}")
    }
    
}