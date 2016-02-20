package PlayGame;

import javax.swing.JOptionPane;
import word_game.Trie;
import wordnet_jaws.WordnetGUI;

public class MainWindow extends javax.swing.JFrame {

    Trie t;
    public MainWindow(Trie t) {
        this.t=t;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        solve = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        anagrammatist = new javax.swing.JLabel();
        GetNet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anagrammatist");

        play.setText("PLAY");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        solve.setText("SOLVE");
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        anagrammatist.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        anagrammatist.setText("ANNAGRAMMATIST");
        anagrammatist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anagrammatistMouseClicked(evt);
            }
        });

        GetNet.setText("GetNet");
        GetNet.setActionCommand("GetNet");
        GetNet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetNetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(solve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GetNet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit))
                            .addComponent(play, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(anagrammatist)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(anagrammatist)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solve, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(GetNet))
                .addGap(19, 19, 19))
        );

        GetNet.getAccessibleContext().setAccessibleName("GetNet");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        if(evt.getSource()==play){
            this.dispose();
        PlayMenu pm=new PlayMenu(t);
        pm.setVisible(true);
        pm.setResizable(false);        
        }
    }//GEN-LAST:event_playActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if(evt.getSource()==exit){
            this.dispose();
        }
    }//GEN-LAST:event_exitActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==solve){
            this.dispose();
            Solve solver=new Solve("---Select Option---",t);
            solver.setVisible(true);
            solver.setResizable(false);
        }
    }//GEN-LAST:event_solveActionPerformed

    private void anagrammatistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anagrammatistMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "an·a·gram·ma·tist\n" +
"   noun    \n\n" +
"Full Definition of ANAGRAMMATIST:    a maker of anagrams\n" +
"First Known Use of ANAGRAMMATIST:    1613");
    }//GEN-LAST:event_anagrammatistMouseClicked

    private void GetNetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetNetMouseClicked
        if(evt.getSource()==GetNet){
            WordnetGUI wn = new WordnetGUI();
            wn.setVisible(true);
            wn.setResizable(false);
        }        
    }//GEN-LAST:event_GetNetMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetNet;
    private javax.swing.JLabel anagrammatist;
    private javax.swing.JButton exit;
    private javax.swing.JButton play;
    private javax.swing.JButton solve;
    // End of variables declaration//GEN-END:variables
}
