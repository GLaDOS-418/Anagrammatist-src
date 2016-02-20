package PlayGame;

import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JProgressBar;
import word_game.Randomize;
import word_game.Trie;
import wordnet_jaws.WordnetGUI;

public class PlaySpell extends javax.swing.JFrame {

    String wordchar;
    Set set=new TreeSet();
    Set setc;
    Set seti;
    Trie t;
    public PlaySpell(Trie t) {
        this.t=t;
        initComponents();
        playAgain();
        submit.doClick();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        playagain = new javax.swing.JButton();
        rules = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        letter6 = new javax.swing.JTextField();
        letter3 = new javax.swing.JTextField();
        letter2 = new javax.swing.JTextField();
        letter1 = new javax.swing.JTextField();
        letter0 = new javax.swing.JTextField();
        letter5 = new javax.swing.JTextField();
        letter4 = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        word = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        incorrect = new java.awt.TextArea();
        progress = new javax.swing.JProgressBar();
        clear = new javax.swing.JButton();
        correct = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spellathon = new javax.swing.JLabel();
        GetNet = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spellathon");

        playagain.setText("Play Again");
        playagain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playagainMouseClicked(evt);
            }
        });

        rules.setText("How to");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        back.setLabel("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        letter6.setEditable(false);
        letter6.setBackground(new java.awt.Color(255, 255, 255));
        letter6.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter6.setCaretColor(new java.awt.Color(255, 255, 255));
        letter6.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter6MouseClicked(evt);
            }
        });
        letter6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter6ActionPerformed(evt);
            }
        });

        letter3.setEditable(false);
        letter3.setBackground(new java.awt.Color(255, 255, 255));
        letter3.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter3.setCaretColor(new java.awt.Color(255, 255, 255));
        letter3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter3MouseClicked(evt);
            }
        });
        letter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter3ActionPerformed(evt);
            }
        });

        letter2.setEditable(false);
        letter2.setBackground(new java.awt.Color(255, 255, 255));
        letter2.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter2.setCaretColor(new java.awt.Color(255, 255, 255));
        letter2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter2MouseClicked(evt);
            }
        });
        letter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter2ActionPerformed(evt);
            }
        });

        letter1.setEditable(false);
        letter1.setBackground(new java.awt.Color(255, 255, 255));
        letter1.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter1.setText(" ");
        letter1.setCaretColor(new java.awt.Color(255, 255, 255));
        letter1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter1MouseClicked(evt);
            }
        });
        letter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter1ActionPerformed(evt);
            }
        });

        letter0.setEditable(false);
        letter0.setBackground(new java.awt.Color(0, 0, 0));
        letter0.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter0.setForeground(new java.awt.Color(255, 255, 255));
        letter0.setCaretColor(new java.awt.Color(255, 255, 255));
        letter0.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter0MouseClicked(evt);
            }
        });
        letter0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter0ActionPerformed(evt);
            }
        });

        letter5.setEditable(false);
        letter5.setBackground(new java.awt.Color(255, 255, 255));
        letter5.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        letter5.setCaretColor(new java.awt.Color(255, 255, 255));
        letter5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter5MouseClicked(evt);
            }
        });
        letter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter5ActionPerformed(evt);
            }
        });

        letter4.setEditable(false);
        letter4.setBackground(new java.awt.Color(255, 255, 255));
        letter4.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        letter4.setCaretColor(new java.awt.Color(255, 255, 255));
        letter4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        letter4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letter4MouseClicked(evt);
            }
        });
        letter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letter0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(letter6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(letter4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBackground(new java.awt.Color(153, 255, 0));

        word.setText(" ");
        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        incorrect.setBackground(new java.awt.Color(255, 255, 255));
        incorrect.setEditable(false);
        incorrect.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        incorrect.setForeground(new java.awt.Color(204, 0, 0));
        incorrect.setName(""); // NOI18N

        progress.setForeground(new java.awt.Color(0, 0, 0));

        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        correct.setBackground(new java.awt.Color(255, 255, 255));
        correct.setEditable(false);
        correct.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        correct.setForeground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel1.setText("CORRECT");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel2.setText("INCORRECT");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(submit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clear))
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(59, 59, 59))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit)
                    .addComponent(clear))
                .addGap(11, 11, 11)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jLayeredPane2.setLayer(word, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(incorrect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(progress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        progress.getAccessibleContext().setAccessibleDescription("");
        progress.getAccessibleContext().setAccessibleParent(submit);
        jLayeredPane2.setLayer(clear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(correct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        spellathon.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        spellathon.setText("SPELLATHON");
        spellathon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spellathonMouseClicked(evt);
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
                .addGap(86, 86, 86)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playagain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetNet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(spellathon)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(spellathon)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playagain)
                        .addGap(18, 18, 18)
                        .addComponent(rules)
                        .addGap(18, 18, 18)
                        .addComponent(back)
                        .addGap(18, 18, 18)
                        .addComponent(GetNet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addGap(39, 39, 39)))
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letter6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter6ActionPerformed

    private void letter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter3ActionPerformed

    private void letter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter2ActionPerformed

    private void letter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter1ActionPerformed
        String s=""+wordchar.charAt(2)+"";
        letter1.setText(s);
    }//GEN-LAST:event_letter1ActionPerformed

    private void letter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter5ActionPerformed

    private void letter0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter0ActionPerformed

    private void letter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    if(evt.getSource()==back)
            this.dispose();
        PlayMenu pm=new PlayMenu(t);
        pm.setVisible(true);
        pm.setResizable(false);
    }//GEN-LAST:event_backActionPerformed

    private void letter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter1MouseClicked
        String s=letter1.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
        
    }//GEN-LAST:event_letter1MouseClicked

    private void letter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter2MouseClicked
        String s=letter2.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter2MouseClicked

    private void letter3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter3MouseClicked
        String s=letter3.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter3MouseClicked

    private void letter4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter4MouseClicked
                String s=letter4.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter4MouseClicked

    private void letter5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter5MouseClicked
        String s=letter5.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter5MouseClicked

    private void letter6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter6MouseClicked
        String s=letter6.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);    }//GEN-LAST:event_letter6MouseClicked

    private void letter0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letter0MouseClicked
        String s=letter0.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);    }//GEN-LAST:event_letter0MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        word.setText(null);
    }//GEN-LAST:event_clearMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        submit();
        
    }//GEN-LAST:event_submitMouseClicked

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        submit();
        
    }//GEN-LAST:event_wordActionPerformed

    private void playagainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playagainMouseClicked
        playAgain();
    }//GEN-LAST:event_playagainMouseClicked

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "1. there are 6 peripheral letters and 1 central letter.\n" +
"2. all the letters should be used only once.\n" +
"3. use only a-z.\n" +
"4. solver needs to create as many words as possible each having the central letter and is atleast of four characters.\n" +
"5. enter the words in the provided text field either by typing 'em or by clicking on the letters and then press enter or click submit.\n" +
"6. click back to go to the play menu.\n" +
"7. click clear to clear the text field.\n" +
"8. click play again to restart the game.");
    }//GEN-LAST:event_rulesActionPerformed

    private void spellathonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spellathonMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, set, "Spellathon Solutions", INFORMATION_MESSAGE);
    }//GEN-LAST:event_spellathonMouseClicked

    private void GetNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNetActionPerformed
        if(evt.getSource()==GetNet){
            WordnetGUI wn = new WordnetGUI();
            wn.setVisible(true);
            wn.setResizable(false);
        }        
    }//GEN-LAST:event_GetNetActionPerformed

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
        
        //System.out.println(""+(double)setc.size()+" "+(double)set.size()+" "+((double)setc.size()/(double)set.size()));
       
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
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField letter0;
    private javax.swing.JTextField letter1;
    private javax.swing.JTextField letter2;
    private javax.swing.JTextField letter3;
    private javax.swing.JTextField letter4;
    private javax.swing.JTextField letter5;
    private javax.swing.JTextField letter6;
    private javax.swing.JButton playagain;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton rules;
    private javax.swing.JLabel spellathon;
    private javax.swing.JButton submit;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables

    private void initLetters() {
        letter1.setText(""+wordchar.charAt(0)+"");
        letter2.setText(""+wordchar.charAt(1)+"");
        letter3.setText(""+wordchar.charAt(2)+"");
        letter4.setText(""+wordchar.charAt(4)+"");
        letter5.setText(""+wordchar.charAt(5)+"");
        letter6.setText(""+wordchar.charAt(6)+"");
        letter0.setText(""+wordchar.charAt(3)+"");
    }

    private void playAgain() {
        
        Randomize r=new Randomize(t);
        r.number(1);
        wordchar=r.validWordSpell();
        set=r.getSet();
        word.setText(null);
        correct.setText(null);
        incorrect.setText(null);
        
        initLetters();
        
        setc=new TreeSet();
        seti=new TreeSet();
        progress.setStringPainted(true);
        progress.setValue((int)((setc.size()/set.size())*100.0));
        progress.setString("0%   ["+setc.size()+" Of "+set.size()+"]");
               
    }

}
