//Exercicio 05
// Crie uma classe base Animal com os atributos nome e idade. 
//Crie uma subclasse Cachorro que herde de Animal e adicione um atributo raca. 
//Implemente um método latir na classe Cachorro. 
//Crie um objeto Cachorro e chame os métodos latir e mostrarInformacoes (herdado de Animal).

// Nome Integrantes: Lucas Coelho e Luciana Wessner


// Subclasse Cachorro que herda da classe Animal
class Cachorro(nome: String, idade: Int, val raca: String) : Animal(nome, idade) {
    
    // Método específico da classe Cachorro
    fun latir() {
        // Imprime uma mensagem indicando que o cachorro está latindo
        println("O cachorro está latindo!")
    }
}
