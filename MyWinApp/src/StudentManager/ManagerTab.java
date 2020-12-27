package StudentManager;

import static StudentManager.Login.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerTab extends javax.swing.JFrame {
    public ManagerTab() {
        initComponents();
        firstStateButton();
        loadData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblList = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfor = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnEditCourse = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        btnPrintCourse = new javax.swing.JButton();
        cboYear = new javax.swing.JComboBox<>();
        lblChooseYear = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        cboTerm = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí kết quả học tập sinh viên");
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));

        lblList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblList.setText("Danh sách sinh viên");

        lblInfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfor.setText("Thông tin học phần");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "HoTenSV", "NgaySinh", "Phai", "Nganh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableData.setShowGrid(false);
        tableData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableDataFocusLost(evt);
            }
        });
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        tableInfor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaHP", "TenHP", "SoTC", "Diem", "Nhom", "Tích luỹ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableInfor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableInforFocusLost(evt);
            }
        });
        tableInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInforMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableInfor);

        controlPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));

        btnAddStudent.setText("Thêm sinh viên");
        btnAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddStudentMouseClicked(evt);
            }
        });
        controlPanel.add(btnAddStudent);

        btnDeleteStudent.setText("Xoá sinh viên");
        btnDeleteStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteStudentMouseClicked(evt);
            }
        });
        controlPanel.add(btnDeleteStudent);

        btnAddCourse.setText("Thêm HP");
        btnAddCourse.setEnabled(false);
        btnAddCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCourseMouseClicked(evt);
            }
        });
        controlPanel.add(btnAddCourse);

        btnEditCourse.setText("Sửa HP");
        btnEditCourse.setEnabled(false);
        btnEditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseClicked(evt);
            }
        });
        controlPanel.add(btnEditCourse);

        btnDeleteCourse.setText("Xoá HP");
        btnDeleteCourse.setEnabled(false);
        btnDeleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCourseMouseClicked(evt);
            }
        });
        controlPanel.add(btnDeleteCourse);

        btnPrintCourse.setText("In bảng điểm");
        btnPrintCourse.setEnabled(false);
        btnPrintCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintCourseMouseClicked(evt);
            }
        });
        btnPrintCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCourseActionPerformed(evt);
            }
        });
        controlPanel.add(btnPrintCourse);

        cboYear.setEnabled(false);
        cboYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboYearItemStateChanged(evt);
            }
        });

        lblChooseYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChooseYear.setText("Chọn năm học");

        lblTerm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerm.setText("Học kì");

        cboTerm.setEnabled(false);
        cboTerm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTermItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lblChooseYear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(controlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTerm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTerm)
                            .addComponent(cboYear)
                            .addComponent(lblChooseYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void firstStateButton(){
        btnAddCourse.setEnabled(false);
        btnEditCourse.setEnabled(false);
        btnDeleteCourse.setEnabled(false);
        btnPrintCourse.setEnabled(false);
        btnDeleteStudent.setEnabled(false);
    }
    public void resetAfterUpdateCourse()
    {
        btnEditCourse.setEnabled(false);
        btnDeleteCourse.setEnabled(false);
    }
    public void resetAfterUpdateStudent()
    {
        btnAddCourse.setEnabled(false);
        btnEditCourse.setEnabled(false);
        btnDeleteCourse.setEnabled(false);
        btnPrintCourse.setEnabled(false);
        btnDeleteStudent.setEnabled(false);
        
    }
    public void loadData()
    {
        //Xoa du lieu cu trong bang
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        model.setRowCount(0);
        //Hien thong tin sinh vien vao JTable
        try{
            Statement LoadData=con.createStatement();
            ResultSet rs=LoadData.executeQuery("Select * from student");
            tableData.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableData.getColumnModel().getColumn(2).setPreferredWidth(30);
            tableData.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(150);
            while (rs.next())
            {
                Object[] rowData={rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5)}; 
                model.addRow(rowData);
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private void loadYear()
    {
        //Xoa du lieu nam cu
        cboYear.removeAllItems();
        //Nap thong tin cho cboYear neu du lieu table Data ton tai
        if (tableData.getRowCount()>0)
        {
            try{
                Statement loadYear=con.createStatement();
                ResultSet rs=loadYear.executeQuery("select distinct NamHoc from score where MSSV='"+this.getMssvSelected()+"'");
                while (rs.next())
                {
                    cboYear.addItem(rs.getString(1));
                }
                cboYear.setEnabled(true);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    private void loadTerm()
    {
        //Xoa du lieu hoc ki cu
        cboTerm.removeAllItems();
        //Nap thong tin cho cboTerm neu cboYear ton tai gia tri
        if (cboYear.getItemCount()>0)
        {
            try{
                Statement loadTerm=con.createStatement();
                ResultSet rs2=loadTerm.executeQuery("select distinct HocKi from score where MSSV='"+this.getMssvSelected()+"'"+" and "+"NamHoc="+cboYear.getSelectedItem());
                while (rs2.next())
                {
                    cboTerm.addItem(rs2.getString(1));
                }
                cboTerm.setEnabled(true);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void loadCourse()
    {
        //Xoa du lieu cu trong bang
        DefaultTableModel model = (DefaultTableModel) tableInfor.getModel();
        model.setRowCount(0);
        //Nap thong tin cac khoa hoc neu cboYear va cboTerm ton tai gia tri
        if (cboYear.getItemCount()>0&&cboTerm.getItemCount()>0)
        {
            try{
                Statement LoadCourse=con.createStatement();
                ResultSet rs=LoadCourse.executeQuery("select score.MaHP,TenHP,SoTC,Diem,Nhom,TichLuy from score, course "
                        + "where score.MaHP=course.MaHP and NamHoc='"+cboYear.getSelectedItem()+"' and HocKi='"+cboTerm.getSelectedItem()+"' and MSSV='"+getMssvSelected()+"'");
                while (rs.next())
                {
                    Object[] rowData={rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5),rs.getString(6)}; 
                    model.addRow(rowData);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String getMssvSelected()
    {
        int row = tableData.getSelectedRow();
        String mssvDataSelected = new String(tableData.getModel().getValueAt(row, 0).toString());
        return mssvDataSelected;
    }
    public String getNameSelected()
    {
        int row = tableData.getSelectedRow();
        String nameDataSelected = new String(tableData.getModel().getValueAt(row, 1).toString());
        return nameDataSelected;
    }
    public String getDateSelected(){
        int row = tableData.getSelectedRow();
        String dateDataSelected = new String(tableData.getModel().getValueAt(row, 2).toString());
        return dateDataSelected;
    }
    public String getMajorSelected()
    {
        int row = tableData.getSelectedRow();
        String majorDataSelected = new String(tableData.getModel().getValueAt(row, 4).toString());
        return majorDataSelected;
    }
    public String getCboYearSelected()
    {
        return cboYear.getSelectedItem().toString();
    }
    public String getCboTermSelected()
    {
        return cboTerm.getSelectedItem().toString();
    }
    public double getScoreSelected()
    {
        int row = tableInfor.getSelectedRow();
        double scoreSelected = (double) tableInfor.getModel().getValueAt(row, 3);
        return scoreSelected;
    }
    public String getGroupSelected()
    {
        int row = tableInfor.getSelectedRow();
        String groupSelected = new String(tableInfor.getModel().getValueAt(row, 4).toString());
        return groupSelected;
    }
    public String getCourseCodeSelected()
    {
        int row = tableInfor.getSelectedRow();
        String getCourseCodeSelected = new String(tableInfor.getModel().getValueAt(row, 0).toString());
        return getCourseCodeSelected;
    }
    public javax.swing.JTable getTableInfor()
    {
        return tableInfor;
    }
    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        loadYear();
        loadTerm();
        loadCourse();
        //Khi table data duoc click thi cho phep 2 nut nay
        btnAddCourse.setEnabled(true);
        if (tableInfor.getRowCount()>0) btnPrintCourse.setEnabled(true);
        else btnPrintCourse.setEnabled(false);
        btnDeleteStudent.setEnabled(true);
    }//GEN-LAST:event_tableDataMouseClicked

    private void cboTermItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTermItemStateChanged
        loadCourse();
    }//GEN-LAST:event_cboTermItemStateChanged

    private void cboYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboYearItemStateChanged
        loadTerm();
        loadCourse();
    }//GEN-LAST:event_cboYearItemStateChanged

    private void btnAddCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMouseClicked
        new AddTab().setVisible(true);
    }//GEN-LAST:event_btnAddCourseMouseClicked

    private void btnEditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseClicked
        new EditTab().setVisible(true);
        resetAfterUpdateCourse();
    }//GEN-LAST:event_btnEditCourseMouseClicked

    private void btnDeleteCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCourseMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá học phần này ?"
                                , "Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)               
                {
                    try {
                        Statement deleteCourse=con.createStatement();
                        int deleteRs=deleteCourse.executeUpdate("delete from score where MSSV='"
                                     +this.getMssvSelected()+"' and MaHP='"+this.getCourseCodeSelected()+"'");
                        JOptionPane.showMessageDialog(this,"Xoá học phần thành công !");
                    }
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this,"Lỗi truy vấn !");
                    }
                    loadCourse();
                    //Vo hieu sau khi xoa
                    resetAfterUpdateCourse();
                }
    }//GEN-LAST:event_btnDeleteCourseMouseClicked

    private void btnPrintCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintCourseMouseClicked
        new printScoreTable().setVisible(true);
    }//GEN-LAST:event_btnPrintCourseMouseClicked

    private void btnPrintCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintCourseActionPerformed

    private void tableInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInforMouseClicked
       //Khi Infor duoc click thi cho phep 2 nut nay
        btnDeleteCourse.setEnabled(true);
        btnEditCourse.setEnabled(true);
    }//GEN-LAST:event_tableInforMouseClicked

    private void tableInforFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableInforFocusLost

    }//GEN-LAST:event_tableInforFocusLost

    private void tableDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableDataFocusLost

    }//GEN-LAST:event_tableDataFocusLost

    private void btnAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddStudentMouseClicked
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_btnAddStudentMouseClicked

    private void btnDeleteStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteStudentMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sinh viên này ?"
                                , "Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)               
                {
                    try {
                        Statement deleteCourse=con.createStatement();
                        int deleteRs=deleteCourse.executeUpdate("delete from student where MSSV='"
                                     +this.getMssvSelected()+"'");
                        JOptionPane.showMessageDialog(this,"Xoá sinh viên thành công !");
                        loadData();
                        resetAfterUpdateStudent();
                    }
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this,"Lỗi truy vấn !");
                    }
                }
    }//GEN-LAST:event_btnDeleteStudentMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnEditCourse;
    private javax.swing.JButton btnPrintCourse;
    private javax.swing.JComboBox<String> cboTerm;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChooseYear;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblList;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tableData;
    private javax.swing.JTable tableInfor;
    // End of variables declaration//GEN-END:variables
}
