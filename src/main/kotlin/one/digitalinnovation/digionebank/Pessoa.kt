package one.digitalinnovation.digionebank

class Pessoa() {

    var nome : String = "Claison"
    var cpf: String = "123.456.789-10"
    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val claison = Pessoa()

    println(claison.pessoaInfo())
}