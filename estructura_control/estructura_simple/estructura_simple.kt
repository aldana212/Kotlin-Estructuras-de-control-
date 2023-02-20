// La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando 
// un descuento del 50% en compras mayores o iguales a los $ 100.000. Haga un 
// algoritmo que permita validar cuando se debe aplicar un descuento a un cliente,
// en caso de que el descuento sea valido se debe informar al usuario indicando 
// el valor descontado.

fun main() {
    println("Ingrese el valor de la compra: ")
    var valorCompra = readLine()!!.toDouble();
    println("Valor compra: ${valorCompra}")
    var descuento: Double;
    if(valorCompra >= 100000){
        descuento = valorCompra * 0.5;
        println("se aplico un descuento del 50% equivalente a: ${descuento}")
    }

    println("valor final: ${valorCompra}")
}