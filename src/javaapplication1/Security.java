/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Arun
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Security extends javax.swing.JFrame {

    /**
     * Creates new form Security
     */
    public Security() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        if(twoFactor.getText()=="Disabled") {
            qrImg.setVisible(false);
            Next.setVisible(false);
            desc.setVisible(false);
        }
        if(twofactoryes(Login.user)) {
            twoFactor.setText("Enabled");
            twoFactor.setBackground(new java.awt.Color(38,166,91));
        }
        
    }
        String secretKey;
        twoFactor t = new twoFactor();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        Next = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        twoFactor = new javax.swing.JToggleButton();
        qrImg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UserProfile = new javax.swing.JLabel();
        SecuritySettings = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        UserStats = new javax.swing.JLabel();
        Feedback = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 615));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Password:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(230, 20, 130, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Confirm Password:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 100, 210, 30);

        desc.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        desc.setForeground(new java.awt.Color(236, 240, 241));
        desc.setText("Scan above image with Google Authenticator then hit Next");
        jPanel2.add(desc);
        desc.setBounds(20, 430, 530, 30);

        jPasswordField4.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPasswordField4.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(jPasswordField4);
        jPasswordField4.setBounds(180, 50, 210, 30);

        jPasswordField5.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPasswordField5.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(jPasswordField5);
        jPasswordField5.setBounds(180, 130, 210, 30);

        Next.setBackground(new java.awt.Color(89, 171, 227));
        Next.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Next");
        Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel2.add(Next);
        Next.setBounds(160, 460, 100, 40);

        Save.setBackground(new java.awt.Color(38, 166, 91));
        Save.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(240, 280, 100, 40);

        twoFactor.setBackground(new java.awt.Color(242, 38, 19));
        twoFactor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        twoFactor.setForeground(new java.awt.Color(255, 255, 255));
        twoFactor.setText("Disabled");
        twoFactor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoFactorActionPerformed(evt);
            }
        });
        jPanel2.add(twoFactor);
        twoFactor.setBounds(239, 220, 100, 40);

        qrImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(qrImg);
        qrImg.setBounds(190, 270, 200, 160);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("2-Factor Authentication:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(180, 180, 240, 30);

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 459));

        UserProfile.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UserProfile.setForeground(new java.awt.Color(236, 240, 241));
        UserProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-user.png"))); // NOI18N
        UserProfile.setText("User Profile");
        UserProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserProfile.setMinimumSize(new java.awt.Dimension(196, 48));
        UserProfile.setPreferredSize(new java.awt.Dimension(196, 48));
        UserProfile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UserProfileMouseMoved(evt);
            }
        });
        UserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserProfileMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserProfileMouseExited(evt);
            }
        });

        SecuritySettings.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SecuritySettings.setForeground(new java.awt.Color(236, 240, 241));
        SecuritySettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-key.png"))); // NOI18N
        SecuritySettings.setText("Security Settings");
        SecuritySettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecuritySettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseMoved(evt);
            }
        });
        SecuritySettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseExited(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(236, 240, 241));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-shutdown.png"))); // NOI18N
        LogOut.setText("Log Out");
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogOutMouseMoved(evt);
            }
        });
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });

        Home.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(236, 240, 241));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-home.png"))); // NOI18N
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomeMouseMoved(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        UserStats.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UserStats.setForeground(new java.awt.Color(236, 240, 241));
        UserStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-new_spreadsheet.png"))); // NOI18N
        UserStats.setText("User Stats");
        UserStats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserStats.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UserStatsMouseMoved(evt);
            }
        });
        UserStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserStatsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserStatsMouseExited(evt);
            }
        });

        Feedback.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Feedback.setForeground(new java.awt.Color(236, 240, 241));
        Feedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-comments.png"))); // NOI18N
        Feedback.setText("Feedback");
        Feedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Feedback.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FeedbackMouseMoved(evt);
            }
        });
        Feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeedbackMouseExited(evt);
            }
        });

        Help.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Help.setForeground(new java.awt.Color(236, 240, 241));
        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-why_us.png"))); // NOI18N
        Help.setText("Help");
        Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Help.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HelpMouseMoved(evt);
            }
        });
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SecuritySettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(LogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UserStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SecuritySettings)
                .addGap(18, 18, 18)
                .addComponent(UserStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Home)
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 22);

        jLabelClose.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseMoved(evt);
            }
        });
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(760, 10, 12, 22);

        jLabelMin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin);
        jLabelMin.setBounds(740, 10, 11, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserProfileMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseMoved
        UserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_UserProfileMouseMoved

    private void UserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseClicked
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_UserProfileMouseClicked

    private void UserProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseExited
        UserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_UserProfileMouseExited

    private void SecuritySettingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseMoved
        SecuritySettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_SecuritySettingsMouseMoved

    private void SecuritySettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseExited
        SecuritySettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_SecuritySettingsMouseExited

    private void LogOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseMoved
        LogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_LogOutMouseMoved

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        addtimestampin(Login.user);
        addtimestamp(Login.user);
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        LogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_LogOutMouseExited

    private void HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseMoved
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_HomeMouseMoved

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Main main = new Main();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_HomeMouseExited

    private void jLabelCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseMoved

    }//GEN-LAST:event_jLabelCloseMouseMoved

    public void addtimestamp(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            Timestamp time = new Timestamp(System.currentTimeMillis());
            String sql = "update user SET last_logged_out = '"+time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
    }
    
    public void addtimestampin(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            
            String sql = "update user SET last_logged_in = '"+Login.time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
        }
    
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        addtimestampin(Login.user);
        addtimestamp(Login.user);
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited

    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void SecuritySettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseClicked
        this.setVisible(true);
    }//GEN-LAST:event_SecuritySettingsMouseClicked

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        Main main = new Main();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_NextMouseClicked
    
    public void updateuserprofile(String user, String msg) {
            try {
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            String sql = "update user SET twofactor = '"+msg+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
    }
    
    public void createtwofactor(String secretkey, String user) {
        try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            String sql = "insert into twofactor (secretkey,user) VALUES ('"+secretkey+"','"+user+"')";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
    }
    
    public boolean twofactoryes(String user) {
        try {
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            String sql = "select * from user where username='"+user+"' and twofactor='YES'";
            
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()) {
                return true;
            }
            connect.close();
        }
        catch (Exception e) {}
        return false;
    }
    
    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
       String next = JOptionPane.showInputDialog("Please enter 6 digits code for verification:");
       if(next == null) {
           
       }
       else {
        //verification part
          String lastCode = null;
            while (true) {
            String code = t.getTOTPCode(secretKey);
            if (!code.equals(lastCode)) {
                // output a new 6 digit code
                while (!next.equals(code)) {
                    next = JOptionPane.showInputDialog("\t Incorrect code! Please try again: ");
                    if(next == null) {
                        break;
                    }
                    }
                    if(next!=null && next.equals(code)) {
                    JOptionPane.showMessageDialog(null, "Successfully verified and 2 factor enabled for user: "+Login.user);
                    twoFactor.setBackground(new java.awt.Color(38,166,91));
                    twoFactor.setText("Enabled");
                    next = code;
                    //save secretkey into db and add 2fa enabled for user in user profile
                    updateuserprofile(Login.user,"YES");
                    createtwofactor(secretKey,Login.user);
                    break;
                    }
                    else if(next == null) {
                        break;
                    }
            }
                lastCode = code;
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {};
            }
       }
    }//GEN-LAST:event_NextActionPerformed

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        Registration reg = new Registration();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_SaveMouseClicked

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

    }//GEN-LAST:event_SaveActionPerformed

    private void twoFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoFactorActionPerformed
        int input=1000;
        if(twoFactor.isSelected()) {
                secretKey = t.getRandomSecretKey();
                String barcodeData = t.getGoogleAuthenticatorBarCode(secretKey,Login.user,"Stock Prediction");
            //calls to createQRCode
            try {
                t.createQRCode(barcodeData,"src/resources/qruser.png",150,150);
                Thread.sleep(3000);
            }
            catch(Exception e) {
                System.out.println("Error: "+e);
            }
            if(twofactoryes(Login.user)) {
                input = JOptionPane.showOptionDialog(null, "Do you wish to reset your 2 factor details?", "Message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            }
            else {
            JOptionPane.showMessageDialog(null, " In order to use 2 Factor Authentication service\n you must have Google Authenticator Application\n installed in your mobile phone");
            Save.setBounds(310,460,Save.getWidth(),Save.getHeight());
            qrImg.setVisible(true);
            Next.setVisible(true);
            desc.setVisible(true);
            qrImg.setIcon(new ImageIcon(getClass().getResource("/resources/qruser.png")));
            }
            if(input == JOptionPane.OK_OPTION)
            {
            updateuserprofile(Login.user,"NO");
            twoFactor.setBackground(new java.awt.Color(242,38,19));
            twoFactor.setText("Disabled");
            JOptionPane.showMessageDialog(null, " In order to use 2 Factor Authentication service\n you must have Google Authenticator Application\n installed in your mobile phone");
            Save.setBounds(310,460,Save.getWidth(),Save.getHeight());
            qrImg.setVisible(true);
            Next.setVisible(true);
            desc.setVisible(true);
            qrImg.setIcon(new ImageIcon(getClass().getResource("/resources/qruser.png")));
            }
            if(input == JOptionPane.CANCEL_OPTION) {
                if(twoFactor.getText()=="Enabled") {
                    //do nothing
                }
                
            }
            else if(input == JOptionPane.CANCEL_OPTION){
            twoFactor.setBackground(new java.awt.Color(242,38,19));
            twoFactor.setText("Disabled");
            Save.setBounds(240,280,Save.getWidth(),Save.getHeight());
            qrImg.setVisible(false);
            Next.setVisible(false);
            desc.setVisible(false);
            }
        } 
        
        else {
            
            /*twoFactor.setBackground(new java.awt.Color(242,38,19));
            twoFactor.setText("Disabled");
            Save.setBounds(240,280,Save.getWidth(),Save.getHeight());
            qrImg.setVisible(false);
            Next.setVisible(false);
            desc.setVisible(false);*/
            
        }
    }//GEN-LAST:event_twoFactorActionPerformed

    private void UserStatsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserStatsMouseMoved
        UserStats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_UserStatsMouseMoved

    private void UserStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserStatsMouseClicked
        UserStats ustats = new UserStats();
        ustats.setVisible(true);
        ustats.pack();
        ustats.setLocationRelativeTo(null);
        ustats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_UserStatsMouseClicked

    private void UserStatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserStatsMouseExited
        UserStats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_UserStatsMouseExited

    private void FeedbackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackMouseMoved
        Feedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_FeedbackMouseMoved

    private void FeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackMouseClicked
        Feedback feed = new Feedback();
        feed.setVisible(true);
        feed.pack();
        feed.setLocationRelativeTo(null);
        feed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_FeedbackMouseClicked

    private void FeedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackMouseExited
        Feedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_FeedbackMouseExited

    private void HelpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseMoved
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_HelpMouseMoved

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        HelpDashboard help = new HelpDashboard();
        help.setVisible(true);
        help.pack();
        help.setLocationRelativeTo(null);
        help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_HelpMouseClicked

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_HelpMouseExited

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
            java.util.logging.Logger.getLogger(Security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Security().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Feedback;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton Next;
    private javax.swing.JButton Save;
    private javax.swing.JLabel SecuritySettings;
    private javax.swing.JLabel UserProfile;
    private javax.swing.JLabel UserStats;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel qrImg;
    private javax.swing.JToggleButton twoFactor;
    // End of variables declaration//GEN-END:variables
}