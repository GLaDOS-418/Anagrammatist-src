

package PlayGame;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import word_game.*;
import wordnet_jaws.WordnetGUI;


public class SolveScrabble extends javax.swing.JFrame {
    Trie t;
    int row;

    public SolveScrabble(Trie t) {
        this.t=t;
        initComponents();
        options.setSelectedItem("Scrabble");
        word.setEnabled(true);
        centralchar.setEnabled(false);
        length.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JComboBox();
        word = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        centralchar = new javax.swing.JTextField();
        length = new javax.swing.JSpinner();
        clear = new javax.swing.JButton();
        rules = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTable();
        GetNet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solver");

        options.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select Option---", "Spellathon", "Anagram", "Scrabble", "Prefix" }));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        centralchar.setText(" ");
        centralchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centralcharActionPerformed(evt);
            }
        });

        length.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        rules.setText("How to");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        results.setAutoCreateRowSorter(true);
        results.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Words", "Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        results.setShowHorizontalLines(false);
        results.setShowVerticalLines(false);
        jScrollPane1.setViewportView(results);

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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(word, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rules, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(centralchar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GetNet, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetNet))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centralchar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rules)
                        .addGap(11, 11, 11)
                        .addComponent(back)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
        String s=options.getSelectedItem().toString();
        switch(s){
            case "Spellathon":                              
            case "Anagram":
            case "Prefix":
                this.dispose();
                Solve solver=new Solve(s,t);
                solver.setVisible(true);
                solver.setResizable(false);
                break;
            case "Scrabble":
                clearTable();
                centralchar.setEnabled(false);
                length.setEnabled(true);
                word.setEnabled(true);
                break;
            default:
                clearTable();
                centralchar.setEnabled(false);
                length.setEnabled(false);
                word.setEnabled(false);
                break;
        }
        
                 
    }//GEN-LAST:event_optionsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==back){
            this.dispose();
            MainWindow mw=new MainWindow(t);
            mw.setVisible(true);
            mw.setResizable(false);
        }
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_submitActionPerformed

    
    private void submit(){
        String s=options.getSelectedItem().toString();
        clearTable();
        
        switch(s){
            case "Scrabble":
                if(correctString(word.getText().trim())&&(Integer)length.getValue()>2){
                Scrabble scr=new Scrabble();
                TreeMap<String,Integer> tm;
                tm=scr.findWords((String)word.getText(), t);
                if(tm.size()>0){
                DefaultTableModel model=(DefaultTableModel)results.getModel();
                for(Map.Entry<String,Integer> entry : tm.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if(key.length()>=(Integer)length.getValue())
                             model.addRow(new Object[]{key,value});
                        
                } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "No matches found!");
                }
                break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Format! [Use only a-z] and string length between 1 to 10 and minimum length value greater than 2");
                }
                
            default:
                break;
                
        }
    }
    private void centralcharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centralcharActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_centralcharActionPerformed

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_wordActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        word.setText(null);
        options.setSelectedItem("---Select Option---");
        length.setValue(3);
        centralchar.setText(null);
        
    }//GEN-LAST:event_clearActionPerformed

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "1. choose the option from the combobox.\n" +
"2. input the string that is to be solved for in the text field.\n" +
"3. if the selected option is spellathon enter the central character in the other text field(also included in the main textfield)\n" +
"4. if the selected option is scrabble or prefix then one can also select the minimum length of the result words using the spinner.\n" +
"5. click back to go to the main menu.");
        
    }//GEN-LAST:event_rulesActionPerformed

    private void GetNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNetActionPerformed
        if(evt.getSource()==GetNet){
            WordnetGUI wn = new WordnetGUI();
            wn.setVisible(true);
            wn.setResizable(false);
        }        
    }//GEN-LAST:event_GetNetActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetNet;
    private javax.swing.JButton back;
    private javax.swing.JTextField centralchar;
    private javax.swing.JButton clear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner length;
    private javax.swing.JComboBox options;
    private javax.swing.JTable results;
    private javax.swing.JButton rules;
    private javax.swing.JButton submit;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables

    private void clearTable() {
        DefaultTableModel model=(DefaultTableModel)results.getModel();
        row=model.getRowCount()-1;
        while(row>=0){
             model.removeRow(row);
             row--;
         }
    }

    private boolean correctString(String trim) {
        char[] trimchar=trim.toCharArray();
        for(char ch: trimchar){
            if(!(ch>='a'&&ch<='z'))
                return false;
        }
        
        return true&&trim.length()<=10&&trim.length()>0;
    }
}
