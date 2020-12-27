/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManager;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.AreaBreak; 
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import StudentManager.Login;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import java.io.File;
import javax.swing.JTable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import static StudentManager.Login.ManagerTab;
import static StudentManager.Login.con;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class printScoreTable extends javax.swing.JFrame {
    private static PdfDocument PdfDocument;
    private static Document document;
    private static String FILE = "C:\\Users\\Zevik\\eclipse-workspace\\MyWinApp\\src\\StudentManager\\PrintResult\\"+ManagerTab.getMssvSelected()+"BangDiem"+".pdf";
    public printScoreTable() {
        initComponents();
        afterInit();
    }
    private void afterInit(){
        txtName.setText(ManagerTab.getMssvSelected()+"BangDiem");
    }
    private static void documentFormat()
    {
        document = new Document(PdfDocument,PageSize.A4);
        //Tao font tieng viet
        try {
            FontProgram FontProgram = FontProgramFactory.createFont("C:\\Users\\Zevik\\Downloads\\VietFontsWeb1_ttf\\vuTimes.ttf");
            PdfFont vieFont=PdfFontFactory.createFont(FontProgram, PdfEncodings.IDENTITY_H, true);
            document.setFont(vieFont);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        document.setBackgroundColor(new DeviceRgb(173,216,230));
    }
    private void addTitle() {
        //Them title cho PDF
        Paragraph titlePage = new Paragraph("| Trường đại học Cần Thơ |").setFontSize(18).setBold().setTextAlignment(TextAlignment.CENTER);
        Paragraph subTitlePage = new Paragraph("KẾT QUẢ HỌC TẬP \n--------").setFontSize(16).setBold().setTextAlignment(TextAlignment.CENTER);
        //Them thong tin người tạo
        document.add(new Paragraph("Bảng điểm được tạo bởi: Thien Phu B1805805 "+new Date()).setFontSize(8).setTextAlignment(TextAlignment.LEFT));
        document.add(titlePage);
        document.add(subTitlePage);
        
    }
    private void addInfor() {
        Paragraph infor=new Paragraph("Họ tên sinh viên: "+ ManagerTab.getNameSelected()+"    MSSV: "+ManagerTab.getMssvSelected());
        infor.add("\nNgày sinh: "+ManagerTab.getDateSelected());
        infor.add("\nNgành: "+ManagerTab.getMajorSelected());
        infor.add("\n\n\nHọc Kỳ "+ManagerTab.getCboTermSelected()+" - Năm Học "+ManagerTab.getCboYearSelected());
        infor.setFontSize(12).setTextAlignment(TextAlignment.LEFT);
        document.add(infor);
    }
    public double convertScore(double diem){
        if(diem >=4 && diem <5) return 1;
        if(diem>=5 && diem <5.5) return 1.5;
        if(diem>=5.5 && diem <6.5) return 2.0;
        if(diem>=6.5 && diem <7) return 2.5;
        if(diem>=7 && diem <8) return 3.0;
        if(diem>=8 && diem <9) return 3.5;
        if(diem>=9 && diem <=10) return 4.0;
        return 0;
    }
    private void addTableScore()
    {
        double tongSoTc=0,tongDiem=0,tc;
        float [] widthOfTable= {50F, 200F, 50F,80F,80F,50F};   
        Table table = new Table(widthOfTable);    
        // Adding cells to the table 
        table.addCell("Mã HP");       
        table.addCell("Tên học phần");             
        table.addCell("Số TC");       
        table.addCell("Điểm thang 10");
        table.addCell("Điểm thang 4"); 
        table.addCell("Tích luỹ"); 
        //Them diem vao bang neu ton tai hoc phan 
        JTable tableInfor=new JTable(ManagerTab.getTableInfor().getModel());
        if (tableInfor.getRowCount()>0)
        {
            for (int i=0;i<tableInfor.getRowCount();i++)
            {
                //Ma hp
                table.addCell(new Paragraph(tableInfor.getModel().getValueAt(i, 0).toString()));
                //Ten hp
                table.addCell(new Paragraph(tableInfor.getModel().getValueAt(i, 1).toString()));
                //So tc
                table.addCell(new Paragraph(tableInfor.getModel().getValueAt(i, 2).toString()));
                tc=Double.parseDouble(tableInfor.getModel().getValueAt(i, 2).toString());
                tongSoTc+=tc;
                //Diem thang 10
                table.addCell(new Paragraph(tableInfor.getModel().getValueAt(i, 3).toString()));
                //Diem thang 4
                double diem4=convertScore(Double.parseDouble(tableInfor.getModel().getValueAt(i, 3).toString()));
                table.addCell(new Paragraph(String.valueOf(diem4)));
                tongDiem+=tc*diem4;
                //Kiem tra tich luy
                
                table.addCell(new Paragraph(tableInfor.getModel().getValueAt(i, 5).toString()));
            }
        }
        table.setTextAlignment(TextAlignment.CENTER);
        document.add(table).setFontSize(12);
         //Tinh diem trung binh hoc ki
        document.add(new Paragraph("- Điểm trung bình học kì: "+(double)Math.round((tongDiem/tongSoTc) * 100) / 100));
        //Tinh diem trung binh tich luy
        try {
            Statement dataScore=con.createStatement();
            ResultSet rs=dataScore.executeQuery("select Diem,SoTC from score,course where TichLuy='X' and score.MaHP=course.MaHP and score.MSSV='"+ManagerTab.getMssvSelected().toString()+"'");
            //Taoo bien de luu diem tich luy
            double tongdiemtl=0,tongtctl=0;
            while (rs.next())
            {
                tongdiemtl+=rs.getDouble(1)*rs.getDouble(2);
                tongtctl+=rs.getDouble(2);
            }
            if (tongdiemtl>0) document.add(new Paragraph("- Điểm trung bình tích luỹ: "+(double)Math.round((tongdiemtl/tongtctl) * 100) / 100));
            else document.add(new Paragraph("- Điểm trung bình tích luỹ: chưa có"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn !");
        }
        
    }
    private void addFooter(){
        document.add(new Paragraph("\n\n\n"));
        Paragraph footer=new Paragraph("Ghi chú:\n"+
            " Học phần có dấu * là học phần thuộc chương trình đào tạo.\n" +
            " 	+ Từ học kỳ 1 năm 2007-2008, Trường Đại học Cần Thơ sử dụng thang điểm 4.\n" +
            " 	+ Điểm trung bình được phân loại như sau:\n" +
            " 	Loại Xuất sắc từ 3.6 đến 4.00 \t Loại Khá từ 2.5 đến 3.19\n" +
            " 	Loại Giỏi từ 3.2 đến 3.59 \t Loại Trung bình từ 2.0 đến 2.49").setFontSize(12);
        document.add(footer);
    }
    private int printPDF() 
    {
        try{
            PdfWriter writer = new PdfWriter(FILE);      
            PdfDocument = new PdfDocument(writer);  
            documentFormat();
            addTitle();
            addInfor();
            addTableScore();
            addFooter();
            document.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
         return 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("UVN Chu Ky", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xuất bảng điểm");

        jLabel2.setFont(new java.awt.Font("UVN Chu Ky", 0, 14)); // NOI18N
        jLabel2.setText("Nhập tên file cần xuất");

        txtName.setText("BangDiem");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("UVN Chu Ky", 0, 12)); // NOI18N
        jLabel3.setText("File được lưu tại C:\\Users\\Zevik\\eclipse-workspace\\MyWinApp\\src\\StudentManager\\PrintResult");

        btnExport.setBackground(new java.awt.Color(204, 204, 255));
        btnExport.setText("Xuất PDF");
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
            }
        });
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        if (printPDF()==0){
            JOptionPane.showMessageDialog(this,"In thành công !");
            dispose();
        }
    }//GEN-LAST:event_btnExportMouseClicked

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new printScoreTable().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
