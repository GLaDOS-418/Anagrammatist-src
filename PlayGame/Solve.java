

package PlayGame;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import word_game.*;
import wordnet_jaws.WordnetGUI;


public class Solve extends javax.swing.JFrame {
    Trie t;
    String selectedoption;

    public Solve(String selectedoption,Trie t) {
        this.t=t;
        this.selectedoption=selectedoption;
        initComponents();
        options.setSelectedItem(selectedoption);
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        results = new java.awt.TextArea();
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

        results.setEditable(false);
        results.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(results, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1.setLayer(results, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(centralchar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(length))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(GetNet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetNet))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(length)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centralchar))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back))
                    .addComponent(jLayeredPane1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
        String s=options.getSelectedItem().toString();
        switch(s){
            case "Spellathon":
                word.setEnabled(true);
                length.setValue(4);
                length.setEnabled(false);
                centralchar.setEnabled(true);
                centralchar.setEditable(true);
                break;                
            case "Anagram":
                word.setEnabled(true);
                centralchar.setEnabled(false);
                length.setEnabled(false);
                break;
            case "Scrabble":
                this.dispose();
                SolveScrabble sscr=new SolveScrabble(t);
                sscr.setVisible(true);
                sscr.setResizable(false);
                break;
            case "Prefix":
                word.setEnabled(true);
                centralchar.setEditable(false);
                length.setEnabled(true);
                break;
            default:
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
        results.setText(null);
        
        if(correctString(word.getText().trim())){
        switch(s){
            case "Spellathon":
                if(((String)word.getText().trim()).length()==7){
                if(centralchar.getText().toLowerCase().trim().length()==1){
                Spellathon sp=new Spellathon((Integer)length.getValue(), centralchar.getText().trim().charAt(0));
                Set spell;
                spell=sp.findWords((String)word.getText().trim(), t);
                if(spell.size()>0){
                for(Object obj:spell){
                    s=results.getText();
                    s+="\n"+(String)obj;
                    results.setText(s);
                }
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "No matches found!");
                }
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "enter central character of only 1 alphabet");
                }
                
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "enter 7 letters!");
                }
                break;                
            case "Anagram":
                Anagram ag=new Anagram();
                Set ana;
                ana=ag.findWords((String)word.getText().trim(), t);
                if(ana.size()>0){
                for(Object obj:ana){
                    if(((String)obj).length()>=(Integer)length.getValue()){
                        s=results.getText();
                        s+="\n"+(String)obj;
                        results.setText(s);}
                }}
                
                else{
                    JOptionPane.showMessageDialog(null, "No matches found!");
                }
                break;
                
            case "Prefix":
                Prefix pre=new Prefix();
                TreeSet set=new TreeSet();
                set.addAll(pre.prefix(word.getText().trim(), t));
                if(set.size()>0){
                for(Object obj:set){
                    if(((String)obj).length()>=(Integer)length.getValue()){
                        s=results.getText();
                        s+="\n"+(String)obj;
                        results.setText(s);}
                }
                }
                else{
                    JOptionPane.showMessageDialog(null, "No matches found!");
                }
                break;
            default:
                break;
                
        }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Invalid Format! [Use only a-z] and string length between 1 to 10");
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
        length.setValue(1);
        results.setText(null);
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSpinner length;
    private javax.swing.JComboBox options;
    private java.awt.TextArea results;
    private javax.swing.JButton rules;
    private javax.swing.JButton submit;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables

    private boolean correctString(String trim) {
        char[] trimchar=trim.toCharArray();
        for(char ch: trimchar){
            if(!(ch>='a'&&ch<='z'))
                return false;
        }
        
        return true&&trim.length()<=10&&trim.length()>0;
    }
    
    
}
