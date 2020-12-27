
package StudentManager;

import static StudentManager.Login.con;
import static StudentManager.Login.ManagerTab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class AddStudent extends javax.swing.JFrame {
    public AddStudent() {
        initComponents();
    }

    private boolean checkInfor(){
        String Msg=new String("Thông tin chưa đúng định dạng: \n");
        int error=0;
        //Cac truong khac rong
        if (txtMssv.getText().equals("")||txtDate.getText().equals("")||txtName.getText().equals("")||txtMarjor.getText().equals("")){
            Msg=Msg.concat("- Các trường đều phải khác rỗng !\n");
            error++;
        }
        //Ten va nganh khong duoc chua so
        if (txtName.getText().matches(".*\\d.*")||txtMarjor.getText().matches(".*\\d.*")){
            Msg=Msg.concat("- Tên sinh viên hoặc tên ngành không được chứa số !\n");
            error++;
        }
        //Kiem tra ngay sinh
        String check=new String(txtDate.getText().replace("-",""));
        try {
            int temp=Integer.parseInt(check);
            int d=Integer.parseInt(check.substring(6,8));
            int m=Integer.parseInt(check.substring(4,6));
            int y=Integer.parseInt(check.substring(0,4));
            int max[] = {0, 31,28,31,30,31,30,31, 31,30,31,30,31};
            if(y%4==0) max[2] = 29;
            if(!(y>0 && m > 0 && m <13 && d > 0 && d<=max[m]))
            {
                Msg=Msg.concat("- Ngày sinh không hợp lệ !\n");
                error++;
            }
        }
        catch (Exception e) {
            Msg=Msg.concat("- Ngày sinh không hợp lệ !\n");
            error++;
        }
        if (error!=0)       
        {
            JOptionPane.showMessageDialog(this, Msg);
            return false;
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMssv = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMarjor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("UVN Chu Ky", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm sinh viên");

        jLabel2.setText("Nhập MSSV");

        jLabel3.setText("Nhập họ tên sinh viên");

        jLabel4.setText("Nhập ngày sinh");

        txtMssv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMssvActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        rdNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Nhập ngành");

        jLabel7.setText("(định dạng yyyy-mm-dd)");

        btnAdd.setText("Thêm");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMssv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdNam)
                                        .addGap(51, 51, 51)
                                        .addComponent(rdNu))
                                    .addComponent(txtMarjor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarjor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMssvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMssvActionPerformed

    private void rdNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNamActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        //Kiem tra sinh vien da ton tai hay chua
        boolean invalid=true;
        try {
            Statement check=con.createStatement();
            ResultSet rs=check.executeQuery("select * from student where MSSV='"+txtMssv.getText()+"'");
            if (rs.next()){
                invalid=false;
                JOptionPane.showMessageDialog(this, "Sinh viên đã tồn tại");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
        }
        
        if (checkInfor()&&invalid){
            try {
                    Statement addStudent = con.createStatement();
                    String query=new String("insert into student values ('"
                        +txtMssv.getText()+"','"+txtName.getText()+"','"+txtDate.getText().toString()
                        +"','"+(rdNam.isSelected()?"Nam":"Nu").toString()+"','"+txtMarjor.getText()+"')");
                     System.out.print(query);
                    int rs=addStudent.executeUpdate(query);
                    ManagerTab.resetAfterUpdateStudent();
                    dispose();
                    JOptionPane.showMessageDialog(this, "Đã thêm thành công !");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
                }
                ManagerTab.loadData();
        }
        
    }//GEN-LAST:event_btnAddMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMarjor;
    private javax.swing.JTextField txtMssv;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
