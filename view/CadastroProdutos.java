package view;

import classes.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaqueline Oliveira
 */
public class CadastroProdutos extends javax.swing.JFrame {

    ArrayList<Produto> produtosCadastrados;

    public CadastroProdutos(ArrayList<Produto> produtos) {
        initComponents();
        produtosCadastrados = produtos;

    }

    public CadastroProdutos(String nome, String cpf, ArrayList produtosCadastrados) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2_remover = new javax.swing.JButton();
        jButton1_cadastro = new javax.swing.JButton();
        jLabel1_codigo = new javax.swing.JLabel();
        jTextField1_descricao = new javax.swing.JTextField();
        jTextField1_codigo = new javax.swing.JTextField();
        jLabel1_descricao = new javax.swing.JLabel();
        jTextField1_preco = new javax.swing.JTextField();
        jButton1_Informacoes = new javax.swing.JButton();
        jComboBox1_ProdutosCadastrados = new javax.swing.JComboBox<>();
        jButton1_TrocarUsuario = new javax.swing.JButton();
        jLabel1_produtos = new javax.swing.JLabel();
        jButton4_editar = new javax.swing.JButton();
        jButton3_vizualizar = new javax.swing.JButton();
        jLabel1_preco = new javax.swing.JLabel();
        jLabel1_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setLocation(new java.awt.Point(300, 250));

        jButton2_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/cross.png"))); // NOI18N
        jButton2_remover.setText("Remover");
        jButton2_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_removerActionPerformed(evt);
            }
        });

        jButton1_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tick.png"))); // NOI18N
        jButton1_cadastro.setText("Cadastrar");
        jButton1_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastroActionPerformed(evt);
            }
        });

        jLabel1_codigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_codigo.setText("Código");

        jLabel1_descricao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_descricao.setText("Descrição");

        jTextField1_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_precoActionPerformed(evt);
            }
        });

        jButton1_Informacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/magnifier.png"))); // NOI18N
        jButton1_Informacoes.setText("Informações");
        jButton1_Informacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_InformacoesActionPerformed(evt);
            }
        });

        jButton1_TrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/newspaper_go.png"))); // NOI18N
        jButton1_TrocarUsuario.setText("Trocar Usuário");
        jButton1_TrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_TrocarUsuarioActionPerformed(evt);
            }
        });

        jLabel1_produtos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_produtos.setText("Produtos Cadastrados");

        jButton4_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/shape_square_go.png"))); // NOI18N
        jButton4_editar.setText("Editar");
        jButton4_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_editarActionPerformed(evt);
            }
        });

        jButton3_vizualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/magnifier.png"))); // NOI18N
        jButton3_vizualizar.setText("Vizualizar");
        jButton3_vizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_vizualizarActionPerformed(evt);
            }
        });

        jLabel1_preco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_preco.setText("Preço");

        jLabel1_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/produtos.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton2_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton4_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton1_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1_Informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton1_TrocarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton3_vizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox1_ProdutosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton2_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton4_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField1_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jTextField1_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jButton1_Informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1_TrocarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton3_vizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jComboBox1_ProdutosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_precoActionPerformed

    private void jButton2_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_removerActionPerformed

        switch (JOptionPane.showConfirmDialog(this, "Tem certeza disso?")) {
            case 0: //sim
                String nomeProduto = jComboBox1_ProdutosCadastrados.getSelectedItem().toString();

                for (int i = 0; i < produtosCadastrados.size(); i++) {
                    if (produtosCadastrados.get(i).getDescricao().equals(nomeProduto)) {
                        produtosCadastrados.remove(i);
                        jComboBox1_ProdutosCadastrados.removeItemAt(i);

                        if (produtosCadastrados.size() == 0) {
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

    }//GEN-LAST:event_jButton2_removerActionPerformed

    private void jButton1_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastroActionPerformed
        int codigo = 0;
        String descricao = "";
        double preco = 0;

        codigo = Integer.parseInt(this.jTextField1_codigo.getText());
        descricao = this.jTextField1_descricao.getText();
        preco = Double.parseDouble(this.jTextField1_preco.getText());

        if (codigo != 0 && !descricao.equals("") && preco != 0) {

            Produto p = new Produto(codigo, descricao, preco);

            produtosCadastrados.add(p);

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

            jTextField1_codigo.setText("");
            jTextField1_descricao.setText("");
            jTextField1_preco.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1_cadastroActionPerformed

    private void jButton3_vizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_vizualizarActionPerformed

        if (produtosCadastrados.size() > 0) {
            for (int i = 0; i < produtosCadastrados.size(); i++) {

                //adicionando produtos ao comboBox
                jComboBox1_ProdutosCadastrados.addItem(produtosCadastrados.get(i).getDescricao());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe nenhum produto cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton3_vizualizarActionPerformed

    private void jButton4_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_editarActionPerformed
            
        

    }//GEN-LAST:event_jButton4_editarActionPerformed

    private void jButton1_TrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_TrocarUsuarioActionPerformed

        Login login = new Login(this.produtosCadastrados);
        login.setVisible(true);


    }//GEN-LAST:event_jButton1_TrocarUsuarioActionPerformed

    private void jButton1_InformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_InformacoesActionPerformed

        String nomeProduto = jComboBox1_ProdutosCadastrados.getSelectedItem().toString();

        for (int i = 0; i < produtosCadastrados.size(); i++) {
            if (produtosCadastrados.get(i).getDescricao().equals(nomeProduto)) {
                Informacoes informacoes = new Informacoes(produtosCadastrados.get(i));
                informacoes.setVisible(true);
            }
        }


    }//GEN-LAST:event_jButton1_InformacoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Informacoes;
    private javax.swing.JButton jButton1_TrocarUsuario;
    private javax.swing.JButton jButton1_cadastro;
    private javax.swing.JButton jButton2_remover;
    private javax.swing.JButton jButton3_vizualizar;
    private javax.swing.JButton jButton4_editar;
    private javax.swing.JComboBox<String> jComboBox1_ProdutosCadastrados;
    private javax.swing.JLabel jLabel1_codigo;
    private javax.swing.JLabel jLabel1_descricao;
    private javax.swing.JLabel jLabel1_fundo;
    private javax.swing.JLabel jLabel1_preco;
    private javax.swing.JLabel jLabel1_produtos;
    private javax.swing.JTextField jTextField1_codigo;
    private javax.swing.JTextField jTextField1_descricao;
    private javax.swing.JTextField jTextField1_preco;
    // End of variables declaration//GEN-END:variables

}
