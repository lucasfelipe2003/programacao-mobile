//Exercicio 01
// Escreva um programa que solicite ao usuário um número inteiro e um número decimal. 
//Converta o número inteiro para decimal e o número decimal para inteiro. 
//Exiba os resultados das conversões, indicando o tipo de dado de cada variável após a conversão.

// Nome Integrantes: Lucas Coelho e Luciana Wessner

fun main() {
    // Solicita um número inteiro ao usuário
    print("Digite um número inteiro: ")
    val numeroInteiro = readLine()?.toIntOrNull() ?: run {
        println("Entrada inválida. Usando valor padrão 0.")
        0
    }

    // Solicita um número decimal ao usuário
    print("Digite um número decimal: ")
    val numeroDecimal = readLine()?.toDoubleOrNull() ?: run {
        println("Entrada inválida. Usando valor padrão 0.0.")
        0.0
    }

    // Converte o número inteiro para decimal
    val inteiroParaDecimal = numeroInteiro.toDouble()
    
    // Converte o número decimal para inteiro
    val decimalParaInteiro = numeroDecimal.toInt()

    // Exibe os resultados das conversões
    println("Conversão do inteiro para decimal: $inteiroParaDecimal (tipo: ${inteiroParaDecimal::class.simpleName})")
    println("Conversão do decimal para inteiro: $decimalParaInteiro (tipo: ${decimalParaInteiro::class.simpleName})")
}
