/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PlayGame;

import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import word_game.Randomize;
import word_game.Trie;
import wordnet_jaws.WordnetGUI;

/**
 *
 * @author arnob
 */
public class Prefixer extends javax.swing.JFrame {

    /**
     * Creates new form Prefixer
     */
    Trie t;
    private String wordchar;
    private Set set=new TreeSet();
    private Set setc=new TreeSet();
    private Set seti=new TreeSet();
    public Prefixer(Trie t) {
        this.t=t;
        initComponents();
        playAgain();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prefix = new javax.swing.JTextField();
        word = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        incorrect = new java.awt.TextArea();
        submit = new javax.swing.JButton();
        rules = new javax.swing.JButton();
        back = new javax.swing.JButton();
        correct = new java.awt.TextArea();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        prefixer = new javax.swing.JLabel();
        GetNet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prefixer");

        prefix.setEditable(false);

        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        incorrect.setBackground(new java.awt.Color(255, 255, 255));
        incorrect.setEditable(false);
        incorrect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        incorrect.setForeground(new java.awt.Color(204, 0, 0));

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        rules.setText("How to");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        correct.setBackground(new java.awt.Color(255, 255, 255));
        correct.setEditable(false);
        correct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        correct.setForeground(new java.awt.Color(0, 102, 51));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel1.setText("CORRECT");

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel2.setText("INCORRECT");

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        prefixer.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        prefixer.setText("PREFIXER");
        prefixer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prefixerMouseClicked(evt);
            }
        });

        GetNet.setText("GetNet");
        GetNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetNetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GetNet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(progress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(submit)
                                    .addGap(18, 18, 18)
                                    .addComponent(clear)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(prefixer)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(prefixer)
                .addGap(18, 18, 18)
                .addComponent(prefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear)
                    .addComponent(submit))
                .addGap(22, 22, 22)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restart)
                        .addGap(18, 18, 18)
                        .addComponent(rules)
                        .addGap(18, 18, 18)
                        .addComponent(GetNet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PlayMenu pm=new PlayMenu(t);
        pm.setVisible(true);
        pm.setResizable(false);
    }//GEN-LAST:event_backActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here:
        playAgain();
    }//GEN-LAST:event_restartActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        word.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_submitActionPerformed

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_wordActionPerformed

    private void prefixerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prefixerMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, set, "Prefixer Solutions", INFORMATION_MESSAGE);
    }//GEN-LAST:event_prefixerMouseClicked

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "1. solver needs to create as many words as possible starting with the given 3 letter prefix.\n" +
"2. use only a-z.\n" +
"3. enter the words in the provided text field either by typing 'em or by clicking on the letters and then press enter or click submit.\n" +
"4. click back to go to the play menu.\n" +
"5. click clear to clear the text field.\n" +
"6. click restart to restart the game.");
    }//GEN-LAST:event_rulesActionPerformed

    private void GetNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNetActionPerformed
        if(evt.getSource()==GetNet){
            WordnetGUI wn = new WordnetGUI();
            wn.setVisible(true);
            wn.setResizable(false);
        }        
    }//GEN-LAST:event_GetNetActionPerformed

    
    private void playAgain() {
        Randomize r=new Randomize(t);
        r.number(6);
        wordchar=r.validWordPre();
        set=r.getSet();
        prefix.setText(wordchar);
        word.setText(null);
        correct.setText(null);
        incorrect.setText(null);
        
        
        setc=new TreeSet();
        seti=new TreeSet();
        progress.setStringPainted(true);
        progress.setValue((int)((setc.size()/set.size())*100.0));
        progress.setString("0%   ["+setc.size()+" Of "+set.size()+"]");
        
    }
    
    private void submit(){
        if(set.contains(word.getText().trim())){
            String s=correct.getText();
            if(!setc.contains(word.getText().trim())){
                setc.add(word.getText().trim());
                s+="\n "+word.getText().trim();
                correct.setText(s);
            }
            
            word.setText("");
        }
        
        else{
            String s=incorrect.getText();
            if(!seti.contains(word.getText().trim())){
                seti.add(word.getText().trim());
                s+="\n "+word.getText().trim();
                incorrect.setText(s); 
            }             
            word.setText("");
        }
        
        int value=(int) (((double)setc.size()/(double)set.size())*100.0);
        progress.setStringPainted(true);
        progress.setValue(value);
        progress.setString(value + "%   ["+setc.size()+" Of "+set.size()+"]");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetNet;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private java.awt.TextArea correct;
    private java.awt.TextArea incorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField prefix;
    private javax.swing.JLabel prefixer;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton restart;
    private javax.swing.JButton rules;
    private javax.swing.JButton submit;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables

    
}
