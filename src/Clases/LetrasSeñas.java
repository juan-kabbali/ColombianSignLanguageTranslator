package Clases;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class LetrasSeñas extends javax.swing.JFrame {


    LinkedList<String> salida = new LinkedList();


    public LetrasSeñas() {

        try {
            this.setIconImage(ImageIO.read(new File("Imagenes/Logo.png")));
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.setSize(900, 750);
        setResizable(false);

        getContentPane().setBackground(new java.awt.Color(240, 255, 255));

        pack();


    }


    public String salidaImpresion() {
        String cad = "";
        for (String e : salida) {
            cad += "" + e.toString();
        }
        return cad + "";
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jLabel3.setText("-");

        jLabel2.setText("Traduccion:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRADUCTOR DGX");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Señas Colombianas", 0, 48)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2))
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Menu m1 = new Menu();
        m1.setVisible(true);
        this.setVisible(false);
        salida.clear();
        this.jTextPane1.setText(salidaImpresion());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped


    }//GEN-LAST:event_formKeyTyped

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped

        char letra = evt.getKeyChar();


        switch (letra) {

            case KeyEvent.VK_ENTER:

                enter();
                break;
            case KeyEvent.VK_BACK_SPACE:
                borrar();
                break;

            case KeyEvent.VK_0:
                m0();
                break;
            case KeyEvent.VK_1:
                m1();
                break;
            case KeyEvent.VK_2:
                m2();
                break;
            case KeyEvent.VK_3:
                m3();
                break;
            case KeyEvent.VK_4:
                m4();
                break;
            case KeyEvent.VK_5:
                m5();
                break;
            case KeyEvent.VK_6:
                m6();
                break;
            case KeyEvent.VK_7:
                m7();
                break;
            case KeyEvent.VK_8:
                m8();
                break;
            case KeyEvent.VK_9:
                m9();
                break;

            case 'a':
                a();
                break;
            case 'b':
                b();
                break;
            case 'c':
                c();
                break;
            case 'd':
                d();
                break;

            case 'e':
                e();
                break;

            case 'f':
                f();
                break;

            case 'g':
                g();
                break;

            case 'h':
                h();
                break;

            case 'i':
                i();
                break;

            case 'j':
                j();
                break;

            case 'k':
                k();
                break;

            case 'l':
                l();
                break;

            case 'm':
                m();
                break;

            case 'n':
                n();
                break;

            case 'ñ':
                ñ();
                break;

            case 'o':
                o();
                break;

            case 'p':
                p();
                break;

            case 'q':
                q();
                break;

            case 'r':
                r();
                break;

            case 's':
                s();
                break;

            case 't':
                t();
                break;

            case 'u':
                u();
                break;

            case 'v':
                v();
                break;

            case 'x':
                x();
                break;

            case 'y':
                y();
                break;

            case 'z':
                z();
                break;

            case 'w':
                w();
                break;

            case ' ':
                espacio();
                break;

        }


    }//GEN-LAST:event_jTextArea1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private void espacio() {

        salida.add(" ");
        this.jTextPane1.setText(salidaImpresion());

    }

    private void a() {

        salida.add("a");
        this.jTextPane1.setText(salidaImpresion());

    }

    private void b() {

        salida.add("b");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void c() {

        salida.add("c");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void d() {

        salida.add("d");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void e() {

        salida.add("e");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void f() {

        salida.add("f");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void g() {

        salida.add("g");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void h() {

        salida.add("h");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void i() {

        salida.add("i");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void j() {

        salida.add("j");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void k() {

        salida.add("k");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void l() {

        salida.add("l");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m() {

        salida.add("m");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void n() {

        salida.add("n");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void ñ() {

        salida.add("ñ");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void o() {

        salida.add("o");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void p() {

        salida.add("p");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void q() {

        salida.add("q");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void r() {

        salida.add("r");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void s() {

        salida.add("s");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void t() {

        salida.add("t");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void u() {

        salida.add("u");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void v() {

        salida.add("v");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void w() {

        salida.add("w");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void x() {

        salida.add("x");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void y() {

        salida.add("y");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void z() {

        salida.add("z");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m0() {

        salida.add("0");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m1() {

        salida.add("1");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m2() {

        salida.add("2");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m3() {

        salida.add("3");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m4() {

        salida.add("4");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m5() {

        salida.add("5");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m6() {

        salida.add("6");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m7() {

        salida.add("7");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m8() {

        salida.add("8");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void m9() {

        salida.add("9");
        this.jTextPane1.setText(salidaImpresion());
    }

    private void borrar() {

        if (salida.isEmpty() == true) {
        } else {
            salida.removeLast();
            this.jTextPane1.setText(salidaImpresion());

        }
    }

    private void enter() {

        salida.addLast("\n");
        this.jTextPane1.setText(salidaImpresion());
    }

}
