/*
 * Copyright (c) 2017, Aarón Durán Sánchez,Javier López de Lerma, Mateo García Fuentes, Carlos López Martínez 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package pokertrainer.view;


import java.awt.Color;
import pokertrainer.controller.GameController;

/**
 * Clase de la vista que muestra la actualización del contador para los jugadores humanos.
 * @author Carlos
 */
public class CounterPanel extends javax.swing.JPanel {

    

    private GameController controller;
    
    /**
     * Constructor que inicializa los componentes de este panel
     */
    public CounterPanel(){
        initComponents();
    }
    
    /**
     * Muestra como se decrementa el contador.
     */
    public static void decrCounter(){
        int contador = Integer.parseInt(jLabelCounter.getText());
        contador --;
        
        if(contador<0) contador = 30;
        if(contador == 5) jProgressBar.setForeground(Color.red);
        jLabelCounter.setText(String.valueOf(contador));
        jProgressBar.setValue(contador);
    }
    
    /**
     * Inicializa el valor del contador.
     */
    public static void initalizeCounter() {
        
        int contador = 30;
        jLabelCounter.setText(String.valueOf(contador));
        jProgressBar.setForeground(Color.GREEN);
        jProgressBar.setValue(contador);
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar = new javax.swing.JProgressBar();
        jLabelCounter = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jProgressBar.setForeground(new java.awt.Color(51, 255, 0));
        jProgressBar.setMaximum(30);
        jProgressBar.setToolTipText("");
        jProgressBar.setValue(30);

        jLabelCounter.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelCounter.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCounter.setText("30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private boolean bet;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabelCounter;
    private static javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método que repinta los componentes
     */
    void repaintAll() {
        this.jLabelCounter.repaint();
        this.jProgressBar.repaint();
    }
    
    /**
     * Método que oculta o muestra el contador dependiendo del parámetro
     * @param b Si True se muestra el panel, de lo contrario se oculta.
     */
    void setVisibilityOfCounterPanel(boolean b) {
        this.jLabelCounter.setVisible(b);
        this.jProgressBar.setVisible(b);
    }

    

 
}