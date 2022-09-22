package classes;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Produto {

    //Atributos
    private int codigo;
    private String descricao;
    private double preco;

    //Construtor
    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String descricao) {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String mostrarInformacoes() {
        return String.format(" Código = %d \n Descrição = %s  \n Preço = %f ",
                this.codigo, this.descricao, this.preco);

    }

    @Override
    public String toString() {
        return "\nProduto " + " Codigo = " + codigo + "\n" +
                " Descricao = " + descricao + "\n" +
                 " Preco = " + preco + "\n" ;
    }

}
