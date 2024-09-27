//Exercicio 05
// Crie uma classe base Animal com os atributos nome e idade. 
//Crie uma subclasse Cachorro que herde de Animal e adicione um atributo raca. 
//Implemente um método latir na classe Cachorro. 
//Crie um objeto Cachorro e chame os métodos latir e mostrarInformacoes (herdado de Animal).

// Nome Integrantes: Lucas Coelho e Luciana Wessner


// Classe base Animal, que pode ser estendida por outras classes
open class Animal(val nome: String, val idade: Int) {
    
    // Método para mostrar as informações do animal
    fun mostrarInformacoes() {
        // Imprime o nome e a idade do animal
        println("Nome: $nome, Idade: $idade")
    }
}
