package classes;

import java.util.ArrayList;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Carrinho {

    private ArrayList<Produto> listaDeProdutos;

    public Carrinho(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void addProduto(Produto p) {

        this.listaDeProdutos.add(p);

    }

    public void removerProduto(int codigo) {

        for (int i = 0; i < listaDeProdutos.size(); i++) {

            if (listaDeProdutos.get(i).getCodigo() == codigo) {
                listaDeProdutos.remove(i);

            }

        }

    }

    public double totalAPagar() {

        double valorTotal = 0;

        //vai pegar o preco do produto na posição i
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            valorTotal = valorTotal + listaDeProdutos.get(i).getPreco();

        }
        return valorTotal;

    }

    @Override
    public String toString() {
        return "Carrinho{" + "listaDeProdutos=" + listaDeProdutos + '}';
    }

}
