package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val Ruan = Cliente(nome = "Ruan", cpf = "12345678910", clienteTipo = ClienteTipo.PF, senha ="123456")

    println(Ruan)

    TesteAutenticacao().autentica(Ruan)



}
