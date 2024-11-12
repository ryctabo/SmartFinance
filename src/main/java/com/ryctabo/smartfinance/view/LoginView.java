package com.ryctabo.smartfinance.view;

import com.ryctabo.smartfinance.controller.manager.InMemorySessionManager;
import com.ryctabo.smartfinance.model.login.SessionManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnScreen = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbKaykrys = new javax.swing.JLabel();
        lbCopyright = new javax.swing.JLabel();
        pnRight = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chboxShowPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        lbExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        pnScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnScreen.setPreferredSize(new java.awt.Dimension(800, 500));
        pnScreen.setLayout(null);

        pnLeft.setBackground(new java.awt.Color(204, 102, 255));
        pnLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnLeft.setPreferredSize(new java.awt.Dimension(400, 500));

        lbIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\small_icon_kaykrys.png")); // NOI18N

        lbKaykrys.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lbKaykrys.setForeground(new java.awt.Color(255, 255, 255));
        lbKaykrys.setText("Kaykrys");

        lbCopyright.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCopyright.setForeground(new java.awt.Color(204, 204, 204));
        lbCopyright.setText("Copyright © Kaykrys all rights reserved");

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLeftLayout.createSequentialGroup()
                        .addComponent(lbKaykrys)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLeftLayout.createSequentialGroup()
                        .addComponent(lbIcon)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLeftLayout.createSequentialGroup()
                        .addComponent(lbCopyright)
                        .addGap(78, 78, 78))))
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbKaykrys)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(lbCopyright)
                .addGap(71, 71, 71))
        );

        pnScreen.add(pnLeft);
        pnLeft.setBounds(0, 0, 400, 500);

        pnRight.setBackground(new java.awt.Color(255, 255, 255));
        pnRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnRight.setPreferredSize(new java.awt.Dimension(400, 500));

        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(204, 102, 255));
        lbLogin.setText("LOGIN");

        lbUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(102, 102, 102));
        lbUsername.setText("Username");

        lbPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(102, 102, 102));
        lbPassword.setText("Password");

        chboxShowPassword.setForeground(new java.awt.Color(102, 102, 102));
        chboxShowPassword.setText("Show password");

        btnLogin.setBackground(new java.awt.Color(204, 102, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");

        lbExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documents\\NetBeansProjects\\SmartFinance\\src\\Icon\\icons_eliminar_close.png")); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbExit)
                .addContainerGap())
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chboxShowPassword)
                            .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLogin)
                                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbUsername)
                                    .addComponent(txtUsername)
                                    .addComponent(lbPassword)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))))
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lbLogin)))
                .addGap(29, 42, Short.MAX_VALUE))
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogin)
                .addGap(39, 39, 39)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chboxShowPassword)
                .addGap(81, 81, 81)
                .addComponent(btnLogin)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pnScreen.add(pnRight);
        pnRight.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);

        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnLoginActionPerformed(actionEvent);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        SessionManager sessionManager = InMemorySessionManager.getInstance();
        try {
            var user = sessionManager.login(username, password);
            System.out.println("Logging user with name: " + user.getUsername() + " and has role: " + user.getRole());
        } catch (Exception ex) {
            System.out.println("El usuario o contraseña es incorrecto");
        }
    }

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chboxShowPassword;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbKaykrys;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
