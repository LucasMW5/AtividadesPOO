package Exercícios02.Questao2;

public class App2 {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3500);
        produto.repor(10);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque());

        produto.vender(3);

        System.out.println("Estoque depois da venda: " + produto.getEstoque());

        produto.repor(5);

        System.out.println("Estoque depois da reposição: " + produto.getEstoque());

        produto.setPreco(-100);

        System.out.println("Preço atual: " + produto.getPreco());
    }
}
