fun main() {
    val persona1 = Persona(70.5, 1.75)
    val persona2 = Persona("Diego", 60.0, 1.65)
    val persona3 = Persona("Roberto", 80.0, 1.85)

    println("───────────────────────────")
    println("    Personas iniciales     ")
    println("───────────────────────────")
    println(persona1)
    println(persona2)
    println("$persona3\n")

    var nombre: String?
    do {
        print("[+] Ingresa nombre para Persona1: ")
        nombre = readLine()
    } while (nombre.isNullOrEmpty())

    persona1.setNombre(nombre)

    println("\nDatos Persona1")
    println("Nombre: ${persona1.nombre} - Peso: ${persona1.peso} - Altura: ${persona1.altura}")

    println("\nDatos Persona3")
    println("Original: Peso=${persona3.peso} Altura=${persona3.altura} IMC=${"%.2f".format(persona3.imc)}")
    persona3.altura = 1.80
    println("Modificado: Peso=${persona3.peso} Altura=${persona3.altura} IMC=${"%.2f".format(persona3.imc)}")

    persona2.altura = persona3.altura
    println("───────────────────────────")
    println("     Comparación final     ")
    println("───────────────────────────")
    println(persona2)
    println(persona3)
    println("¿Iguales?: ${persona2 == persona3}")
}