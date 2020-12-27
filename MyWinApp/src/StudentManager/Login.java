package StudentManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import java.awt.event.KeyAdapter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Zevik
 */
public class Login extends javax.swing.JFrame {
    public static ManagerTab ManagerTab;
    public static Connection con;
    static final int TIME_VISIBLE = 2000;
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();

        jLabel1.setText("Quản lí sinh viên");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblHeader.setFont(new java.awt.Font("UVN Chu Ky", 0, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Quản lí sinh viên");
        lblHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 5, 10));

        lblAccount.setBackground(new java.awt.Color(153, 153, 255));
        lblAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAccount.setText("Tài khoản");
        jPanel1.add(lblAccount);

        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountKeyPressed(evt);
            }
        });
        jPanel1.add(txtAccount);

        lblPass.setBackground(new java.awt.Color(153, 153, 255));
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPass.setText("Mật khẩu");
        jPanel1.add(lblPass);

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass);

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.setEnabled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    try {
            //Tao cau lenh truy van tai khoan
            Statement login = con.createStatement();
            ResultSet rs=login.executeQuery("select * from login where TaiKhoan='"+txtAccount.getText()+"'");
            //Xac thuc thanh cong
            if (rs.next()&&rs.getString("MatKhau").equals(new String((txtPass.getPassword()))))
            {
                dispose();
                //Chuyen den tab Manager
                ManagerTab=new ManagerTab();
                ManagerTab.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu sai !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    private void enabledBtnLogin(java.awt.event.KeyEvent evt)
        {
             if (!txtAccount.getText().isEmpty()&&!(new String(txtPass.getPassword())).isEmpty())
            {
                btnLogin.setEnabled(true);
            }
            else btnLogin.setEnabled(false);
             //Cho phep nhat Enter de kich hoat button Login
            if (evt.getKeyCode()==KeyEvent.VK_ENTER){
                btnLogin.doClick();
            }
       
        }
    private void txtAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountKeyPressed
        //Enable btnLogin khi go phim
        enabledBtnLogin(evt);
    }//GEN-LAST:event_txtAccountKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        //Enable btnLogin khi go phim
        enabledBtnLogin(evt);
    }//GEN-LAST:event_txtPassKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login Login=new Login();
                Login.setVisible(true);
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String dbUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=StudentManager;user=sa;password=sa2008";
                    con = DriverManager.getConnection(dbUrl);
                    Statement s = con.createStatement();
                    ResultSet rs = s.executeQuery("select * from login");
                    while (rs.next()) {
                        System.out.println("Tài khoản: " + rs.getString(1) + " | Mật khẩu: "+rs.getString(2));
                        System.out.println("----------------------------------------------------------------------");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Login, "Không thể kết nối đến CSDL");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
