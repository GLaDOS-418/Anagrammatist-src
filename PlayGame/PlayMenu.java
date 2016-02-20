
package PlayGame;

import word_game.Trie;

public class PlayMenu extends javax.swing.JFrame {

    Trie t;
    public PlayMenu(Trie t) {
        initComponents();
        this.t=t;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anagram = new javax.swing.JButton();
        prefix = new javax.swing.JButton();
        scrabble = new javax.swing.JButton();
        back = new javax.swing.JButton();
        spellathon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Play Menu");

        anagram.setText("ANAGRAM");
        anagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anagramActionPerformed(evt);
            }
        });

        prefix.setText("PREFIXER");
        prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixActionPerformed(evt);
            }
        });

        scrabble.setText("SCRABBLE");
        scrabble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrabbleActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        spellathon.setText("SPELLATHON");
        spellathon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellathonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spellathon, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(scrabble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prefix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(spellathon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrabble, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anagram, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back)
                    .addComponent(prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spellathonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellathonActionPerformed
        if(evt.getSource()==spellathon){
            this.dispose();
            PlaySpell ps=new PlaySpell(t);
            ps.setVisible(true);
            ps.setResizable(false);
        }
    }//GEN-LAST:event_spellathonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        MainWindow mw=new MainWindow(t);
        mw.setVisible(true);
        mw.setResizable(false);
    }//GEN-LAST:event_backActionPerformed

    private void anagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anagramActionPerformed
        if(evt.getSource()==anagram){
            this.dispose();
            PlayAnagram pa=new PlayAnagram(t);
            pa.setVisible(true);
            pa.setResizable(false);
        }
    }//GEN-LAST:event_anagramActionPerformed

    private void scrabbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrabbleActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==scrabble){
            this.dispose();
            PlayScrabble pscr=new PlayScrabble(t);
            pscr.setVisible(true);
            pscr.setResizable(false);
        }
    }//GEN-LAST:event_scrabbleActionPerformed

    private void prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Prefixer pre=new Prefixer(t);
        pre.setVisible(true);
        pre.setResizable(false);
    }//GEN-LAST:event_prefixActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anagram;
    private javax.swing.JButton back;
    private javax.swing.JButton prefix;
    private javax.swing.JButton scrabble;
    private javax.swing.JButton spellathon;
    // End of variables declaration//GEN-END:variables
}
