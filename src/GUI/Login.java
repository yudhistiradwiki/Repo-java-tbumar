/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {
    Connection conn;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        passTF = new javax.swing.JPasswordField();
        aksesCB = new javax.swing.JComboBox<>();
        loginBT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Aplikasi | TB Umar Jaya");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Password ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Hak Akses");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        nameTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 240, 30));

        passTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 240, 30));

        aksesCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        aksesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemilik", "Kasir", "Persediaan" }));
        aksesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aksesCBActionPerformed(evt);
            }
        });
        jPanel1.add(aksesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 240, 30));

        loginBT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loginBT.setText("Login");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });
        jPanel1.add(loginBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 120, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 110, 30));

        jPanel2.setBackground(java.awt.Color.red);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN APLIKASI TB. UMAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
        // TODO add your handling code here:
        String u_nama = null;
        if(nameTF.getText().equals("") || passTF.getText().equals("")|| aksesCB.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi inputan login","Pesan",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                setKoneksi();
                String sql="select * from tbuser where username='"+nameTF.getText()
                +"' and password='"+passTF.getText()+"'and hakakses='"+aksesCB.getSelectedItem()+"'";
                ResultSet rs=st.executeQuery(sql);
                if (rs.next()) {
                    u_nama = rs.getString("nama");
                }
                rs.last();
                if(rs.getRow()>=1){
                    Login.setU_nama(u_nama);
                    if(aksesCB.getSelectedItem().equals("Pemilik")){
                        MenuUtama MU=new MenuUtama();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksesPemilik();
                        dispose();
                    }else if(aksesCB.getSelectedItem().equals("Kasir")){
                        MenuUtama MU=new MenuUtama();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksesKasir();
                        dispose();
                    }else if(aksesCB.getSelectedItem().equals("Persediaan")){
                        MenuUtama MU=new MenuUtama();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksesPersediaan();
                        dispose();
                    }
                }else if(rs.getRow()==0){
                    JOptionPane.showMessageDialog(null,"Username, password atau hak akses tidak sesuai","TB. Umar", JOptionPane.WARNING_MESSAGE);
                    nameTF.grabFocus();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_loginBTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon("src/gambar/kredit.png");
        setIconImage(img.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        aksesCB.setSelectedItem(null);
    }//GEN-LAST:event_formWindowOpened

    private void aksesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aksesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aksesCBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aksesCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBT;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passTF;
    // End of variables declaration//GEN-END:variables

public Connection setKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/db_tb_umar","root","");
            st=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal :" +e);
        }
       return conn; 
    }


private static String u_nama;
    
    public static String getU_nama() {
        return u_nama;
    }

    public static void setU_nama(String u_nama) {
        Login.u_nama = u_nama;
    } 

}
