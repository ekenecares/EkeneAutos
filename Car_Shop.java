/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekene;

import static Classes.Connect.getConnection;
import static Classes.Connect.ps;
import static Classes.Connect.rs;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Apple
 */
public class Car_Shop extends javax.swing.JFrame {

    /**
     * Creates new form  Car_Shop
     * 
     */
    public Car_Shop() {
        initComponents();
    }
    
    
    static int  identity =1 ;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        maketxt = new javax.swing.JTextField();
        modeltxt = new javax.swing.JTextField();
        colortxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        carImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newtxt = new javax.swing.JTextField();
        mileagetxt = new javax.swing.JTextField();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        geartxt = new javax.swing.JTextField();
        purchase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        stocktxt = new javax.swing.JTextField();
        menu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Make");

        jLabel4.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");

        jLabel6.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("In Stock");

        jLabel7.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Model");

        jLabel8.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price($)");

        pricetxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        pricetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });

        maketxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        maketxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maketxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maketxtActionPerformed(evt);
            }
        });

        modeltxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        modeltxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modeltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeltxtActionPerformed(evt);
            }
        });

        colortxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        colortxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        colortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colortxtActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(127, 100, 44));

        carImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shop.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gear");

        jLabel9.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mileage");

        jLabel10.setFont(new java.awt.Font("Niagara Engraved", 1, 50)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Brand New");

        newtxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        newtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtxtActionPerformed(evt);
            }
        });

        mileagetxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        mileagetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mileagetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileagetxtActionPerformed(evt);
            }
        });

        prevBtn.setBackground(new java.awt.Color(0, 0, 0));
        prevBtn.setFont(new java.awt.Font("Niagara Engraved", 1, 40)); // NOI18N
        prevBtn.setForeground(new java.awt.Color(255, 255, 255));
        prevBtn.setText("Prev");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        nextBtn.setBackground(new java.awt.Color(0, 0, 0));
        nextBtn.setFont(new java.awt.Font("Niagara Engraved", 1, 40)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        geartxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        geartxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        geartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geartxtActionPerformed(evt);
            }
        });

        purchase.setBackground(new java.awt.Color(255, 255, 255));
        purchase.setFont(new java.awt.Font("Niagara Engraved", 1, 40)); // NOI18N
        purchase.setText("Buy");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Niagara Engraved", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AUTOS");

        stocktxt.setFont(new java.awt.Font("Niagara Engraved", 1, 35)); // NOI18N
        stocktxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stocktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocktxtActionPerformed(evt);
            }
        });

        menu1.setBackground(new java.awt.Color(0, 0, 0));
        menu1.setFont(new java.awt.Font("Niagara Engraved", 1, 40)); // NOI18N
        menu1.setForeground(new java.awt.Color(255, 255, 255));
        menu1.setText("Menu");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(modeltxt)
                                    .addComponent(pricetxt)
                                    .addComponent(maketxt))
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGap(94, 94, 94))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mileagetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(geartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(prevBtn)
                                .addGap(45, 45, 45)
                                .addComponent(nextBtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(607, 607, 607)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(611, 611, 611)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(geartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(maketxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mileagetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(prevBtn))
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(purchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String prices;
    String model;
    String carMake;
    String brandNew;
    String gear;
    String color;
    String mileage;
    int available;
    int unavailable;
    
    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void maketxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maketxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maketxtActionPerformed

    private void colortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colortxtActionPerformed

    private void newtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtxtActionPerformed

    private void mileagetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mileagetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mileagetxtActionPerformed

    private void geartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geartxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_geartxtActionPerformed

    private void modeltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeltxtActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here:
            identity--;
         String sqlQuery = "SELECT * FROM carTable WHERE id = ? "; // INSERTS A QUERY STATEMENT USING PS WHICH CONVERTS CODE IN THE SQL ENVIROMENT

        try{
            ps = getConnection().prepareStatement(sqlQuery);
            //ps.setInt(1,ider);
            ps.setInt(1, identity);
            rs = ps.executeQuery();
            
            if(rs.next()){
            String price = rs.getString("price");
            String model = rs.getString("model");
            String make = rs.getString("make");
            String brandNew = rs.getString("newBrand");
            String gear = rs.getString("gear");
            String color = rs.getString("color");
            String mileage = rs.getString("mileage");
            String stock = rs.getString("inStock");
            int ider = rs.getInt("id");


          JTextField pricey = Car_Shop.pricetxt;
           pricey.setText(price);
           pricey.setEditable(false);
           
          JTextField models = Car_Shop.modeltxt;
           models.setText(model);
           models.setEditable(false);
           
          JTextField makes = Car_Shop.maketxt;
           makes.setText(make);
           makes.setEditable(false);
           
          JTextField brands = Car_Shop.newtxt;
           brands.setText(brandNew);
           brands.setEditable(false);
           
          JTextField gears = Car_Shop.geartxt;
           gears.setText(gear);
           gears.setEditable(false);
           
         JTextField colors = Car_Shop.colortxt;
           colors.setText(color);
           colors.setEditable(false);
           
        JTextField mileages = Car_Shop.mileagetxt;
           mileages.setText(mileage);
           mileages.setEditable(false);
           
        JTextField stocks = Car_Shop.stocktxt;
           stocks.setText(stock);
           stocks.setEditable(false);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_prevBtnActionPerformed

    private void stocktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stocktxtActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
         identity++;
         String sqlQuery = "SELECT * FROM carTable WHERE id = ? "; // INSERTS A QUERY STATEMENT USING PS WHICH CONVERTS CODE IN THE SQL ENVIROMENT

        try{
            ps = getConnection().prepareStatement(sqlQuery);
            //ps.setInt(1,ider);
            ps.setInt(1, identity);
            rs = ps.executeQuery();
            
            if(rs.next()){
            String price = rs.getString("price");
            String model = rs.getString("model");
            String make = rs.getString("model");
            String brandNew = rs.getString("newBrand");
            String gear = rs.getString("gear");
            String color = rs.getString("color");
            String mileage = rs.getString("mileage");
            String stock = rs.getString("inStock");
            int ider = rs.getInt("id");


          JTextField pricey = Car_Shop.pricetxt;
           pricey.setText(price);
           pricey.setEditable(false);
           
          JTextField models = Car_Shop.modeltxt;
           models.setText(model);
           models.setEditable(false);
           
          JTextField makes = Car_Shop.maketxt;
           makes.setText(make);
           makes.setEditable(false);
           
          JTextField brands = Car_Shop.newtxt;
           brands.setText(brandNew);
           brands.setEditable(false);
           
          JTextField gears = Car_Shop.geartxt;
           gears.setText(gear);
           gears.setEditable(false);
           
         JTextField colors = Car_Shop.colortxt;
           colors.setText(color);
           colors.setEditable(false);
           
        JTextField mileages = Car_Shop.mileagetxt;
           mileages.setText(mileage);
           mileages.setEditable(false);
           
        JTextField stocks = Car_Shop.stocktxt;
           stocks.setText(stock);
           stocks.setEditable(false);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        // TODO add your handling code here:
        JTextField priced = Car_Shop.pricetxt;
        JTextField modeled = Car_Shop.modeltxt;
        String px = priced.getText();
        String mx = modeled.getText();
        
        String query = "SELECT * FROM userTable WHERE userName = ? "; // INSERTS A QUERY STATEMENT USING PS WHICH CONVERTS CODE IN THE SQL ENVIROMENT

        String usernamer = Ekene_SonsAutos.usernametxt.getText();
        double discount = 0;
        double wallet = 0;
        double expenses = 0;
        double balance = 0;
        // PS CONVERTS CODE IN THE SQL ENVIROMENT AND THIS SETS THE JFIELDS INTO THE SQL
        try{
            ps = getConnection().prepareStatement(query);
            ps.setString(1, usernamer);
            rs = ps.executeQuery();

            if(rs.next()){
                discount = rs.getDouble("discount");
                wallet = rs.getDouble("deposit");
                double pxer = Double.parseDouble(px);
                expenses = pxer - (discount * pxer) ; 
                balance = wallet - expenses;
            }  
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        Payment pay = new Payment();
        pay.setPayment(px, discount, mx, expenses, balance, wallet);
        pay.setVisible(true);
        this.hide();
    }//GEN-LAST:event_purchaseActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
       Menu m = new Menu();
       this.hide();
       m.setVisible(true); 
        
    }//GEN-LAST:event_menu1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Car_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Car_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Car_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Car_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Car_Shop().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carImg;
    public static javax.swing.JTextField colortxt;
    public static javax.swing.JTextField geartxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField maketxt;
    public static javax.swing.JButton menu1;
    public static javax.swing.JTextField mileagetxt;
    public static javax.swing.JTextField modeltxt;
    public static javax.swing.JTextField newtxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    public static javax.swing.JTextField pricetxt;
    private javax.swing.JButton purchase;
    public static javax.swing.JTextField stocktxt;
    // End of variables declaration//GEN-END:variables
}
