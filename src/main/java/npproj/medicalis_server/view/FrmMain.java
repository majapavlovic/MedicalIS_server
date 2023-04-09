/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package npproj.medicalis_server.view;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import npproj.medicalis_server.component.TableModelKorisnici;
import npproj.medicalis_server.controller.ServerController;
import npproj.shared_lib.domain.GeneralDObject;
import npproj.shared_lib.domain.Laborant;
import npproj.shared_lib.domain.Lekar;

/**
 *
 * @author Maja
 */
public class FrmMain extends javax.swing.JFrame {

    TableModelKorisnici tblModelKor;
    List<GeneralDObject> lista = new ArrayList<>();

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnStart.setEnabled(true);
        btnStop.setEnabled(false);
        tblModelKor = new TableModelKorisnici();
        tblKorisnici.setModel(tblModelKor);
        ServerController.getInstance().setForm(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKorisnici = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConfig = new javax.swing.JMenu();
        jmiDbConfig = new javax.swing.JMenuItem();
        jmiServerConfig = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStart.setText("Pokreni server");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStop.setText("Zaustavi server");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        tblKorisnici.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKorisnici);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ulogovani korisnici");

        menuConfig.setText("Configuration");

        jmiDbConfig.setText("Database configuration");
        jmiDbConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDbConfigActionPerformed(evt);
            }
        });
        menuConfig.add(jmiDbConfig);

        jmiServerConfig.setText("Server configuration");
        jmiServerConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiServerConfigActionPerformed(evt);
            }
        });
        menuConfig.add(jmiServerConfig);

        jMenuBar1.add(menuConfig);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        ServerController.getInstance().startServer();
        btnStart.setEnabled(false);
        btnStop.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        ServerController.getInstance().stopServer();
        btnStart.setEnabled(true);
        btnStop.setEnabled(false);    }//GEN-LAST:event_btnStopActionPerformed

    private void jmiDbConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDbConfigActionPerformed
        new FrmDbConfig(this, true).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jmiDbConfigActionPerformed

    private void jmiServerConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiServerConfigActionPerformed
        new FrmServerConfig_(this, true).setVisible(true);
    }//GEN-LAST:event_jmiServerConfigActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiDbConfig;
    private javax.swing.JMenuItem jmiServerConfig;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JTable tblKorisnici;
    // End of variables declaration//GEN-END:variables

    public void showKorisnici(GeneralDObject odo) {
        lista.add(odo);
        // tblModelKor.setKorisnici(lista);
        tblModelKor.addKorisnik(odo);
    }

    public void logout(Lekar lekar) {
      tblModelKor.removeLekar(lekar);
    }
    public void logout(Laborant lab) {
       tblModelKor.removeLaborant(lab);
    }

}