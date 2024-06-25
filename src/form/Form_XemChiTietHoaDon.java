/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Class.DSHoaDon;
import Class.HoaDon;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Triss
 */
public class Form_XemChiTietHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form Form_XemChiTietHoaDon
     */
    DSHoaDon hd;
    ArrayList<HoaDon> dsHD;
    public Form_XemChiTietHoaDon() {
        initComponents();
        hd = new DSHoaDon();
        dsHD = hd.layDanhSachHoaDon();
        hienThiTableCTHoaDon();
    }
    
    private void hienThiTableCTHoaDon() {
        String[] header = {"Mã HD","Mã NV","Mã KH","Ngày Lập","Thành tiền","Mã SP", "Số Lượng", "Giá Bán"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        for (HoaDon hd : dsHD) {
            model.addRow(new Object[]{
                hd.maHD,hd.maNV, hd.maKH, hd.NgayLap, hd.ThanhTien, hd.maSP, hd.SoLuong, hd.GiaBan
            });
        }
        tbl_ChiTietHoaDon.setModel(model);
        tbl_ChiTietHoaDon.fixTable(jScrollPane1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new swing.round.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ChiTietHoaDon = new swing.table.Table();
        jLabel2 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_ChiTietHoaDon);

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHI TIẾT HÓA ĐƠN");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(255, 255, 255))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.round.RoundPanel roundPanel1;
    private swing.table.Table tbl_ChiTietHoaDon;
    // End of variables declaration//GEN-END:variables
}
