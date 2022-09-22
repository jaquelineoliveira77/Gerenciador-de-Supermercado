package view;

import classes.Produto;
import classes.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Jaqueline Oliveira
 */
public class TelaNotaFiscal extends javax.swing.JFrame {

    ArrayList<Produto> listaDeProdutos;

    public TelaNotaFiscal(String nome, String cpf, ArrayList<Produto> produtosCadastrados) {
        initComponents();

        listaDeProdutos = produtosCadastrados;

        jLabel1_nome.setText(nome);
        jLabel1_CPF.setText(cpf);
        
        

    }
    

    public TelaNotaFiscal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_produtosComprados = new javax.swing.JTextArea();
        jLabel3_ = new javax.swing.JLabel();
        jLabel2_TotalPago = new javax.swing.JLabel();
        jLabel1_CPF = new javax.swing.JLabel();
        jLabel1_T = new javax.swing.JLabel();
        jLabel1_ = new javax.swing.JLabel();
        jLabel1_nome = new javax.swing.JLabel();
        jButton1_sair = new javax.swing.JButton();
        jLabel1_titulo = new javax.swing.JLabel();
        jLabel1_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nota Fiscal");
        setLocation(new java.awt.Point(300, 250));

        jTextArea1_produtosComprados.setColumns(20);
        jTextArea1_produtosComprados.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_produtosComprados);

        jLabel3_.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3_.setText("Produtos Comprados:");

        jLabel2_TotalPago.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2_TotalPago.setText("jLabel2");

        jLabel1_CPF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_CPF.setText("jLabel1");

        jLabel1_T.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_T.setText("Total Pago:");

        jLabel1_.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1_.setText("CPF:");

        jLabel1_nome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_nome.setText("Nome");

        jButton1_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tab_go.png"))); // NOI18N
        jButton1_sair.setText("Voltar");
        jButton1_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_sairActionPerformed(evt);
            }
        });

        jLabel1_titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1_titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_titulo.setText("Nota Fiscal");

        jLabel1_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/nota.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_T, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_TotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButton1_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1_)
                .addGap(13, 13, 13)
                .addComponent(jLabel3_)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_T)
                    .addComponent(jLabel2_TotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1_CPF))
            .addComponent(jLabel1_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_sairActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_sair;
    private javax.swing.JLabel jLabel1_;
    private javax.swing.JLabel jLabel1_CPF;
    private javax.swing.JLabel jLabel1_T;
    private javax.swing.JLabel jLabel1_fundo;
    private javax.swing.JLabel jLabel1_nome;
    private javax.swing.JLabel jLabel1_titulo;
    private javax.swing.JLabel jLabel2_TotalPago;
    private javax.swing.JLabel jLabel3_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1_produtosComprados;
    // End of variables declaration//GEN-END:variables
}
