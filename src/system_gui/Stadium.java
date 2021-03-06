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
public class Stadium extends javax.swing.JInternalFrame {

    public String name_stadium;
    public String location;
    public int seating;
    
    public Stadium(String name, String location, int seating) {
        this.name_stadium = name;
        this.location = location;
        this.seating = seating;
    }
    
    public ArrayList<Match> getMatches(ArrayList<Match> list) {
        ArrayList<Match> stdMatches = new ArrayList<>();
        for (Match item: list) {
            if (item.stadium.getName().toLowerCase().equals(this.getName().toLowerCase())) {
                stdMatches.add(item);
            }
        }
        return stdMatches;
    }

    @Override
    public String getName() {
        return name_stadium;
    }

    @Override
    public void setName(String name) {
        this.name_stadium = name;
    }

//    public String getLocation() {
//        return location;
//    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    @Override
    public String toString() {
        return name_stadium +" "+location+" "+seating;
    }
    /**
     * Creates new form Stadium
     */
    public Stadium() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
        addRowToJTable();
    }

    
    public ArrayList ListStadium(){
        ArrayList<Stadium> list_stadium = new ArrayList<>();
        
        Stadium u1 = new Stadium("stadium_1","Location_A",100);  list_stadium.add(u1);
        Stadium u2 = new Stadium("stadium_2","Location_B",200);  list_stadium.add(u2);
        Stadium u3 = new Stadium("stadium_3","Location_C",300);  list_stadium.add(u3);
        Stadium u4 = new Stadium("stadium_4","Location_D",400);  list_stadium.add(u4);
        Stadium u5 = new Stadium("stadium_5","Location_E",500);  list_stadium.add(u5);
        Stadium u6 = new Stadium("stadium_6","Location_F",600);  list_stadium.add(u6); 
       
        return list_stadium;
      }
    
    public void addRowToJTable(){
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          ArrayList<Stadium> list_stadium = ListStadium();
          //ArrayList<Team> list_match = Match.ListMatches();         // to add the match
          Object rowData[] = new Object[5];
          for(int i = 0; i < list_stadium.size(); i++){
            rowData[0] = list_stadium.get(i).name_stadium;
            rowData[1] = list_stadium.get(i).location;
            rowData[2] = list_stadium.get(i).seating;
//            rowData[3] = list_match.get(i);       //  list of matches       
//            rowData[5] = list_match.get(i).time;    // time of match
//            rowData[6] = list_match.get(i).date;    // date of match
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stadiums Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Seat capacity", "List of Matches", "Time", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
