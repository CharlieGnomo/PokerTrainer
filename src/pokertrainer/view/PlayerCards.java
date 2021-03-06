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

import javax.swing.ImageIcon;

/**
 * Clase de la vista que define el panel de las cartas de un jugador.
 * @author Javi
 */
public class PlayerCards extends javax.swing.JPanel {

    /**
     * Constructor de la clase.
     */
    public PlayerCards() {
        initComponents();
    }
    
    /**
     * Establece las imágenes de las dos cartas de un jugador.
     * @param card1 Imagen de la primera carta.
     * @param card2 Imagen de la segunda carta.
     */
    public void setCardsImages(ImageIcon card1, ImageIcon card2) {
        this.playerCard1.setCard(card1);
        this.playerCard1.hideCard();
        this.playerCard2.setCard(card2);
        this.playerCard2.hideCard();
    }
    
    /**
     * Muestra las dos cartas de un jugador.
     */
    public void showCards(){
        this.playerCard1.showCard();
        this.playerCard2.showCard();
    }
    
    /**
     * Oculta las dos cartas de un jugador.
     */
    public void hideCards(){
        this.playerCard1.hideCard();
        this.playerCard2.hideCard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerCard2 = new pokertrainer.view.CardPanel();
        playerCard1 = new pokertrainer.view.CardPanel();

        setAutoscrolls(true);
        setOpaque(false);

        javax.swing.GroupLayout playerCard2Layout = new javax.swing.GroupLayout(playerCard2);
        playerCard2.setLayout(playerCard2Layout);
        playerCard2Layout.setHorizontalGroup(
            playerCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        playerCard2Layout.setVerticalGroup(
            playerCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout playerCard1Layout = new javax.swing.GroupLayout(playerCard1);
        playerCard1.setLayout(playerCard1Layout);
        playerCard1Layout.setHorizontalGroup(
            playerCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        playerCard1Layout.setVerticalGroup(
            playerCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(playerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(playerCard2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pokertrainer.view.CardPanel playerCard1;
    private pokertrainer.view.CardPanel playerCard2;
    // End of variables declaration//GEN-END:variables

    /**
     * Oculta el panel de las cartas de un jugador.
     */
    void disablePanel() {
        this.playerCard1.disablePanel();
        this.playerCard2.disablePanel();
        this.setVisible(false);
    }
    
    /**
     * Método que repinta todos los componentes
     */
    void repaintAll() {
        this.playerCard1.repaint();
        this.playerCard2.repaint();
    }
}
