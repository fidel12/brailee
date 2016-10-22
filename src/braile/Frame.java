package braile;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Frame extends javax.swing.JFrame {

    int b = 0;
    ArrayList<String> variable = new ArrayList<>();

    public Frame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextraduc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        letra1 = new javax.swing.JLabel();
        Babrir = new javax.swing.JButton();
        letra2 = new javax.swing.JLabel();
        letra3 = new javax.swing.JLabel();
        letra4 = new javax.swing.JLabel();
        letra5 = new javax.swing.JLabel();
        letra6 = new javax.swing.JLabel();
        letra7 = new javax.swing.JLabel();
        letra8 = new javax.swing.JLabel();
        letra9 = new javax.swing.JLabel();
        letra10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextraduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextraducKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 24)); // NOI18N
        jLabel1.setText("Texto a traducir");

        letra1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Babrir.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 18)); // NOI18N
        Babrir.setText("ABRIR TRADUCCION");
        Babrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabrirActionPerformed(evt);
            }
        });

        letra2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letra10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextraduc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Babrir)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Babrir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextraduc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextraducKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextraducKeyReleased
        if (jTextraduc.getText().isEmpty()) {
            limpiar();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                if (b == 1) {
                    letra1.setIcon(null);
                }
                if (b == 2) {
                    letra2.setIcon(null);
                }
                if (b == 3) {
                    letra3.setIcon(null);
                }
                if (b == 4) {
                    letra4.setIcon(null);
                }
                if (b == 5) {
                    letra5.setIcon(null);
                }
                if (b == 6) {
                    letra6.setIcon(null);
                }
                if (b == 7) {
                    letra7.setIcon(null);
                }
                if (b == 8) {
                    letra8.setIcon(null);
                }
                if (b == 9) {
                    letra9.setIcon(null);
                }
                if (b == 10) {
                    letra10.setIcon(null);
                }
                variable.remove(variable.size() - 1);
                b--;
            } else {
                if (jTextraduc.getText().endsWith(" ")) {
                    b++;
                    variable.add(" ");
                } else {
                    try {
                        if (b >= 10) {
                            limpiar();
                        }
                        b++;
                        String a = jTextraduc.getText().substring(jTextraduc.getText().length() - 1);
                        variable.add(a);
                        imagen(a, b);
                    } catch (Exception e) {
                        System.out.println("Error " + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextraducKeyReleased

    private void BabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabrirActionPerformed
        JFileChooser Seleccionar_Archivo;
        Seleccionar_Archivo = new JFileChooser();
        int opcion = Seleccionar_Archivo.showSaveDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                File f;
                String cad = "";
                f = new File(Seleccionar_Archivo.getSelectedFile()+".html");
                //Escritura
                try {

                    FileWriter w = new FileWriter(f);
                    try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {
                        wr.append("<HTML>"
                                + "	<HEAD>"
                                + "           <TITLE>Traducci&oacute;n a Braile</TITLE>"
                                + "	</HEAD>"
                                + "	<BODY>"
                                + "           <H2>");
                        
                        for (String variable1 : variable) {
                            InterfaceBraile Traductor = new Traductor(variable1);
                            Traductor.imp();
                            
                            if (variable1.equals(" ")) {
                                wr.append("&ensp;");
                            }
                            if (variable1.equals("a")) {
                                wr.append("&#10241;");
                            }
                            if (variable1.equals("b")) {
                                wr.append("&#10243;");
                            }
                            if (variable1.equals("c")) {
                                wr.append("&#10249;");
                            }
                            if (variable1.equals("d")) {
                                wr.append("&#10265;");
                            }
                            if (variable1.equals("e")) {
                                wr.append("&#10257;");
                            }
                            if (variable1.equals("f")) {
                                wr.append("&#10251;");
                            }
                            if (variable1.equals("g")) {
                                wr.append("&#10267;");
                            }
                            if (variable1.equals("h")) {
                                wr.append("&#10259;");
                            }
                            if (variable1.equals("i")) {
                                wr.append("&#10250;");
                            }
                            if (variable1.equals("j")) {
                                wr.append("&#10266;");
                            }
                            if (variable1.equals("k")) {
                                wr.append("&#10245;");
                            }
                            if (variable1.equals("l")) {
                                wr.append("&#10247;");
                            }
                            if (variable1.equals("m")) {
                                wr.append("&#10253;");
                            }
                            if (variable1.equals("n")) {
                                wr.append("&#10269;");
                            }
                            if (variable1.equals("o")) {
                                wr.append("&#10261;");
                            }
                            if (variable1.equals("p")) {
                                wr.append("&#10255;");
                            }
                            if (variable1.equals("q")) {
                                wr.append("&#10271;");
                            }
                            if (variable1.equals("r")) {
                                wr.append("&#10263;");
                            }
                            if (variable1.equals("s")) {
                                wr.append("&#10254;");
                            }
                            if (variable1.equals("t")) {
                                wr.append("&#10270;");
                            }
                            if (variable1.equals("u")) {
                                wr.append("&#10277;");
                            }
                            if (variable1.equals("v")) {
                                wr.append("&#10279;");
                            }
                            if (variable1.equals("w")) {
                                wr.append("&#10298;");
                            }
                            if (variable1.equals("x")) {
                                wr.append("&#10285;");
                            }
                            if (variable1.equals("y")) {
                                wr.append("&#10301;");
                            }
                            if (variable1.equals("z")) {
                                wr.append("&#10293;");
                            }
                            cad += variable1 + "&ensp;";
                            
                        }
                        wr.append("</H2> <H3>" + cad + "</H3> "
                                + "     </BODY>"
                                + "</HTML>");
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "Desea Abrir el documento", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (respuesta == YES_NO_OPTION) {
                try {
                    File path = new File(Seleccionar_Archivo.getSelectedFile() + ".html");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }


    }//GEN-LAST:event_BabrirActionPerformed

    public void imagen(String a, int b) {
        ImageIcon img = new ImageIcon("src/img/" + a + ".png");
        System.out.println(b);
        if (b == 1) {
            letra1.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra1.getWidth(), letra1.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 2) {
            letra2.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra2.getWidth(), letra2.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 3) {
            letra3.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra3.getWidth(), letra3.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 4) {
            letra4.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra4.getWidth(), letra4.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 5) {
            letra5.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra5.getWidth(), letra5.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 6) {
            letra6.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra6.getWidth(), letra6.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 7) {
            letra7.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra7.getWidth(), letra7.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 8) {
            letra8.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra8.getWidth(), letra8.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 9) {
            letra9.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra9.getWidth(), letra9.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 10) {
            letra10.setIcon(new ImageIcon(img.getImage().getScaledInstance(letra10.getWidth(), letra10.getHeight(), Image.SCALE_SMOOTH)));
        }

    }

    public void limpiar() {
        letra1.setIcon(null);
        letra2.setIcon(null);
        letra3.setIcon(null);
        letra4.setIcon(null);
        letra5.setIcon(null);
        letra6.setIcon(null);
        letra7.setIcon(null);
        letra8.setIcon(null);
        letra9.setIcon(null);
        letra10.setIcon(null);
        b = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Babrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextraduc;
    private javax.swing.JLabel letra1;
    private javax.swing.JLabel letra10;
    private javax.swing.JLabel letra2;
    private javax.swing.JLabel letra3;
    private javax.swing.JLabel letra4;
    private javax.swing.JLabel letra5;
    private javax.swing.JLabel letra6;
    private javax.swing.JLabel letra7;
    private javax.swing.JLabel letra8;
    private javax.swing.JLabel letra9;
    // End of variables declaration//GEN-END:variables
}
