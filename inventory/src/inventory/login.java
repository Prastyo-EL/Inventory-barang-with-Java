/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import static inventory.superadmin.sha1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author muhamadyusuf
 */
public final class login extends javax.swing.JFrame {

    String k;
    /**
     * Creates new form FrmloginPetugas
     */
    inventory.koneksi konek = new inventory.koneksi();
    inventory.PetugasSession PetugasSession = new inventory.PetugasSession();

    public login() {

        initComponents();
        initUI();
        user1.setVisible(true);
        admin1.setVisible(true);
        superadmin1.setVisible(true);

    }

    private void initUI() {
        getContentPane().setBackground(new Color(245, 245, 245));

        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlogin = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();
        admin1 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        superadmin1 = new javax.swing.JLabel();
        superadmin2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnlogin.setBackground(new java.awt.Color(43, 152, 240));
        btnlogin.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Masuk");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/key.png"))); // NOI18N
        jLabel10.setText("Password");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/user.png"))); // NOI18N
        jLabel9.setText("Username");

        jPanel1.setBackground(new java.awt.Color(43, 152, 240));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(182, 229, 251));
        jLabel8.setText("INVENTORI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(32, 32, 32))
        );

        user1.setLabelFor(user1);
        user1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                user1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user1MouseEntered(evt);
            }
        });

        user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user2MouseClicked(evt);
            }
        });

        admin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admin1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admin1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin1MouseEntered(evt);
            }
        });

        admin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin2MouseClicked(evt);
            }
        });

        superadmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        superadmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superadmin1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                superadmin1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                superadmin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                superadmin1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                superadmin1MouseEntered(evt);
            }
        });

        superadmin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                superadmin2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtusername)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(user2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(superadmin2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superadmin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(superadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(superadmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(admin2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String row_txtusername = txtusername.getText();
        //String row_txtpassword = txtpassword.getText();
        String row_txtpassword = null;

        try {
            try {
                row_txtpassword = sha1(Arrays.toString(txtpassword.getPassword()));
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "SELECT * FROM tmsuperadmin where username = '" + row_txtusername + "' and password = '" + row_txtpassword + "' and hak_akses='user'";
            String sq = "SELECT  * FROM tmsuperadmin where username = '" + row_txtusername + "' and password = '" + row_txtpassword + "' and hak_akses='admin'";
            String sqe = "SELECT * FROM tmsuperadmin where username = '" + row_txtusername + "' and password = '" + row_txtpassword + "' and hak_akses='s_admin'";
            if (null == k) {
                JOptionPane.showMessageDialog(null, "SELECT USER OR ADMIN FOR LOGIN");
            } else {
                switch (k) {
                    case "USER":
                        try {
                            java.sql.Connection conn = konek.openkoneksi();
                            java.sql.Statement stm = conn.createStatement();
                            java.sql.ResultSet rsLogin = stm.executeQuery(sql);
                            rsLogin.next();
                            rsLogin.last();
                            if (rsLogin.getRow() == 1) {
                                PetugasSession.setU_id(rsLogin.getInt("id"));
                                PetugasSession.setU_username(rsLogin.getString("username"));
                                PetugasSession.setU_password(row_txtpassword);
                                PetugasSession.setU_nama(rsLogin.getString("nama"));
                                System.out.println("USER");
                                user g = new user();
                                g.setVisible(true);
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Maaf password atau username anda salah");
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                            }
                            konek.closekoneksi();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        break;
                    case "ADMIN":
                        try {
                            java.sql.Connection conn = konek.openkoneksi();
                            java.sql.Statement stm = conn.createStatement();
                            java.sql.ResultSet rs = stm.executeQuery(sq);
                            rs.next();
                            rs.last();
                            if (rs.getRow()==1) {
                                PetugasSession.setU_id(rs.getInt("id"));
                                PetugasSession.setU_username(rs.getString("username"));
                                PetugasSession.setU_password(row_txtpassword);
                                PetugasSession.setU_nama(rs.getString("nama"));
                                System.out.println("ADMIN");
                                admin j = new admin();
                                //A j = new A();
                                j.setVisible(true);
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Maaf password atau username anda salah");
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                            }
                            konek.closekoneksi();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        break;
                    case "SUPERADMIN":
                        try {
                            java.sql.Connection conn = konek.openkoneksi();
                            java.sql.Statement stm = conn.createStatement();
                            ResultSet rs = stm.executeQuery(sqe);
                            rs.next();
                            rs.last();
                            if (rs.getRow()==1) {
                                PetugasSession.setU_id(rs.getInt("id"));
                                PetugasSession.setU_username(rs.getString("username"));
                                PetugasSession.setU_password(row_txtpassword);
                                PetugasSession.setU_nama(rs.getString("nama"));
                                System.out.println("SUPERADMIN");
                                superadminn j = new superadminn();
                                j.setVisible(true);
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Maaf password atau username anda salah");
                                txtusername.setText("");
                                txtpassword.setText("");
                                txtusername.requestFocus();
                            }
                            konek.closekoneksi();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        // TODO add your handling code here:
        ImageIcon AA = new ImageIcon(getClass().getResource("/userselect/image/u2.png"));
        user2.setIcon(AA);

        user1.setEnabled(false);
        user1.setVisible(false);
        user2.setEnabled(true);
        user2.setVisible(true);
        admin1.setEnabled(false);
        superadmin1.setEnabled(false);
        superadmin1.setVisible(false);
        admin1.setVisible(false);

        user1.setText("USER");
        k = user1.getText();
        System.out.println(k);
    }//GEN-LAST:event_user1MouseClicked

    private void user1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u1.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseEntered

    private void user1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseExited

    private void user1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MousePressed
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u2.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MousePressed

    private void user1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseReleased
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);
    }//GEN-LAST:event_user1MouseReleased

    private void admin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseClicked
        // TODO add your handling code here:
        ImageIcon AB = new ImageIcon(getClass().getResource("/userselect/image/a2.png"));
        admin2.setIcon(AB);

        user1.setEnabled(false);
        user1.setVisible(false);
        admin2.setEnabled(true);
        admin2.setVisible(true);
        admin1.setEnabled(false);
        superadmin1.setEnabled(false);
        superadmin1.setVisible(false);
        admin1.setVisible(false);

        admin1.setText("ADMIN");
        k = admin1.getText();
    }//GEN-LAST:event_admin1MouseClicked

    private void admin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a1.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseEntered

    private void admin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseExited

    private void admin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MousePressed
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a2.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MousePressed

    private void admin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin1MouseReleased
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);
    }//GEN-LAST:event_admin1MouseReleased

    private void admin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin2MouseClicked
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/a.png"));
        admin1.setIcon(A);

        admin1.setEnabled(true);
        admin1.setVisible(true);
        admin2.setEnabled(false);
        admin2.setVisible(false);
        user1.setEnabled(true);
        superadmin1.setEnabled(true);
        superadmin1.setVisible(true);
        superadmin2.setEnabled(false);
        superadmin2.setVisible(false);
        user1.setVisible(true);

        admin1.setText("");
        k = admin1.getText();
    }//GEN-LAST:event_admin2MouseClicked

    private void user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseClicked
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/u.png"));
        user1.setIcon(A);

        user1.setEnabled(true);
        user1.setVisible(true);
        user2.setEnabled(false);
        user2.setVisible(false);
        admin1.setEnabled(true);
        superadmin1.setEnabled(true);
        superadmin1.setVisible(true);
        superadmin2.setEnabled(false);
        superadmin2.setVisible(false);
        admin1.setVisible(true);

        user1.setText("");
        k = user1.getText();
    }//GEN-LAST:event_user2MouseClicked

    private void superadmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin1MouseClicked
        // TODO add your handling code here:
        ImageIcon AB = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin2.setIcon(AB);

        user1.setEnabled(false);
        user1.setVisible(false);
        superadmin2.setEnabled(true);
        superadmin2.setVisible(true);
        admin1.setEnabled(false);
        superadmin1.setEnabled(false);
        superadmin1.setVisible(false);
        admin1.setVisible(false);

        superadmin1.setText("SUPERADMIN");
        k = superadmin1.getText();
    }//GEN-LAST:event_superadmin1MouseClicked

    private void superadmin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin1MouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin1.setIcon(A);
    }//GEN-LAST:event_superadmin1MouseEntered

    private void superadmin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin1MouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin1.setIcon(A);
    }//GEN-LAST:event_superadmin1MouseExited

    private void superadmin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin1MousePressed
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin1.setIcon(A);
    }//GEN-LAST:event_superadmin1MousePressed

    private void superadmin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin1MouseReleased
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin1.setIcon(A);
    }//GEN-LAST:event_superadmin1MouseReleased

    private void superadmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superadmin2MouseClicked
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("/userselect/image/superadmin.png"));
        superadmin1.setIcon(A);

        user1.setEnabled(true);
        user1.setVisible(true);
        user2.setEnabled(false);
        user2.setVisible(false);
        admin1.setEnabled(true);
        superadmin1.setEnabled(true);
        superadmin1.setVisible(true);
        superadmin2.setEnabled(false);
        superadmin2.setVisible(false);
        admin1.setVisible(true);

        superadmin1.setText("");
        k = superadmin1.getText();
    }//GEN-LAST:event_superadmin2MouseClicked

    static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException, IllegalAccessException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
 /*UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");*/
 /*UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");*/
 /*UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                /*UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                /*UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                /*UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");*/
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin1;
    private javax.swing.JLabel admin2;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel superadmin1;
    private javax.swing.JLabel superadmin2;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}