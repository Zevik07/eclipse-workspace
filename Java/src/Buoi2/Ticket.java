/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

/**
 *
 * @author Zevik
 */
public class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();
        //Them do tuoi
        cboTuoi.addItem("Duoi 20");
        cboTuoi.addItem("20-30");
        cboTuoi.addItem("30-40");
        cboTuoi.addItem("Tren 40");
        //Them tuyen duong
        cboDuong.addItem("Cần Thơ - Châu Đốc");
        cboDuong.addItem("Cần Thơ - Sài Gòn");
        //Them gio kho hanh
        cboGio.addItem("3g45");
        cboGio.addItem("6g30");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStt = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDienthoai = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cboTuoi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        cboDuong = new javax.swing.JComboBox<>();
        cboGio = new javax.swing.JComboBox<>();
        btnDat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("STT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 29, 31, 19));

        jLabel2.setText("Họ và tên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 69, 57, -1));

        jLabel3.setText("Giới tính");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 109, 57, -1));

        jLabel4.setText("Độ tuổi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 148, 57, -1));

        jLabel5.setText("Địa chỉ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 189, -1, -1));

        jLabel6.setText("Điện thoại");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 277, 57, -1));

        jLabel7.setText("Tuyến đường");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 315, -1, -1));

        jLabel8.setText("Giờ khởi hành");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 361, -1, -1));
        getContentPane().add(txtStt, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 29, 55, -1));
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 66, 226, -1));
        getContentPane().add(txtDienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 274, 226, -1));

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        getContentPane().add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 105, -1, -1));

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");
        getContentPane().add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 105, -1, -1));

        getContentPane().add(cboTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 144, 132, -1));

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 189, 240, 64));

        getContentPane().add(cboDuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 311, 223, -1));

        getContentPane().add(cboGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 357, 221, -1));

        btnDat.setText("Đặt vé");
        btnDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatMouseClicked(evt);
            }
        });
        getContentPane().add(btnDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 406, -1, -1));

        btnHuy.setText("Hủy bỏ");
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuyMouseClicked(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 406, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatMouseClicked
        // TODO add your handling code here:
        int kq=1;
        //Kiem tra so thu tu khach hang
        try{
            int temp=Integer.parseInt(txtStt.getText());
        }
        catch(Exception e){
            System.out.println("So thu tu khach hang phai la so !!!");
            kq=0;
        }
        //Ho ten khach hang khong rong
        if (txtTen.getText().isEmpty()){
            System.out.println("Ho ten khach hang yeu cau khong rong");
            kq=0;
        }
        //Dia chi khong rong
        if (txtDiachi.getText().isEmpty())
        {
            System.out.println("Dia chi khach hang khon rong");
            kq=0;
        }
        //Dien thoai khong rong
        if (txtDienthoai.getText().isEmpty())
        {
            System.out.println("Dien thoai khach hang khong rong");
            kq=0;
        }
        if (kq==1)
        {
            System.out.println("STT "+txtStt.getText());
            System.out.println("Họ và tên "+txtTen.getText());
            System.out.println("Giới tính ");
            if (rdNam.isSelected())
                System.out.print("Nam");
            else System.out.print("Nữ");
            System.out.println("Độ tuổi "+cboTuoi.getSelectedItem().toString());
            System.out.println("Điện thoại "+txtDienthoai.getText());
            System.out.println("Tuyến đường "+cboDuong.getSelectedItem());
            System.out.println("Giờ khởi hành "+cboGio.getSelectedItem());
        }
    }//GEN-LAST:event_btnDatMouseClicked

    private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseClicked
        // TODO add your handling code here:
        txtStt.setText("");
        txtTen.setText("");
        txtDiachi.setText("");
        txtDienthoai.setText("");
        
    }//GEN-LAST:event_btnHuyMouseClicked

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDat;
    private javax.swing.JButton btnHuy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDuong;
    private javax.swing.JComboBox<String> cboGio;
    private javax.swing.JComboBox<String> cboTuoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtDienthoai;
    private javax.swing.JTextField txtStt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
