//import java.awt.event.ActionEvent;

//Made by KSW

public class DGPressGUI extends javax.swing.JFrame {


	DGPress dgpress;
	ReaderGUI readerGUI;

	private String news;

//*======================================================================
//*  constructor                                                         
//*======================================================================

    public DGPressGUI() {
        initComponents();
    }



//*======================================================================
//* Event Hander                                                            
//*======================================================================  

 // 뉴스 입력창 팝업
    
    private String getInput(String prompt) {
        String s = (String) javax.swing.JOptionPane.showInputDialog(this, prompt, "뉴스입력창", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        if (s == null) s = "";
        return s.trim();
    }

  //팝업에 입력된 내용 TextArea에 입력
    
    public void jButtonNewsInputActionPerformed(java.awt.event.ActionEvent evt) {   
		
        String news = getInput ("뉴스를 입력해주세요.");
			if (! news.equals("")) {
				jTextAreaNews.setText(news);
				this.news = news;
			}
    }                                                

// 전송버튼
    
    public void jButtonNewsSendActionPerformed(java.awt.event.ActionEvent evt) {  

    	news = jTextAreaNews.getText();
		dgpress.setNews(news);

    }
    
    public void memberChanged(int size)
    {
    	String observers = "+size+";
    	jTextArea1.setText(observers);
    }



//*======================================================================
//*  GUI                                                                 
//*======================================================================


    @SuppressWarnings("unchecked")
                         
    private void initComponents() {

        jLabelDGPress = new javax.swing.JLabel();
        jButtonNewsInput = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelNews = new javax.swing.JLabel();
        jLabelMember = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaNews = new javax.swing.JTextArea();
        jButtonNewsSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelDGPress.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jLabelDGPress.setText("동국일보");

        jButtonNewsInput.setText("뉴스입력");
        jButtonNewsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewsInputActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabelNews.setText("News");

        jLabelMember.setText("Members");

        jTextAreaNews.setEditable(false);
		jTextAreaNews.setText("뉴스를 입력해주세요");
        jTextAreaNews.setColumns(20);
        jTextAreaNews.setRows(5);
        jScrollPane3.setViewportView(jTextAreaNews);

        jButtonNewsSend.setText("뉴스전송");
        jButtonNewsSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewsSendActionPerformed(evt);
            }
        });
        


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabelDGPress))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNewsSend)
                            .addComponent(jButtonNewsInput)
                            )
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabelNews)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMember)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDGPress)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNews)
                    .addComponent(jLabelMember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNewsInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNewsSend)

                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {		ReaderGUI dg = new ReaderGUI();
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
            java.util.logging.Logger.getLogger(DGPressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DGPressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DGPressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DGPressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DGPressGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonNewsInput;
    private javax.swing.JButton jButtonNewsSend;

    private javax.swing.JLabel jLabelDGPress;
    private javax.swing.JLabel jLabelMember;
    private javax.swing.JLabel jLabelNews;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaNews;
    // End of variables declaration                   
}
