//Exercicio 04
// Crie uma classe Pessoa com os atributos nome, idade e cidade. 
//Implemente um método mostrarInformacoes que exiba todas as informações da pessoa. 
//Crie um objeto Pessoa e chame o método mostrarInformacoes.

// Nome Integrantes: Lucas Coelho e Luciana Wessner

// Definindo a classe Pessoa
class Pessoa(val nome: String, val idade: Int, val cidade: String) {
    
    // Método que exibe as informações da pessoa
    fun mostrarInformacoes() {
        // Imprime os atributos da pessoa formatados
        println("Nome: $nome, Idade: $idade, Cidade: $cidade")
    }
}
