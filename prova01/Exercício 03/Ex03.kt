//Exercicio 03
// Escreva um programa que calcule a soma dos números pares de 1 a 100 utilizando um loop for.

// Nome Integrantes: Lucas Coelho e Luciana Wessner

fun main() {
    // Inicializa uma variável para armazenar a soma dos números pares
    var soma = 0

    // Inicia um loop 'for' que itera de 1 até 100 (inclusive)
    for (i in 1..100) {
        // Verifica se o número atual (i) é par
        if (i % 2 == 0) {
            // Se for par, adiciona o número à soma
            soma += i
        }
    }
    
    // Exibe o resultado da soma dos números pares
    println("A soma dos números pares de 1 a 10 é: $soma")
}