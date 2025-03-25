//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Actividad_Didactica.SRP
class Producto(val nombre: String, val precio: Double) {
    fun calcularDescuento(porcentaje: Double): Double {
        return precio - (precio * porcentaje / 100)
    }
    fun imprimirDetalles() {
        println("Producto: $nombre, Precio: $precio")
    }
}
fun main() {
    val producto = Producto("Laptop", 1500.0)
    println("Precio con descuento:
        ${producto.calcularDescuento(10.0)}")
    producto.imprimirDetalles()
} 