//Exercicio 08
// Escreva um programa que solicite ao usuário um número inteiro. 
//Utilize um bloco try-catch para capturar a exceção NumberFormatException caso o usuário digite um valor não numérico. 
//Se ocorrer a exceção, exiba uma mensagem informando que o valor digitado é inválido. 
//Caso contrário, exiba o número digitado.

// Nome Integrantes: Lucas Coelho e Luciana Wessner


fun main() {
    try {
        // Solicita ao usuário que digite um número inteiro
        print("Digite um número inteiro: ")
        
        // Lê a entrada do usuário e tenta convertê-la para um inteiro
        // Se a conversão falhar, lança uma NumberFormatException
        val numero = readLine()?.toInt() ?: throw NumberFormatException()
        
        // Se a conversão for bem-sucedida, exibe o número digitado
        println("Número digitado: $numero")
        
    } catch (e: NumberFormatException) {
        // Captura a exceção NumberFormatException
        // Exibe uma mensagem informando que o valor digitado é inválido
        println("O valor digitado é inválido.")
    }
}