package com.ryctabo.smartfinance.view;

public class InventoryView extends javax.swing.JFrame {

    /**
     * Creates new form InventoryMenu
     */
    public InventoryView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnScreen = new javax.swing.JPanel();
        pnLeftBar = new javax.swing.JPanel();
        lbKaykrys = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbSku = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbCategory = new javax.swing.JLabel();
        cboxCategory = new javax.swing.JComboBox<>();
        lbCost = new javax.swing.JLabel();
        spnCost = new javax.swing.JSpinner();
        lbPrice = new javax.swing.JLabel();
        spnPrice = new javax.swing.JSpinner();
        txtSku = new javax.swing.JTextField();
        lbInventoryManagement = new javax.swing.JLabel();
        scpnProductTable = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        pnDecoration = new javax.swing.JPanel();
        lbStock = new javax.swing.JLabel();
        spnStock = new javax.swing.JSpinner();
        lbSearch = new javax.swing.JLabel();
        spnSearch = new javax.swing.JSpinner();
        pnDecorationButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        pnScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnScreen.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnScreen.setLayout(null);

        pnLeftBar.setBackground(new java.awt.Color(204, 102, 255));
        pnLeftBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnLeftBar.setPreferredSize(new java.awt.Dimension(400, 720));

        lbKaykrys.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lbKaykrys.setForeground(new java.awt.Color(255, 255, 255));
        lbKaykrys.setText("KAYKRYS");

        lbIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\small_icon_kaykrys.png")); // NOI18N

        lbSku.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSku.setForeground(new java.awt.Color(255, 255, 255));
        lbSku.setText("Sku");

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Name");

        lbCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCategory.setForeground(new java.awt.Color(255, 255, 255));
        lbCategory.setText("Category");

        cboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothing", "Cosmetics", "Accessories" }));

        lbCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCost.setForeground(new java.awt.Color(255, 255, 255));
        lbCost.setText("Cost");

        spnCost.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 2000));

        lbPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice.setText("Price");

        spnPrice.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 2000));

        javax.swing.GroupLayout pnLeftBarLayout = new javax.swing.GroupLayout(pnLeftBar);
        pnLeftBar.setLayout(pnLeftBarLayout);
        pnLeftBarLayout.setHorizontalGroup(
            pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftBarLayout.createSequentialGroup()
                .addGroup(pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lbKaykrys))
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lbIcon))
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPrice)
                            .addComponent(lbCost)
                            .addComponent(lbCategory)
                            .addComponent(lbSku)
                            .addComponent(lbName)
                            .addComponent(txtName)
                            .addComponent(cboxCategory, 0, 340, Short.MAX_VALUE)
                            .addComponent(spnCost)
                            .addComponent(spnPrice)
                            .addComponent(txtSku))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnLeftBarLayout.setVerticalGroup(
            pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftBarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbKaykrys)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon)
                .addGap(72, 72, 72)
                .addComponent(lbSku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pnScreen.add(pnLeftBar);
        pnLeftBar.setBounds(0, 0, 400, 720);

        lbInventoryManagement.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lbInventoryManagement.setForeground(new java.awt.Color(204, 102, 255));
        lbInventoryManagement.setText("INVENTORY MANAGEMENT");
        pnScreen.add(lbInventoryManagement);
        lbInventoryManagement.setBounds(650, 30, 463, 45);

        tbProduct.setBackground(new java.awt.Color(236, 236, 236));
        tbProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sku", "Name", "Category", "Cost", "Price", "Product stock"
            }
        ));
        scpnProductTable.setViewportView(tbProduct);

        pnScreen.add(scpnProductTable);
        scpnProductTable.setBounds(440, 220, 790, 358);

        pnDecoration.setBackground(new java.awt.Color(204, 102, 255));
        pnDecoration.setPreferredSize(new java.awt.Dimension(486, 85));

        lbStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbStock.setForeground(new java.awt.Color(255, 255, 255));
        lbStock.setText("Product stock");

        lbSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSearch.setForeground(new java.awt.Color(255, 255, 255));
        lbSearch.setText("Search product");

        javax.swing.GroupLayout pnDecorationLayout = new javax.swing.GroupLayout(pnDecoration);
        pnDecoration.setLayout(pnDecorationLayout);
        pnDecorationLayout.setHorizontalGroup(
            pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDecorationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStock)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSearch))
                .addGap(20, 20, 20))
        );
        pnDecorationLayout.setVerticalGroup(
            pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDecorationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStock)
                    .addComponent(lbSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnScreen.add(pnDecoration);
        pnDecoration.setBounds(440, 120, 486, 85);

        pnDecorationButtons.setBackground(new java.awt.Color(204, 102, 255));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");

        javax.swing.GroupLayout pnDecorationButtonsLayout = new javax.swing.GroupLayout(pnDecorationButtons);
        pnDecorationButtons.setLayout(pnDecorationButtonsLayout);
        pnDecorationButtonsLayout.setHorizontalGroup(
            pnDecorationButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDecorationButtonsLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        pnDecorationButtonsLayout.setVerticalGroup(
            pnDecorationButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDecorationButtonsLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(pnDecorationButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnScreen.add(pnDecorationButtons);
        pnDecorationButtons.setBounds(490, 600, 700, 60);

        lbBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\back_icon.png")); // NOI18N
        pnScreen.add(lbBack);
        lbBack.setBounds(1560, 10, 37, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxCategory;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbCost;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInventoryManagement;
    private javax.swing.JLabel lbKaykrys;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbSku;
    private javax.swing.JLabel lbStock;
    private javax.swing.JPanel pnDecoration;
    private javax.swing.JPanel pnDecorationButtons;
    private javax.swing.JPanel pnLeftBar;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JScrollPane scpnProductTable;
    private javax.swing.JSpinner spnCost;
    private javax.swing.JSpinner spnPrice;
    private javax.swing.JSpinner spnSearch;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSku;
    // End of variables declaration//GEN-END:variables
}
