package DIP

interface Motor {
    fun encender()
}


class Motorelectrico : Motor {
    override fun encender() {
        println("Motor eléctrico encendido")
    }
}

class MotorCombustion : Motor {
    override fun encender() {
        println("Motor de combustión encendido")
    }
}

class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}

fun main() {
    val MotorElectrico = MotorElectrico()
    val vehiculoElectrico = Vehiculo(MotorElectrico)
    vehiculoElectrico.arrancar()

    val MotorCombustion = MotorCombustion()
    val vehiculoCombustion = Vehiculo(MotorCombustion)
    vehiculoCombustion.arrancar()
}