
package javafuncx;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class fdX extends javax.swing.JFrame {

    /**
     * Creates new form fdX
     */
    public fdX() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jButton1.setText("Cartesiano");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("F(x) = 1/x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("F(x) = e power x");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("F(x)= sqrt N de x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("F(x) = log base n de X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Graphics show = jPanel1.getGraphics();
        show.setColor(Color.black);
        
          show.drawLine(0, 250, 500, 250);
          show.drawLine(250, 0, 250, 500);
          
        show.setColor(Color.LIGHT_GRAY);  
        
        show.drawLine(150, 0, 150, 500);
        show.drawLine(50, 0, 50, 500);
        show.drawLine(350, 0, 350, 500);
        show.drawLine(450, 0, 450, 500);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       function1();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        function2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        function3();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        function4();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void function1(){
        Graphics func = jPanel1.getGraphics();
        func.setColor(Color.blue);
        
        for (double x = -50; x <= 50; x+= 0.5) {
            if (x==0) continue;
            double y = (1 / x)*15;
            
            func.drawOval(247+(int)(x*15),247- (int)(y*15), 6, 6);
            
        }
    }
    
    public void function2(){
        Graphics func = jPanel1.getGraphics();
        func.setColor(Color.red);
        
        for (double x = -250; x <= 250; x+= 0.567) {
            double y = Math.pow(Math.E,x)*100;
            
            func.drawOval(247+(int)(x*50), 247-(int)y, 6, 6);    
        }
        
        
    }
    
    public void function3(){
        Graphics func = jPanel1.getGraphics();
        func.setColor(Color.green);
        
        String num = JOptionPane.showInputDialog(this, "enter you number: ");
        
        double nm = Double.parseDouble(num);
        
        
    for (double x = -250; x <= 250; x+=0.6) {
        double y;

        // Evita errores cuando nm es par y x es negativo
        if (nm % 2 == 0 && x < 0) {
            continue; // Salta la iteración si x es negativo y n es par
        } else {
            y = Math.pow(Math.abs(x), 1.0 / nm) * 50; // Aplicar escala
            if (x < 0 && nm % 2 != 0) {
                y = -y; // Manejo de raíces impares negativas
            }
        }
            
            func.drawOval(247 +(int)(x*20), 247-(int)y, 6, 6);
            
            
        }
        
        
    }
    
    public void function4(){
        Graphics func = jPanel1.getGraphics();
        func.setColor(Color.orange);
        
        String num = JOptionPane.showInputDialog(this,"Please enter your number; ");
        
        double nm = Double.parseDouble(num);
        
        if (nm <= 0 || nm == 1) {
        JOptionPane.showMessageDialog(this, "Base must be greater than 0 and not equal to 1.");
        return;
    }

    for (double x = 1; x <= 250; x+=0.5) { // Empezamos en x = 1 porque log(x) no existe para x <= 0
        double y = (Math.log(x) / Math.log(nm)) * 100; // Aplicar escala

        func.drawOval(250 + (int)(x * 2), 250 - (int)y, 6, 6); // Se ajusta la escala en x
    }
 
        
    }
    public void function5(){
        
    }
    public void function6(){
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
