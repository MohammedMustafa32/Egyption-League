/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_gui;

import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mohammed_Mustafa
 */
public class Player extends javax.swing.JInternalFrame {

    String name_player;
    float height;
    float weight;
    String position;
    ArrayList<Player> list_player = new ArrayList<Player>();
    
    
    public Player(String name, float height, float weight,String position) {
        this.name_player = name;
        this.height = height;
        this.weight = weight;
        this.position = position;
    }

    @Override
    public String getName() {
        return name_player;
    }

    @Override
    public void setName(String name) {
        this.name_player = name;
    }

//    public float getHeight() {
//        return height;
//    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return getName()+" "+getHeight()+" "+getWeight()+" "+position;
    }
    /**
     * Creates new form Player
     */
    public Player() {
        initComponents();
        //addRowToJTable();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }    
    
      
      public ArrayList ListPlayers(){
        ArrayList<Player> list_player = new ArrayList<>();
        // players in team 1
        Player u1 = new Player("player_1_team_1",10,10,"LNA");  list_player.add(u1);
        Player u2 = new Player("player_2_team_1",20,20,"LNB");  list_player.add(u2);
        Player u3 = new Player("player_3_team_1",30,30,"LNC");  list_player.add(u3);
        Player u4 = new Player("player_4_team_1",30,30,"LND");  list_player.add(u4);
        Player u5 = new Player("player_5_team_1",40,40,"LNE");  list_player.add(u5);
        Player u6 = new Player("player_6_team_1",40,40,"LNF");  list_player.add(u6); 
        
        // players in team 2
        Player uu1 = new Player("player_1_team_2",10,10,"LNA");  list_player.add(uu1);
        Player uu2 = new Player("player_2_team_2",20,20,"LNB");  list_player.add(uu2);
        Player uu3 = new Player("player_3_team_2",30,30,"LNC");  list_player.add(uu3);
        Player uu4 = new Player("player_4_team_2",30,30,"LND");  list_player.add(uu4);
        Player uu5 = new Player("player_5_team_2",40,40,"LNE");  list_player.add(uu5);
        Player uu6 = new Player("player_6_team_2",40,40,"LNF");  list_player.add(uu6);
        
        // players in team 3
        Player uuu1 = new Player("player_1_team_3",10,10,"LNA");  list_player.add(uuu1);
        Player uuu2 = new Player("player_2_team_3",20,20,"LNB");  list_player.add(uuu2);
        Player uuu3 = new Player("player_3_team_3",30,30,"LNC");  list_player.add(uuu3);
        Player uuu4 = new Player("player_4_team_3",30,30,"LND");  list_player.add(uuu4);
        Player uuu5 = new Player("player_5_team_3",40,40,"LNE");  list_player.add(uuu5);
        Player uuu6 = new Player("player_6_team_3",40,40,"LNF");  list_player.add(uuu6);
        
        // players in team 4
        Player uuuu1 = new Player("player_1_team_4",10,10,"LNA");  list_player.add(uuuu1);
        Player uuuu2 = new Player("player_2_team_4",20,20,"LNB");  list_player.add(uuuu2);
        Player uuuu3 = new Player("player_3_team_4",30,30,"LNC");  list_player.add(uuuu3);
        Player uuuu4 = new Player("player_4_team_4",30,30,"LND");  list_player.add(uuuu4);
        Player uuuu5 = new Player("player_5_team_4",40,40,"LNE");  list_player.add(uuuu5);
        Player uuuu6 = new Player("player_6_team_4",40,40,"LNF");  list_player.add(uuuu6);
        
        return list_player;
      } 
      
      public void addRowToJTable(){
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          ArrayList<Player> list_player = ListPlayers();
          ArrayList<Team> list_team = Team.ListTeams();         // to add the name of team
          Object rowData[] = new Object[5];
          for(int i = 0; i < list_player.size(); i++){
            rowData[0] = list_player.get(i).name_player;
            rowData[1] = list_player.get(i).height;
            rowData[2] = list_player.get(i).weight;
            rowData[3] = list_player.get(i).position;
            //rowData[4] = list_team.get(i).name_team;         //  name of team      // erro
            model.addRow(rowData);
          }           
      }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Players Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Height", "Weight", "Position", "Team"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter the name of Player");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete text");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Show all");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Delete table");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(65, 65, 65)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Player> list_player = ListPlayers();
        ArrayList<Team> list_team = Team.ListTeams();         // to add the name of team
        Object rowData[] = new Object[5];
        String s_name = jTextField1.getText();
        for(int i = 0; i < list_player.size(); i++){
            if(list_player.get(i).name_player.equals(s_name)){   // check 
            rowData[0] = list_player.get(i).name_player;
            rowData[1] = list_player.get(i).height;
            rowData[2] = list_player.get(i).weight;
            rowData[3] = list_player.get(i).position;
            //rowData[4] = list_team.get(i).name_team;         //  name of team      // erro
            model.addRow(rowData);
            break;
            }
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jTextField1.setText("");
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        addRowToJTable();              
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        jTable1.setModel(new DefaultTableModel(null,new String [] {"Name", "Height", "Weight", "Position", "Team"}));
    }//GEN-LAST:event_jButton4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
