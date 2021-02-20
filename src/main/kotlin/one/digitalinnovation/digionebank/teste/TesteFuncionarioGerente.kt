package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main() {

    var maria = Gerente("Maria do Carmo", "12345678910",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}