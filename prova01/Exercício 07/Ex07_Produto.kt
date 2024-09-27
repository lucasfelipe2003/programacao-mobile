//Exercicio 07
// Crie uma classe Produto com os atributos nome, preco e quantidade. 
//Crie uma lista com 10 objetos Produto. Ordene a lista de produtos por:
//Preço em ordem crescente
//Nome em ordem alfabética
//Quantidade em ordem decrescente

// Nome Integrantes: Lucas Coelho e Luciana Wessner


fun main() {
    // Criação de uma lista com 10 objetos Produto com novos nomes
    val produtos = listOf(
        Produto("Camiseta Estampada", 10.0, 5),
        Produto("Calça Jeans", 20.0, 3),
        Produto("Tênis Esportivo", 15.0, 10),
        Produto("Boné de Algodão", 7.0, 8),
        Produto("Relógio Digital", 25.0, 1),
        Produto("Mochila Escolar", 9.0, 6),
        Produto("Jaqueta de Couro", 12.0, 4),
        Produto("Sunglasses Polarizados", 30.0, 2),
        Produto("Cinto de Couro", 5.0, 7),
        Produto("Cachecol de Lã", 18.0, 9)
    )

    // Ordenando a lista de produtos por preço em ordem crescente
    val ordenadoPorPreco = produtos.sortedBy { it.preco }
    
    // Ordenando a lista de produtos por nome em ordem alfabética
    val ordenadoPorNome = produtos.sortedBy { it.nome }
    
    // Ordenando a lista de produtos por quantidade em ordem decrescente
    val ordenadoPorQuantidade = produtos.sortedByDescending { it.quantidade }

    // Exibindo os resultados da ordenação
    println("Ordenado por preço crescente: $ordenadoPorPreco")
    println("Ordenado por nome alfabético: $ordenadoPorNome")
    println("Ordenado por quantidade decrescente: $ordenadoPorQuantidade")
}