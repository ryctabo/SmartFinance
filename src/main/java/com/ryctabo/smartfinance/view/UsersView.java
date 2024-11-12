package com.ryctabo.smartfinance.view;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsersView extends javax.swing.JFrame {

//    private final UserController USER_CONTROLLER = new UserController();
    private final String[] COLUMNS = {"username", "password", "role"};
    private final DefaultTableModel DEFAULT_TABLE = new DefaultTableModel(null, COLUMNS);

    public UsersView() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        generateTable();
    }

    private void resetForm() {
        txtUsername.setText("");
        txtPassword.setText("");
        cboxRole.setSelectedIndex(0);
    }

//    private void generateTable() {
//        DEFAULT_TABLE.setRowCount(0);
//        for (String[] data : USER_CONTROLLER.showUsersTable()) {
//            DEFAULT_TABLE.addRow(data);
//        }
//        tbUser.setModel(DEFAULT_TABLE);
//        System.out.println(Arrays.deepToString(USER_CONTROLLER.showUsersTable().toArray()));
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnScreen = new javax.swing.JPanel();
        pnLeftBar = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lbKaykrys = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        cboxRole = new javax.swing.JComboBox<>();
        scpnUserTable = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        btnRegister = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lbUserManagement = new javax.swing.JLabel();
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

        lbUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername.setText("Username");

        lbPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("Password");

        lbKaykrys.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lbKaykrys.setForeground(new java.awt.Color(255, 255, 255));
        lbKaykrys.setText("KAYKRYS");

        lbIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\small_icon_kaykrys.png")); // NOI18N

        lbRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRole.setForeground(new java.awt.Color(255, 255, 255));
        lbRole.setText("Role");

        cboxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier" }));

        javax.swing.GroupLayout pnLeftBarLayout = new javax.swing.GroupLayout(pnLeftBar);
        pnLeftBar.setLayout(pnLeftBarLayout);
        pnLeftBarLayout.setHorizontalGroup(
            pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftBarLayout.createSequentialGroup()
                .addGroup(pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbKaykrys))
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbRole)
                            .addComponent(lbPassword)
                            .addComponent(lbUsername)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(cboxRole, 0, 340, Short.MAX_VALUE)))
                    .addGroup(pnLeftBarLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lbIcon)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnLeftBarLayout.setVerticalGroup(
            pnLeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftBarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbKaykrys)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon)
                .addGap(63, 63, 63)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        pnScreen.add(pnLeftBar);
        pnLeftBar.setBounds(0, 0, 400, 850);

        tbUser.setBackground(new java.awt.Color(236, 236, 236));
        tbUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbUser.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Role"
            }
        ));
        tbUser.setGridColor(new java.awt.Color(255, 255, 255));
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        scpnUserTable.setViewportView(tbUser);

        pnScreen.add(scpnUserTable);
        scpnUserTable.setBounds(440, 290, 790, 270);

        btnRegister.setBackground(new java.awt.Color(204, 102, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Add");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnScreen.add(btnRegister);
        btnRegister.setBounds(500, 590, 160, 30);

        btnDelete.setBackground(new java.awt.Color(204, 102, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnScreen.add(btnDelete);
        btnDelete.setBounds(960, 590, 160, 30);

        btnUpdate.setBackground(new java.awt.Color(204, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnScreen.add(btnUpdate);
        btnUpdate.setBounds(730, 590, 160, 30);

        lbUserManagement.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lbUserManagement.setForeground(new java.awt.Color(204, 102, 255));
        lbUserManagement.setText("USER MANAGEMENT");
        pnScreen.add(lbUserManagement);
        lbUserManagement.setBounds(660, 30, 380, 70);

        lbBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\back_icon.png")); // NOI18N
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        pnScreen.add(lbBack);
        lbBack.setBounds(1560, 10, 30, 16);

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            String username = (String) txtUsername.getText();
            String password = txtPassword.getText();
            String role = (String) cboxRole.getSelectedItem();

//            if (USER_CONTROLLER.validateForm(username, password, role)) {
//                if (USER_CONTROLLER.userExists(username)) {
//                    JOptionPane.showMessageDialog(this, "The user " + username + " already exists");
//                } else {
//                    USER_CONTROLLER.user_model.setUsername(username);
//                    USER_CONTROLLER.user_model.setPassword(password);
//                    USER_CONTROLLER.user_model.setRole(role);
//                    USER_CONTROLLER.createFile(USER_CONTROLLER.user_model, username);
//
//                    resetForm();
//                    generateTable();
//                    JOptionPane.showMessageDialog(this, "User created");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "All fields are required");
//            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBackMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String username = (String) txtUsername.getText();
            if (!username.isEmpty()) {
//                USER_CONTROLLER.deleteFile(username);
                resetForm();
//                generateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a username");
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String role = (String) cboxRole.getSelectedItem();

//            if (USER_CONTROLLER.validateForm(username, password, role)) {
//                if (USER_CONTROLLER.userExists(username)) {
//                    USER_CONTROLLER.user_model.setUsername(username);
//                    USER_CONTROLLER.user_model.setPassword(password);
//                    USER_CONTROLLER.user_model.setRole(role);
//                    USER_CONTROLLER.updateFile(USER_CONTROLLER.user_model, username);
//
//                    resetForm();
//                    generateTable();
//                    JOptionPane.showMessageDialog(this, "User " + username + " updated");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "All fields are required");
//            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        try {
            int indice = tbUser.rowAtPoint(evt.getPoint());
            txtUsername.setText(String.valueOf(tbUser.getValueAt(indice, 0)));
            txtPassword.setText(String.valueOf(tbUser.getValueAt(indice, 1)));
            cboxRole.setSelectedItem(String.valueOf(tbUser.getValueAt(indice, 2)));
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tbUserMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxRole;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbKaykrys;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserManagement;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnLeftBar;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JScrollPane scpnUserTable;
    private javax.swing.JTable tbUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
