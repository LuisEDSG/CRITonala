package ejertrab;
public class ejtrab1 extends javax.swing.JInternalFrame {
    public ejtrab1() {
        initComponents();
        lbluch1.setVisible(false);
        lblch1.setVisible(false);
        lbluch2.setVisible(false);
        lblch2.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1365, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        txt1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, 40));

        txt2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 100, 40));

        txt3.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, 40));

        txt4.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jPanel1.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 90, 40));

        txt5.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jPanel1.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 100, 50));

        txt6.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jPanel1.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 110, 50));

        txt7.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jPanel1.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 110, 40));

        txt8.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jPanel1.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 120, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("En tres               trastos de trigo, \nTres tristes                 comían trigo; \n              trigo, tres tristes tigres, \nEn tres tristes trastos de ");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 440, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Pablito          un            , \nUn clavito clavó             , \n¿Qué            de clavito \nClavó Pablito?");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 490, 300));

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jButton2.setText("Comprobar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabalenguas/tres.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabalenguas/tigre.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabalenguas/trigo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabalenguas/triste.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabalenguas/pablito.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String e1=txt1.getText();
        String e2=txt2.getText();
        String e3=txt3.getText();
        String e4=txt4.getText();
        if(e1.equals("tristes") || e1.equals("Tristes")) {
           txt1.setEditable(false);
                if(e2.equals("tigres") || e2.equals("Tigres")) {
                    txt2.setEditable(false);
                }
                if(e3.equals("comian") || e3.equals("Comian")) {
                    txt3.setEditable(false);
                }
                if(e4.equals("trigo") || e4.equals("Trigo")) {
                    txt4.setEditable(false);
                }
        }
        else{
           lbluch1.setVisible(true);
        }
        if((e1.equals("tristes") || e1.equals("Tristes")) && (e2.equals("tigres") || e2.equals("Tigres")) && (e3.equals("comian") || e3.equals("Comian")) && (e4.equals("trigo") || e4.equals("Trigo"))){
           lblch1.setVisible(true);
           lbluch1.setVisible(false);
        }
        else{
           lbluch1.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String e5=txt5.getText();
        String e6=txt6.getText();
        String e7=txt7.getText();
        String e8=txt8.getText();
        if(e5.equals("clavo") || e5.equals("Clavo")) {
           txt1.setEditable(false);
                if(e6.equals("clavito") || e6.equals("Clavito")) {
                    txt2.setEditable(false);
                }
                if(e7.equals("pablito") || e7.equals("Pablito")) {
                    txt3.setEditable(false);
                }
                if(e8.equals("clase") || e8.equals("Clase")) {
                    txt4.setEditable(false);
                }
        }
        else{
           lbluch1.setVisible(true);
        }
        if((e5.equals("clavo") || e5.equals("Clavo")) && (e6.equals("clavito") || e6.equals("Clavito")) && (e7.equals("pablito") || e7.equals("Pablito")) && (e8.equals("clase") || e8.equals("Clase"))){
           lblch1.setVisible(true);
           lbluch1.setVisible(false);
        }
        else{
           lbluch1.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables
}
