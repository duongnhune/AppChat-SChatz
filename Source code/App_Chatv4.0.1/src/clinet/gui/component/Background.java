/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinet.gui.component;

/**
 *
 * @author Hùng Trần
 */
public class Background extends javax.swing.JPanel {

    /**
     * Creates new form Background
     */
    public Background() {
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

        pictureBox1 = new lib.PictureBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout());

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/data/assets/images/background_app.png"))); // NOI18N
        add(pictureBox1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
