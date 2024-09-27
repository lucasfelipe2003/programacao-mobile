//Exercicio 02
// Crie um programa que receba um número inteiro como entrada e, 
//utilizando a estrutura when, imprima uma mensagem indicando se o número é positivo,
//negativo ou zero.


// Nome Integrantes: Lucas Coelho e Luciana Wessner

fun main() {
    // Solicita ao usuário que digite um número inteiro
    print("Digite um número inteiro: ")
    
    // Lê a entrada do usuário e tenta convertê-la para um inteiro.
    // Se a conversão falhar, usa 0 como valor padrão.
    val numero = readLine()?.toIntOrNull() ?: 0

    // Utiliza a estrutura 'when' para avaliar o valor do número
    when {
        // Verifica se o número é maior que 0
        numero > 0 -> println("O número é positivo.")
        
        // Verifica se o número é menor que 0
        numero < 0 -> println("O número é negativo.")
        
        // Caso o número não seja maior nem menor que 0, deve ser zero
        else -> println("O número é zero.")
    }
}
