class Persona(var peso: Double, var altura: Double) {
    var nombre: String? = null
        private set

    val imc: Double
        get() = peso / (altura * altura)

    fun setNombre(nuevoNombre: String) {
        require(nuevoNombre.isNotBlank()) { "El nombre no puede estar vacío" }
        nombre = nuevoNombre
    }

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', peso=$peso, altura=$altura, imc=${"%.2f".format(imc)})"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false
        return nombre == other.nombre && peso == other.peso && altura == other.altura
    }
}