package classes;

import java.util.ArrayList;

/**
 *
 * @author Jaqueline Oliveira
 */
public class SuperMercado {

    ArrayList<Produto> produtosCadastrados;

    public SuperMercado() {

        this.produtosCadastrados = new ArrayList();
    }

    public SuperMercado(ArrayList<Produto> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    public void addProduto(Produto p) {

        this.produtosCadastrados.add(p);

    }

    public void removerProduto(int codigo) {

        for (int i = 0; i < produtosCadastrados.size(); i++) {

            if (produtosCadastrados.get(i).getCodigo() == codigo) {
                produtosCadastrados.remove(i);

                System.out.println("Produto foi removido! ");
            }

        }

    }

    public Produto editarProduto(int codigo, String novaDescricao, double novoPreco) {

         
        
        return null;

    }

    @Override
    public String toString() {
        return "SuperMercado{" + "produtosCadastrados=" + produtosCadastrados + '}';
    }


}
