/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eduPort;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sudhanshu
 */

public class UploadUI extends javax.swing.JFrame {
    private EduPortMngr mngr;
//    private DocumentMngr dm;
    boolean t = false;


    public UploadUI(EduPortMngr mngr) {
        this.mngr=mngr;
        initComponents();
        jTextArea1.setOpaque(false);
        //jTextArea1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jLabel2.setText(mngr.getCurrUser());
//        scaleImage();
    }
    
    public void setColor(JLabel panel)
 {
     panel.setBackground(new java.awt.Color(241,95,121));
 }
 
 public void resetColor(JLabel panel)
 {
     panel.setBackground(new java.awt.Color(51,51,51));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kButton1 = new keeptoo.KButton();
        jTextField3 = new javax.swing.JTextField();
        kButton2 = new keeptoo.KButton();
        jPanel2 = new javax.swing.JPanel();
        kButton8 = new keeptoo.KButton();
        kButton9 = new keeptoo.KButton();
        kButton10 = new keeptoo.KButton();
        kButton11 = new keeptoo.KButton();
        kButton12 = new keeptoo.KButton();
        kButton13 = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/uploadpng.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 310, 294));

        jLabel3.setBackground(new Color(0,0,0,0));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 37, 220));
        jLabel3.setText("Book Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(175, 37, 220));
        jLabel4.setText("Author Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(175, 37, 220));
        jLabel5.setText("Select File");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, 20));

        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(175, 37, 220)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 410, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 420, 121));

        kButton1.setText("Upload");
        kButton1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        kButton1.setkBorderRadius(0);
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(200, 78, 131));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 130, -1));

        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(175, 37, 220)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 433, 40));

        kButton2.setText("Browse");
        kButton2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(191, 90, 224));
        kButton2.setkBorderRadius(0);
        kButton2.setkEndColor(new java.awt.Color(175, 37, 220));
        kButton2.setkHoverEndColor(new java.awt.Color(175, 37, 220));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(191, 90, 224));
        kButton2.setkStartColor(new java.awt.Color(175, 37, 220));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 130, -1));

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sengar\\Desktop\\OOPs Lab\\intrgratr\\devMate\\src\\image\\feedback (2).png")); // NOI18N
        kButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton8.setIconTextGap(35);
        kButton8.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton8.setkBorderRadius(0);
        kButton8.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton8.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton8.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton8.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton8.setkIndicatorColor(new java.awt.Color(38, 38, 38));
        kButton8.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton8.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton8.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton8.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 120, 100));

        kButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton9.setIconTextGap(35);
        kButton9.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton9.setkBorderRadius(0);
        kButton9.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton9.setkForeGround(new java.awt.Color(38, 38, 38));
        kButton9.setkHoverColor(new java.awt.Color(38, 38, 38));
        kButton9.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton9.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton9.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton9.setkIndicatorColor(new java.awt.Color(38, 38, 38));
        kButton9.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton9.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton9.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton9.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 100));

        kButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        kButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton10.setIconTextGap(35);
        kButton10.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton10.setkBorderRadius(0);
        kButton10.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton10.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton10.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton10.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton10.setkIndicatorColor(new java.awt.Color(38, 38, 38));
        kButton10.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton10.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton10.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton10.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, 100));

        kButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        kButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton11.setIconTextGap(35);
        kButton11.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton11.setkBorderRadius(0);
        kButton11.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton11.setkForeGround(new java.awt.Color(38, 38, 38));
        kButton11.setkHoverColor(new java.awt.Color(38, 38, 38));
        kButton11.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton11.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton11.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton11.setkIndicatorColor(new java.awt.Color(38, 38, 38));
        kButton11.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton11.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton11.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton11.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 120, 100));

        kButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/upload_active.png"))); // NOI18N
        kButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton12.setIconTextGap(35);
        kButton12.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton12.setkBorderRadius(0);
        kButton12.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton12.setkForeGround(new java.awt.Color(38, 38, 38));
        kButton12.setkHoverColor(new java.awt.Color(38, 38, 38));
        kButton12.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton12.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton12.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton12.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton12.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton12.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton12.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 120, 100));

        kButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/request book.png"))); // NOI18N
        kButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kButton13.setIconTextGap(35);
        kButton13.setkBackGroundColor(new java.awt.Color(38, 38, 38));
        kButton13.setkBorderRadius(0);
        kButton13.setkEndColor(new java.awt.Color(38, 38, 38));
        kButton13.setkForeGround(new java.awt.Color(38, 38, 38));
        kButton13.setkHoverColor(new java.awt.Color(38, 38, 38));
        kButton13.setkHoverEndColor(new java.awt.Color(38, 38, 38));
        kButton13.setkHoverForeGround(new java.awt.Color(38, 38, 38));
        kButton13.setkHoverStartColor(new java.awt.Color(38, 38, 38));
        kButton13.setkIndicatorColor(new java.awt.Color(38, 38, 38));
        kButton13.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton13.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton13.setkStartColor(new java.awt.Color(38, 38, 38));
        kButton13.setPreferredSize(new java.awt.Dimension(100, 60));
        kButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        kButton13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 702));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 30));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 30, 30));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        jTextField4.setBackground(new Color(0,0,0,0));
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(175, 37, 220)));
        jTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 410, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(175, 37, 220));
        jLabel10.setText("Book Description");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        if(!mngr.getCurrUser().equals("")){
            Document docupload=new Document();
      docupload.setTitle(this.jTextField1.getText());docupload.setAuthorName(this.jTextField4.getText());
      docupload.setPublisherName(mngr.getCurrUser());
      docupload.setDescription(this.jTextArea1.getText());
      docupload.setCategory(" ");
      docupload.setFilePath(this.jTextField3.getText());
    //  System.out.println(docupload.toString());
      boolean b1=true;
      
      b1=mngr.getDocumentMngr().uploadDocument(docupload, true);
        jTextField1.setText("");
        jTextField3.setText("");
         jTextField4.setText("");
        jTextArea1.setText("");
        if(t&&b1){
           JOptionPane.showMessageDialog(rootPane,ff.getName()+" has been successfully uploaded!");
        }
        else if(!b1)
        {
            JOptionPane.showMessageDialog(rootPane,"Server Error!! try After sometime");
        }
        else{
           JOptionPane.showMessageDialog(rootPane,"Please Select a file to upload!");
        }
        t=false;
        }else{
            mngr.logInScreen();
        }
      
    }//GEN-LAST:event_kButton1ActionPerformed
        File ff;
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        int aa = jf.showOpenDialog(null);
        System.out.println(aa);
        if(aa == JFileChooser.APPROVE_OPTION){
        //char cbuf[] = null;
        ff = jf.getSelectedFile();
        jTextField3.setText(ff.getAbsolutePath());
        //System.out.println(ff);
        t = true;
        
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        setColor(jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        resetColor(jLabel6);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        setColor(jLabel7);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        resetColor(jLabel7);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
          if(this.getExtendedState()!=JFrame.MAXIMIZED_BOTH){
           this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        else{
        this.setExtendedState(JFrame.NORMAL);
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        setColor(jLabel8);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        resetColor(jLabel8);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MousePressed
      int xx,xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
        mngr.feedbackScreen();
    }//GEN-LAST:event_kButton8ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton9ActionPerformed

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        // TODO add your handling code here:
        if(mngr.getCurrUser().equals("")){
            mngr.signUpScreen();
        }else{
            //show user uploaded files
        }
    }//GEN-LAST:event_kButton10ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:
        mngr.searchScreen();
    }//GEN-LAST:event_kButton11ActionPerformed

    private void kButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton12ActionPerformed

    private void kButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton13ActionPerformed
        // TODO add your handling code here:
        mngr.requestScreen();
    }//GEN-LAST:event_kButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UploadUI(DocumentMngr.getObject()).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton10;
    private keeptoo.KButton kButton11;
    private keeptoo.KButton kButton12;
    private keeptoo.KButton kButton13;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton8;
    private keeptoo.KButton kButton9;
    // End of variables declaration//GEN-END:variables
}
