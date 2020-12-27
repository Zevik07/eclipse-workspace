
package StudentManager;

import static StudentManager.Login.con;
import static StudentManager.Login.ManagerTab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AddTab extends javax.swing.JFrame {
    public AddTab() {
        initComponents();
        loadData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboCourseCode = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGroup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTerm = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm điểm cho học phần");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("UVN Chu Ky", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm học phần");

        cboCourseCode.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel2.setText("Chọn mã học phần");

        jLabel3.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel3.setText("Nhập nhóm");

        jLabel4.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel4.setText("Nhập điểm");

        btnSave.setText("Lưu");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel5.setText("Nhập năm học");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel7.setText("Học kì");

        cboTerm.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtScore, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(cboCourseCode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtYear)
                            .addComponent(cboTerm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnSave)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(cboCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void loadData()
    {
        //Xoa du lieu cu
        cboCourseCode.removeAllItems();
        //Nap thong tin cho cboCourseCode
        try{
            Statement loadYear=con.createStatement();
            ResultSet rs=loadYear.executeQuery("select MaHP from course except "
                    + "select distinct score.MaHP from score, course "
                    + "where score.MaHP=course.MaHP and MSSV='"+ManagerTab.getMssvSelected()+"'");
            while (rs.next())
            {
                cboCourseCode.addItem(rs.getString(1));
            }
            cboCourseCode.setEnabled(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for (int i=1;i<=3;i++)
        {
            cboTerm.addItem(i+"");
        }
    }
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        //Kiem tra diem va nhom dung dinh dang
        int error=0;
        try{
            int valueScore=Integer.parseInt(txtScore.getText());
            int valueGroup=Integer.parseInt(txtGroup.getText());
            if (valueScore>10||valueScore<0||valueGroup<0){
                JOptionPane.showMessageDialog(this,"Điểm hoặc nhóm sai định dạng !");
            }
            else{
                try {
                    Statement addCourse = con.createStatement();
                    int rs=addCourse.executeUpdate("insert into score values ('"
                        +ManagerTab.getMssvSelected()+"','"+cboCourseCode.getSelectedItem()+"','"+txtGroup.getText()
                        +"','"+txtScore.getText()+"','"+cboTerm.getSelectedItem()+"','"+txtYear.getText()+"')");
                    dispose();
                    JOptionPane.showMessageDialog(this, "Đã thêm thành công !");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
                }
               
                ManagerTab.loadCourse();
                    }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Diem hoac nhom dinh dang !");
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboCourseCode;
    private javax.swing.JComboBox<String> cboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtGroup;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
