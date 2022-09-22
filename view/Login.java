package view;

import classes.Produto;
import classes.SuperMercado;

import classes.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Login extends javax.swing.JFrame {

     public static SuperMercado superMercado;
     public static Produto produto;
    
    private ArrayList produtosCadastrados;
   
    public Login() {
        initComponents();
        this.produtosCadastrados = new ArrayList();
        
        //criando uma lista vazia
    }
    
   
    public Login(ArrayList<Produto> produtos) {
        initComponents();
        this.produtosCadastrados = produtos;
    }

    public void limparCampos() {

        jTextField2_Nome.setText("");
        jTextField2_cpf.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1_administrador = new javax.swing.JCheckBox();
        jButton2_Entrar = new javax.swing.JButton();
        jTextField2_cpf = new javax.swing.JTextField();
        jTextField2_Nome = new javax.swing.JTextField();
        jLabel1_cpf = new javax.swing.JLabel();
        jLabel1_nome = new javax.swing.JLabel();
        jLabel2_fundo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificação do Usuário");
        setExtendedState(300);
        setLocation(new java.awt.Point(380, 250));
        setMaximizedBounds(new java.awt.Rectangle(300, 300, 300, 300));

        jCheckBox1_administrador.setText("Administrador");

        jButton2_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tick.png"))); // NOI18N
        jButton2_Entrar.setText("Entrar");
        jButton2_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_EntrarActionPerformed(evt);
            }
        });

        jTextField2_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_cpfActionPerformed(evt);
            }
        });

        jTextField2_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_NomeActionPerformed(evt);
            }
        });

        jLabel1_cpf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1_cpf.setText("Cpf");

        jLabel1_nome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1_nome.setText("Nome");

        jLabel2_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/login.jpeg"))); // NOI18N
        jLabel2_fundo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jCheckBox1_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton2_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField2_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField2_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jCheckBox1_administrador)
                .addGap(10, 10, 10)
                .addComponent(jButton2_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jTextField2_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jTextField2_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_cpfActionPerformed

    private void jTextField2_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_NomeActionPerformed

    }//GEN-LAST:event_jTextField2_NomeActionPerformed

    private void jButton2_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_EntrarActionPerformed

        String nome = jTextField2_Nome.getText();
        String cpf = jTextField2_cpf.getText();

        Usuario usuario = new Usuario(nome, cpf);
        

        if (jCheckBox1_administrador.isSelected()) {

            this.dispose();
            CadastroProdutos cadastroProdutos = new CadastroProdutos(produtosCadastrados);
            cadastroProdutos.setVisible(true);

        } else {

            this.dispose();
            TelaDeCompra telaDeCompra = new TelaDeCompra(usuario.getNome(), usuario.getCpf(), produtosCadastrados);
            telaDeCompra.setVisible(true);
        }

        limparCampos();
    }//GEN-LAST:event_jButton2_EntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_Entrar;
    private javax.swing.JCheckBox jCheckBox1_administrador;
    private javax.swing.JLabel jLabel1_cpf;
    private javax.swing.JLabel jLabel1_nome;
    private javax.swing.JLabel jLabel2_fundo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2_Nome;
    private javax.swing.JTextField jTextField2_cpf;
    // End of variables declaration//GEN-END:variables

}
