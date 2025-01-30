class Persona(var peso: Double, var altura: Double) {
    var nombre: String = ""
    val imc: Double
        get() = peso / (altura * altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return """
            - Nombre: ${this.nombre}
            - Peso: ${this.peso}
            - Altura: ${this.altura}
            - IMC: ${this.imc}
        """.trimIndent()
    }

}

fun pedirNombre(persona: Persona): String {
    var nombre: String? = null
    do {
        println("Introduce el nombre de la persona: ")
        nombre = readln()
        if (nombre != null) {
            return nombre
        } else {
            println("ERROR: Tienes que introducir un")
        }
    } while (nombre != null)

    if (nombre != null) {
        return nombre
    } else {
    }
}

fun main() {
    val miPersona1 = Persona(57.33, 179.24)
    val miPersona2 = Persona("Diego", 99.11, 186.13)
    val miPersona3 = Persona("Roberto", 53.11, 169.33)


}