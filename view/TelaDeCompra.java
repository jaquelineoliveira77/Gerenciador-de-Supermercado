package view;

import classes.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaqueline Oliveira
 */
public class TelaDeCompra extends javax.swing.JFrame {

    private ArrayList<Produto> listaDeProdutos;
    TelaNotaFiscal notaFiscal;

    public TelaDeCompra() {
        initComponents();

    }

    public TelaDeCompra(ArrayList<Produto> produtos) {
        initComponents();

    }

    //trazendo a lista de produtos cadastrados para a tela de compra através do construtor
    public TelaDeCompra(String nome, String cpf, ArrayList<Produto> produtosCadastrados) {
        initComponents();

        //criando a tela de nota Fiscal
        notaFiscal = new TelaNotaFiscal(nome, cpf, listaDeProdutos);

        listaDeProdutos = produtosCadastrados;
        //a lista de produtos vai receber a lista de produtos cadastrados

        for (int i = 0; i < listaDeProdutos.size(); i++) {

            //adicionando os produtos cadastrados no comboBox
            jComboBox1_Produtos.addItem(listaDeProdutos.get(i).getDescricao());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1_produtos = new javax.swing.JLabel();
        jButton1_notaFiscal = new javax.swing.JButton();
        jButton1_remover = new javax.swing.JButton();
        jLabel4_ = new javax.swing.JLabel();
        jLabel4_total = new javax.swing.JLabel();
        jButton1_Comprar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1_Carrinho = new javax.swing.JComboBox<>();
        jButton1_MostrarInformacoes = new javax.swing.JButton();
        jComboBox1_Produtos = new javax.swing.JComboBox<>();
        jLabel1_menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Compra");
        setLocation(new java.awt.Point(300, 250));

        jLabel1_produtos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_produtos.setText("Produtos");

        jButton1_notaFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tab_go.png"))); // NOI18N
        jButton1_notaFiscal.setText("Nota Fiscal");
        jButton1_notaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_notaFiscalActionPerformed(evt);
            }
        });

        jButton1_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/cross.png"))); // NOI18N
        jButton1_remover.setText("Remover");
        jButton1_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_removerActionPerformed(evt);
            }
        });

        jLabel4_.setText("Total:");

        jLabel4_total.setText("jLabel4");

        jButton1_Comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tick.png"))); // NOI18N
        jButton1_Comprar.setText("Comprar");
        jButton1_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ComprarActionPerformed(evt);
            }
        });

        jLabel3.setText("Carrinho");

        jButton1_MostrarInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/shape_square_go.png"))); // NOI18N
        jButton1_MostrarInformacoes.setText("Informações");
        jButton1_MostrarInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_MostrarInformacoesActionPerformed(evt);
            }
        });

        jComboBox1_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_ProdutosActionPerformed(evt);
            }
        });

        jLabel1_menu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/produt.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1_notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton1_MostrarInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jComboBox1_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4_total, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jComboBox1_Carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1_notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1_MostrarInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jComboBox1_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel4_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel4_total))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jComboBox1_Carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_ProdutosActionPerformed

    }//GEN-LAST:event_jComboBox1_ProdutosActionPerformed

    private void jButton1_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ComprarActionPerformed

        double totalAPagar = 0;

        String descricao = jComboBox1_Produtos.getSelectedItem().toString();

        jComboBox1_Carrinho.addItem(descricao);

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            jComboBox1_Carrinho.getComponents();
            totalAPagar = totalAPagar + listaDeProdutos.get(i).getPreco();

        }

        jLabel4_total.setText(String.valueOf(totalAPagar));


    }//GEN-LAST:event_jButton1_ComprarActionPerformed

    private void jButton1_MostrarInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_MostrarInformacoesActionPerformed

        String nomeDescricao = jComboBox1_Produtos.getSelectedItem().toString();

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i).getDescricao().equals(nomeDescricao)) {
                
                InformacoesProdutos informacoesProdutos = new InformacoesProdutos(listaDeProdutos.get(i));
                informacoesProdutos.setVisible(true);
            }
        }

    }//GEN-LAST:event_jButton1_MostrarInformacoesActionPerformed

    private void jButton1_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_removerActionPerformed

        switch (JOptionPane.showConfirmDialog(this, "Tem certeza disso?")) {
            case 0: //sim
                String nomeProduto = jComboBox1_Carrinho.getSelectedItem().toString();

                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getDescricao().equals(nomeProduto)) {
                        listaDeProdutos.remove(i);
                        jComboBox1_Carrinho.removeItemAt(i);

                        if (listaDeProdutos.size() == 0) {
                            this.dispose();
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                break;
        }

    }//GEN-LAST:event_jButton1_removerActionPerformed

    private void jButton1_notaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_notaFiscalActionPerformed

        for (int i = 0; i < listaDeProdutos.size(); i++) {

            //chamando a tela nota Fiscal
            notaFiscal.setVisible(true);

        }


    }//GEN-LAST:event_jButton1_notaFiscalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Comprar;
    private javax.swing.JButton jButton1_MostrarInformacoes;
    private javax.swing.JButton jButton1_notaFiscal;
    private javax.swing.JButton jButton1_remover;
    private javax.swing.JComboBox<String> jComboBox1_Carrinho;
    private javax.swing.JComboBox<String> jComboBox1_Produtos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_menu;
    private javax.swing.JLabel jLabel1_produtos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_;
    private javax.swing.JLabel jLabel4_total;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
