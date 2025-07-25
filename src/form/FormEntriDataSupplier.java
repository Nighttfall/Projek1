/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form;

import service.ClassDatabase;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Kesya
 */
public class FormEntriDataSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormEntriDataSupplier
     */
    public FormEntriDataSupplier() {
        initComponents();
        tampilData();
        tampilDataDenganHeaderCustom();
        
        txtTampilDataSup.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTampilDataSupCaretUpdate(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kodeSup = new javax.swing.JTextField();
        noTelpSup = new javax.swing.JTextField();
        butAdd = new javax.swing.JButton();
        butSave = new javax.swing.JButton();
        butEdit = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butClose = new javax.swing.JButton();
        namaSup = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatSup = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        butTampilkanSup = new javax.swing.JButton();
        txtTampilDataSup = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataSup = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 277));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM ENTRI DATA SUPPLIER SPAREPART ");
        jLabel1.setPreferredSize(new java.awt.Dimension(327, 32));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Kode Supplier");
        jLabel2.setMaximumSize(new java.awt.Dimension(132, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(132, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(132, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama Supplier");
        jLabel3.setMaximumSize(new java.awt.Dimension(132, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(132, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(132, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Alamat");
        jLabel4.setMaximumSize(new java.awt.Dimension(132, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(132, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(132, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("No. Telp");
        jLabel5.setMaximumSize(new java.awt.Dimension(132, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(132, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(132, 25));

        kodeSup.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                kodeSupCaretUpdate(evt);
            }
        });
        kodeSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeSupActionPerformed(evt);
            }
        });

        noTelpSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpSupActionPerformed(evt);
            }
        });

        butAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butAdd.setText("ADD");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        butSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butSave.setText("SAVE");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        butEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butEdit.setText("EDIT");
        butEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditActionPerformed(evt);
            }
        });

        butDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butDelete.setText("DELETE");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butClose.setText("CLOSE");
        butClose.setToolTipText("");

        alamatSup.setColumns(20);
        alamatSup.setRows(5);
        jScrollPane1.setViewportView(alamatSup);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kodeSup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noTelpSup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaSup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodeSup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaSup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noTelpSup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(butAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(butClose)))
                .addGap(19, 19, 19))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butAdd, butClose, butDelete, butEdit, butSave});

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        butTampilkanSup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butTampilkanSup.setText("Tampilkan");
        butTampilkanSup.setMaximumSize(new java.awt.Dimension(111, 27));
        butTampilkanSup.setMinimumSize(new java.awt.Dimension(111, 27));
        butTampilkanSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTampilkanSupActionPerformed(evt);
            }
        });

        txtTampilDataSup.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTampilDataSupCaretUpdate(evt);
            }
        });
        txtTampilDataSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTampilDataSupActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("KESA SPAREPART");
        jLabel6.setMaximumSize(new java.awt.Dimension(128, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(128, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(128, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butTampilkanSup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTampilDataSup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butTampilkanSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTampilDataSup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jScrollPane3.setPreferredSize(new java.awt.Dimension(454, 404));

        tblDataSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Alamat", "No Telp"
            }
        ));
        jScrollPane3.setViewportView(tblDataSup);

        jScrollPane2.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void tampilData() {
        try {
                Connection c = ClassDatabase.getKoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT KodeSup, NamaSup, AlamatSup, NoTelpSup FROM tbldatasup";
                ResultSet r = s.executeQuery(sql);
                tampilDataDenganHeaderCustom();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }}
    
    public void tampilDataDenganHeaderCustom() {
    try {
        Connection c = ClassDatabase.getKoneksi();
        Statement s = c.createStatement();
        String sql = "SELECT KodeSup, NamaSup, AlamatSup, NoTelpSup FROM tbldatasup";
        ResultSet r = s.executeQuery(sql);

        // Pakai DbUtils untuk isi datanya
        tblDataSup.setModel(DbUtils.resultSetToTableModel(r));

        // Ganti nama header langsung
        String[] namaKolom = {
            "Kode Supplier",
            "Nama Supplier",
            "Alamat Supplier",
            "No.Telp Supplier"
        };

        for (int i = 0; i < namaKolom.length; i++) {
            tblDataSup.getColumnModel().getColumn(i).setHeaderValue(namaKolom[i]);
        }

        tblDataSup.getTableHeader().repaint();
        r.close();
        s.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    private void kodeSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeSupActionPerformed

    private void noTelpSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpSupActionPerformed

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        kodeSup.setText("");
        namaSup.setText("");
        alamatSup.setText("");
        noTelpSup.setText("");
        kodeSup.requestFocus();
    }//GEN-LAST:event_butAddActionPerformed

    private void butEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditActionPerformed
// Update Data Supplier
String KodeSup = kodeSup.getText();
String NamaSup = namaSup.getText();
String AlamatSup = alamatSup.getText();
String NoTelpSup = noTelpSup.getText();

if (KodeSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Kode Supplier tidak boleh kosong!");
} else if (NamaSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Nama Supplier tidak boleh kosong!");
} else if (AlamatSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Alamat Supplier tidak boleh kosong!");
} else if (NoTelpSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "No.Telp Supplier tidak boleh kosong!");
} else {
    try {
        Connection c = ClassDatabase.getKoneksi();
        String sql = "UPDATE tbldatasup SET NamaSup = ?, AlamatSup = ?, NoTelpSup = ? WHERE KodeSup = ?";
        PreparedStatement p = c.prepareStatement(sql);
        p.setString(1, NamaSup);
        p.setString(2, AlamatSup);
        p.setString(3, NoTelpSup);
        p.setString(4, KodeSup);
        p.executeUpdate();
        p.close();
        JOptionPane.showMessageDialog(this, "Sukses Update Data");
        tampilDataDenganHeaderCustom(); // Refresh tampilan data supplier
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
}
    }//GEN-LAST:event_butEditActionPerformed

    private void txtTampilDataSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTampilDataSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTampilDataSupActionPerformed

    private void txtTampilDataSupCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTampilDataSupCaretUpdate
        String keyword = txtTampilDataSup.getText();
        try {
            Connection c = ClassDatabase.getKoneksi();
            String sql = "SELECT KodeSup, NamaSup, AlamatSup, NoTelpSup " +
                         "FROM tbldatasup  " +
                         "WHERE KodeSup     LIKE ? " +
                         "   OR NamaSup     LIKE ? " +
                         "   OR AlamatSup  LIKE ? " +
                         "   OR NoTelpSup  LIKE ? ";
            PreparedStatement p = c.prepareStatement(sql);
            String key = "%" + keyword + "%";
                for (int i = 1; i <= 4; i++) {
                    p.setString(i, key);
                }
            ResultSet r = p.executeQuery();
            
            tampilDataDenganHeaderCustom();
            r.close();
            p.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_txtTampilDataSupCaretUpdate

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
//SAVE
String KodeSup = this.kodeSup.getText();
String NamaSup = this.namaSup.getText();
String AlamatSup = this.alamatSup.getText();
String NoTelpSup = this.noTelpSup.getText();

// Validasi input
if (KodeSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Data belum lengkap, Kode Supplier tidak boleh kosong!");
} else if (NamaSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Data belum lengkap, Nama Supplier tidak boleh kosong!");
} else if (AlamatSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Data belum lengkap, Alamat Supplier tidak boleh kosong!");
} else if (NoTelpSup.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Data belum lengkap, No. Telp Supplier tidak boleh kosong!");
} else {
    try {
        Connection c = ClassDatabase.getKoneksi();
        String sql = "INSERT INTO tbldatasup (KodeSup, NamaSup, AlamatSup, NoTelpSup) VALUES (?, ?, ?, ?)";
        PreparedStatement p = c.prepareStatement(sql);
        p.setInt(1, Integer.parseInt(KodeSup));
        p.setString(2, NamaSup);
        p.setString(3, AlamatSup);
        p.setString(4, NoTelpSup);
        p.executeUpdate();
        p.close();
        JOptionPane.showMessageDialog(this, "Sukses Tambah Data Supplier");

        // Refresh data supplier
        tampilDataDenganHeaderCustom();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Kesalahan SQL: " + e.getMessage());
    }
}
    }//GEN-LAST:event_butSaveActionPerformed

    private void butTampilkanSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTampilkanSupActionPerformed
//Cari Data
    try {            
        Connection c = ClassDatabase.getKoneksi();
        Statement s = c.createStatement();
        String sql = "SELECT * FROM tbldatasup WHERE KodeSup = '" + txtTampilDataSup.getText() + "'";
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            kodeSup.setText(r.getString("KodeSup"));
            namaSup.setText(r.getString("NamaSup"));
            alamatSup.setText(r.getString("AlamatSup"));
            noTelpSup.setText(r.getString("noTelpSup"));
        }

        r.close();
        s.close();
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan: " + e);
    }
    }//GEN-LAST:event_butTampilkanSupActionPerformed

    private void kodeSupCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_kodeSupCaretUpdate
        try {            
            Connection c = ClassDatabase.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM tbldatasup WHERE KodeSup='" + this.kodeSup.getText() + "'";
            ResultSet r=s.executeQuery(sql);
           while (r.next()){
                this.namaSup.setText(r.getString("NamaSup"));
                this.alamatSup.setText(r.getString("AlamatSup"));
                this.noTelpSup.setText(r.getString("noTelpSup"));
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_kodeSupCaretUpdate

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatSup;
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butClose;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butEdit;
    private javax.swing.JButton butSave;
    private javax.swing.JButton butTampilkanSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kodeSup;
    private javax.swing.JTextField namaSup;
    private javax.swing.JTextField noTelpSup;
    private javax.swing.JTable tblDataSup;
    private javax.swing.JTextField txtTampilDataSup;
    // End of variables declaration//GEN-END:variables
}
