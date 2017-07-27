package CRITonala;
import clases.conectar;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void log(){
        FileWriter archivo = null;
        PrintWriter pw = null;
        String usuario = txtuser.getText();
        try{
            Calendar fechaActual = Calendar.getInstance();
            archivo = new FileWriter("src/log/log.txt",true);
            pw = new PrintWriter(archivo);
                pw.println(usuario + ":"+(String.valueOf(fechaActual.get(Calendar.DAY_OF_MONTH))
                  +"/"+String.valueOf(fechaActual.get(Calendar.MONTH)+1)
                  +"/"+String.valueOf(fechaActual.get(Calendar.YEAR))
                  +";"+String.valueOf(fechaActual.get(Calendar.HOUR_OF_DAY))
                  +":"+String.valueOf(fechaActual.get(Calendar.MINUTE))
                  +":"+String.valueOf(fechaActual.get(Calendar.SECOND))));
            }catch(Exception e){
                    e.printStackTrace();
                    }finally{
                            try{
                            if(null!=archivo)
                                archivo.close();
                            }catch (Exception e2){
                            e2.printStackTrace();
                }
            }
    }
    void acceder(String usu, String pass) throws SQLException{
        int cap =0;
        String sql="SELECT * FROM usuarios WHERE Usuario='"+usu+"' && Clave='"+pass+"'";
        try{
        Statement st = cn.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while(rs.next()){
            cap=rs.getInt("Nivel");
        }
        if(cap==2){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Bienvenido");
            ejercicios ejer = new ejercicios();
            ejer.setVisible(true);
            log();
        }
        if(cap != 2){
            JOptionPane.showMessageDialog(this, "No esta registrado");
        }
        }catch(SQLException ex){
        Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnlog = new javax.swing.JButton();
        lblbackg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lbluser.setText("Usuario:");

        lblpass.setText("Contraseña:");

        txtuser.setText("usuario");
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });

        txtpass.setText("jPasswordField1");
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        btnlog.setText("Iniciar sesion");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });
        btnlog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnlogKeyTyped(evt);
            }
        });

        lblbackg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpass, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txtuser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnlog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(lblbackg)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblbackg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
        txtuser.setText("");
    }//GEN-LAST:event_txtuserFocusGained

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        txtpass.setText("");
    }//GEN-LAST:event_txtpassFocusGained

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        if((txtpass.getText().isEmpty()) || txtuser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
        String usu=txtuser.getText();
        char[] pas= txtpass.getPassword();
        String pass = new String(pas);
        try {
            acceder(usu, pass);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnlogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlogKeyTyped
        //Ya nada no lo peles :'v
    }//GEN-LAST:event_btnlogKeyTyped

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        char t = evt.getKeyChar();
        if(t == KeyEvent.VK_ENTER)
        {
            if((txtpass.getText().isEmpty()) || txtuser.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Campos vacios");
            }
            else
            {
                String usu=txtuser.getText();
                char[] pas= txtpass.getPassword();
                String pass = new String(pas);
                try
                {
                    acceder(usu, pass);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtpassKeyTyped

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        char t = evt.getKeyChar();
        if(t == KeyEvent.VK_ENTER)
        {
            if((txtpass.getText().isEmpty()) || txtuser.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Campos vacios");
            }
            else
            {
                String usu=txtuser.getText();
                char[] pas= txtpass.getPassword();
                String pass = new String(pas);
                try
                {
                    acceder(usu, pass);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtuserKeyTyped
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblbackg;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
