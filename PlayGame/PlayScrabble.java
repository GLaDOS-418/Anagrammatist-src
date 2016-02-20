package PlayGame;

import java.awt.Color;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import word_game.Randomize;
import word_game.Trie;
import wordnet_jaws.WordnetGUI;

public class PlayScrabble extends javax.swing.JFrame {
    
    String wordchar;
    TreeMap<String, Integer> set=new TreeMap<>();
    TreeMap<String, Integer> setc=new TreeMap<>();
    TreeMap<String, Integer> seti=new TreeMap<>();
    Trie t;
    int rowc,rowi;

    public PlayScrabble(Trie t) {
        this.t=t;
        initComponents();
        playagain();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letter1 = new javax.swing.JButton();
        letter2 = new javax.swing.JButton();
        letter3 = new javax.swing.JButton();
        letter4 = new javax.swing.JButton();
        letter5 = new javax.swing.JButton();
        letter6 = new javax.swing.JButton();
        letter7 = new javax.swing.JButton();
        word = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        incorrect = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        correct = new javax.swing.JTable();
        back = new javax.swing.JButton();
        rules = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        playagain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        scrabble = new javax.swing.JLabel();
        GetNet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scrabble");

        letter1.setText("1");
        letter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter1ActionPerformed(evt);
            }
        });

        letter2.setText("2");
        letter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter2ActionPerformed(evt);
            }
        });

        letter3.setText("3");
        letter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter3ActionPerformed(evt);
            }
        });

        letter4.setText("4");
        letter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter4ActionPerformed(evt);
            }
        });

        letter5.setText("5");
        letter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter5ActionPerformed(evt);
            }
        });

        letter6.setText("6");
        letter6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter6ActionPerformed(evt);
            }
        });

        letter7.setText("7");
        letter7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter7ActionPerformed(evt);
            }
        });

        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });

        grade.setEditable(false);
        grade.setBackground(new java.awt.Color(255, 255, 255));

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        incorrect.setAutoCreateRowSorter(true);
        incorrect.setForeground(new java.awt.Color(153, 0, 0));
        incorrect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word", "Point"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        incorrect.setShowHorizontalLines(false);
        incorrect.setShowVerticalLines(false);
        jScrollPane1.setViewportView(incorrect);

        correct.setAutoCreateRowSorter(true);
        correct.setForeground(new java.awt.Color(0, 102, 0));
        correct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word", "Point"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        correct.setShowHorizontalLines(false);
        correct.setShowVerticalLines(false);
        jScrollPane2.setViewportView(correct);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        rules.setText("How to");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel1.setText("CORRECT");

        playagain.setText("Restart");
        playagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel2.setText("INCORRECT");

        scrabble.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        scrabble.setText("SCRABBLE");
        scrabble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrabbleMouseClicked(evt);
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
                        .addGap(79, 79, 79)
                        .addComponent(submit)
                        .addGap(104, 104, 104)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(letter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letter7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playagain, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GetNet)
                        .addGap(18, 18, 18)
                        .addComponent(rules, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(scrabble)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scrabble)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letter1)
                    .addComponent(letter2)
                    .addComponent(letter6)
                    .addComponent(letter5)
                    .addComponent(letter3)
                    .addComponent(letter7)
                    .addComponent(letter4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(clear))
                .addGap(21, 21, 21)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playagain)
                    .addComponent(GetNet)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back)
                        .addComponent(rules)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        word.setText(null);
        grade.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==back){
            this.dispose();
            PlayMenu pm=new PlayMenu(t);
            pm.setVisible(true);
            pm.setResizable(false);
        }
    }//GEN-LAST:event_backActionPerformed

    private void letter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter1ActionPerformed
        // TODO add your handling code here:
        String s=letter1.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter1ActionPerformed

    private void letter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter2ActionPerformed
        // TODO add your handling code here:
        String s=letter2.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter2ActionPerformed

    private void letter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter3ActionPerformed
        // TODO add your handling code here:
        String s=letter3.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter3ActionPerformed

    private void letter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter4ActionPerformed
        // TODO add your handling code here:
        String s=letter4.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter4ActionPerformed

    private void letter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter5ActionPerformed
        // TODO add your handling code here:
        String s=letter5.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter5ActionPerformed

    private void letter6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter6ActionPerformed
        // TODO add your handling code here:
        String s=letter6.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter6ActionPerformed

    private void letter7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter7ActionPerformed
        // TODO add your handling code here:
        String s=letter7.getText();
        String s2=word.getText();
        s2+=s;
        word.setText(s2);
    }//GEN-LAST:event_letter7ActionPerformed

    private void playagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainActionPerformed
        // TODO add your handling code here:
        playagain();
    }//GEN-LAST:event_playagainActionPerformed

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_wordActionPerformed

    private void scrabbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrabbleMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, set, "Scrabble Solutions", INFORMATION_MESSAGE);
    }//GEN-LAST:event_scrabbleMouseClicked

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "1. solver needs to make as many words as possible using the letters provided only once.\n" +
"2. minimum length of the word should be at least 3 characters.\n" +
"3. use only a-z\n" +
"4. enter the words in the provided text field either by typing 'em or by clicking on the letters and then press enter or click submit.\n" +
"5. click back to go to the play menu.\n" +
"6. click clear to clear the text field.\n" +
"7. click restart to restart the game.");
    }//GEN-LAST:event_rulesActionPerformed

    private void GetNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNetActionPerformed
        if(evt.getSource()==GetNet){
            WordnetGUI wn = new WordnetGUI();
            wn.setVisible(true);
            wn.setResizable(false);
        }        
    }//GEN-LAST:event_GetNetActionPerformed

    private void submit(){
        if(set.containsKey(word.getText().toLowerCase().trim())){
            grade.setForeground(Color.GREEN);
            grade.setText("Correct!");
            Integer in=set.get(word.getText().toLowerCase().trim());//get returns the value to which the specific key is mapped in this case points mapped to word
            if(!setc.containsKey(word.getText().toLowerCase().trim())){
                setc.put(word.getText().toLowerCase().trim(),in);
                DefaultTableModel model=(DefaultTableModel)correct.getModel();
                model.addRow(new Object[]{word.getText().toLowerCase().trim(),in});
            }
            
            word.setText("");
        }
        
        else{
            grade.setForeground(Color.red);
            grade.setText("Incorrect!");
            if(!seti.containsKey(word.getText().toLowerCase().trim())){
                seti.put(word.getText().toLowerCase().trim(),0);
                DefaultTableModel model=(DefaultTableModel)incorrect.getModel();
                model.addRow(new Object[]{word.getText().toLowerCase().trim(),0});
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
    private javax.swing.JTable correct;
    private javax.swing.JTextField grade;
    private javax.swing.JTable incorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton letter1;
    private javax.swing.JButton letter2;
    private javax.swing.JButton letter3;
    private javax.swing.JButton letter4;
    private javax.swing.JButton letter5;
    private javax.swing.JButton letter6;
    private javax.swing.JButton letter7;
    private javax.swing.JButton playagain;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton rules;
    private javax.swing.JLabel scrabble;
    private javax.swing.JButton submit;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables

    private void playagain() {
        Randomize r=new Randomize(t);
        r.number(5);
        wordchar=r.validWordScr();
        set=r.getMap();
        word.setText(null);
        grade.setText(null);
        
        DefaultTableModel model=(DefaultTableModel)correct.getModel();
        rowc=model.getRowCount()-1;
        while(rowc>=0)
        {model.removeRow(rowc); rowc--;}
        
        model=(DefaultTableModel)incorrect.getModel();
        rowi=model.getRowCount()-1;
        while(rowi>=0)
        {model.removeRow(rowi); rowi--;}
        
        initLetters();
        
        setc=new TreeMap<>();
        seti=new TreeMap<>();
        progress.setStringPainted(true);
        progress.setValue((int)((setc.size()/set.size())*100.0));
        progress.setString("0%   ["+setc.size()+" Of "+set.size()+"]");
    }

    private void initLetters() {
        letter1.setText((""+wordchar.charAt(0)+"").toUpperCase());
        letter2.setText((""+wordchar.charAt(1)+"").toUpperCase());
        letter3.setText((""+wordchar.charAt(2)+"").toUpperCase());
        letter4.setText((""+wordchar.charAt(3)+"").toUpperCase());
        letter5.setText((""+wordchar.charAt(4)+"").toUpperCase());
        letter6.setText((""+wordchar.charAt(5)+"").toUpperCase());
        letter7.setText((""+wordchar.charAt(6)+"").toUpperCase());
        
    }
}
