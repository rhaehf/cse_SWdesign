/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAdministrator;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jda05
 */
public class SystemAdminView extends javax.swing.JFrame {
    /**
     * Creates new form SystemManager
     */
    public SystemAdminView() {
        initComponents();  
        System.out.println("SystemAdminView 생성자");        
        setTitle("가맹점 신청 관리"); // gui창 제목 지정        
        //setResizable(false); // 창 크기 조절 제한    
        setLocationRelativeTo(null); // gui를 윈도우 창 가운데에 위치하게 한다.
        setVisible(true); // gui를 보이게 한다.                   
    }
    
    JTable table1;
    public void setTable1(JTable table){
        this.table1 = table;
    }
    public JTable getTable1(){
        return table1;
    }
    
    JTable table2;
    public void setTable2(JTable table){
        this.table2 = table;
    }
    public JTable getTable2(){
        return table2;
    }
    
    JButton btn1;
    public void setButton1(JButton btn){
        this.btn1 = btn;
    }
    public JButton getButton1(){
        return btn1;
    }
    
    JButton btn2;
    public void setButton2(JButton btn){
        this.btn2 = btn;
    }
    public JButton getButton2(){
        return btn2;
    }
    
    JButton btn3;
    public void setButton3(JButton btn){
        this.btn3 = btn;
    }
    public JButton getButton3(){
        return btn3;
    }
    
    JButton btn4;
    public void setButton4(JButton btn){
        this.btn4 = btn;
    }
    public JButton getButton4(){
        return btn4;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(650, 360));

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 360));

        jLabel1.setFont(new java.awt.Font("맑은 고딕 Semilight", 1, 18)); // NOI18N
        jLabel1.setText("가맹점 승인 대기 목록");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 400));

        //String[][] rows = setTable(); // db에서 데이터를 조회한다.
        //DefaultTableModel model = new DefaultTableModel(rows, column);
        //ApproveRefuseModel aR = new ApproveRefuseModel();
        ApproveRefuseModel arModel = ApproveRefuseModel.getInstance();
        //aR = ApproveRefuseModel.getInstance();
        DefaultTableModel model1 = arModel.setTable1();
        //DefaultTableModel model1 = model;
        jTable1.setModel(model1);
        jTable1.setPreferredScrollableViewportSize(jTable1.getPreferredSize());
        jTable1.setFillsViewportHeight(true);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setShowGrid(true);
        setTable1(jTable1);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton1.setText("승인");
        //btn1 = jButton1;
        //ApproveRefuseController ctr = new ApproveRefuseController();
        //jButton1.addActionListener(ctr.listener);
        setButton1(jButton1);
        //jButton1.addActionListener(this);

        jButton2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton2.setText("거절");
        //jButton2.addActionListener(this);
        setButton2(jButton2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("가맹점 승인 대기 처리", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(650, 360));

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 1, 18)); // NOI18N
        jLabel2.setText("가맹점 정보 수정 & 삭제");

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 400));

        //String[][] rows = setTable(); // db에서 데이터를 조회한다.
        //DefaultTableModel model = new DefaultTableModel(rows, column);
        //DefaultTableModel model2 = setTable();
        //ModifyDeleteModel mD = new ModifyDeleteModel();
        ModifyDeleteModel mdModel = ModifyDeleteModel.getInstance();
        DefaultTableModel model2 = mdModel.setTable2();
        jTable2.setModel(model2);
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setShowGrid(true);
        setTable2(jTable2);
        jScrollPane2.setViewportView(jTable2);

        jButton3.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton3.setText("수정");
        //jButton3.addActionListener(this);
        setButton3(jButton3);

        jButton4.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton4.setText("삭제");
        //jButton4.addActionListener(this);
        setButton4(jButton4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("가맹점 정보 수정 & 삭제 처리", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
DefaultTableModel refreshModel1;
public void setRefreshTable1(DefaultTableModel tableModel1){
    refreshModel1 = tableModel1;
    jTable1.setModel(refreshModel1); // 바뀐 내용을 jtable에 넣는다.
}
public DefaultTableModel getRefreshTable1(){
    refreshModel1 = (DefaultTableModel)jTable1.getModel(); // 현재 jtable1의 모델을 가져온다.
    return refreshModel1;
}

DefaultTableModel refreshModel2;
public void setRefreshTable2(DefaultTableModel tableModel2){
    refreshModel2 = tableModel2;
    jTable2.setModel(refreshModel2); // 바뀐 내용을 jtable에 넣는다.
}
public DefaultTableModel getRefreshTable2(){
    refreshModel2 = (DefaultTableModel)jTable2.getModel(); // 현재 jtable2의 모델을 가져온다.
    return refreshModel2;
}


//public DefaultTableModel getRefreshTable2(){
//    DefaultTableModel model = (DefaultTableModel)jTable2.getModel(); // 현재 jtable의 모델을 가져온다.
//    return model;
//}
//public void setRefreshTable2(DefaultTableModel tableModel2){
//    jTable2.setModel(tableModel2); // 바뀐 내용을 jtable에 넣는다.
//}
    
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
            java.util.logging.Logger.getLogger(SystemAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                SystemAdminView admin = new SystemAdminView();
//                admin.setTitle("가맹점 신청 관리"); // gui창 제목 지정                
//                //admin.setResizable(false); // 창 크기 조절 제한    
//                admin.setLocationRelativeTo(null); // gui를 윈도우 창 가운데에 위치하게 한다.
//                admin.setVisible(true); // gui를 보이게 한다.               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    
}
