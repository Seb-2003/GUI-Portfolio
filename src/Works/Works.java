package Works;
import AboutMe.AboutMe;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class Works extends javax.swing.JFrame {
    
    String PhotoLink;
    
// Runs the method for creating the form
    public Works() {
        initComponents();
    }
    
// Method for opening Photo in a default image viewer depending on a specific photo that has been clicked
    public void PhotoOpen(){
        URL url = getClass().getResource(PhotoLink);
        try {
            String path = url.toURI().getPath();
            Desktop.getDesktop().open(new File(path));
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
    }

// Method for creating the frame
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ScrollPanel = new javax.swing.JScrollPane();
        ScrollPanel_Panel = new javax.swing.JPanel();
        Works_Title = new javax.swing.JTextPane();
        Works_Divider = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        Work1 = new javax.swing.JPanel();
        Work1_Pic = new javax.swing.JLabel();
        Work1_Title = new javax.swing.JLabel();
        Work2 = new javax.swing.JPanel();
        Work2_Title = new javax.swing.JLabel();
        Work2_Pic = new javax.swing.JLabel();
        Work3 = new javax.swing.JPanel();
        Work3_Pic = new javax.swing.JLabel();
        Work3_Title = new javax.swing.JLabel();
        Work4 = new javax.swing.JPanel();
        Work4_Title = new javax.swing.JLabel();
        Work4_Pic = new javax.swing.JLabel();
        Work5 = new javax.swing.JPanel();
        Work5_Title = new javax.swing.JLabel();
        Work5_Pic = new javax.swing.JLabel();
        Work6 = new javax.swing.JPanel();
        Work6_Pic = new javax.swing.JLabel();
        Work6_Title = new javax.swing.JLabel();
        Work7 = new javax.swing.JPanel();
        Work7_Title = new javax.swing.JLabel();
        Work7_Pic = new javax.swing.JLabel();
        Work8 = new javax.swing.JPanel();
        Work8_Title = new javax.swing.JLabel();
        Work8_Pic = new javax.swing.JLabel();
        Work9 = new javax.swing.JPanel();
        Work9_Pic = new javax.swing.JLabel();
        Work9_Title = new javax.swing.JLabel();
        Work10 = new javax.swing.JPanel();
        Work11_Pic = new javax.swing.JLabel();
        Work11_Title = new javax.swing.JLabel();
        Bottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ScrollPanel.setBorder(null);

        ScrollPanel_Panel.setBackground(new java.awt.Color(19, 29, 17));
        ScrollPanel_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Works_Title.setEditable(false);
        Works_Title.setBackground(new java.awt.Color(255, 255, 255));
        Works_Title.setBorder(null);
        Works_Title.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        Works_Title.setForeground(new java.awt.Color(255, 255, 255));
        Works_Title.setText("EXAMPLE WORKS");
        Works_Title.setOpaque(false);
        ScrollPanel_Panel.add(Works_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        Works_Divider.setBackground(new java.awt.Color(0, 150, 119));

        javax.swing.GroupLayout Works_DividerLayout = new javax.swing.GroupLayout(Works_Divider);
        Works_Divider.setLayout(Works_DividerLayout);
        Works_DividerLayout.setHorizontalGroup(
            Works_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Works_DividerLayout.setVerticalGroup(
            Works_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        ScrollPanel_Panel.add(Works_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 130, 10));

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackButton.setText("<");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        ScrollPanel_Panel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        Work1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work1_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Advertisement Poster.png"))); // NOI18N
        Work1_Pic.setText("jLabel2");
        Work1_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work1_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work1_PicMouseClicked(evt);
            }
        });
        Work1.add(Work1_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        Work1_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work1_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work1_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work1_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work1_Title.setText("Advertisement Poster");
        Work1_Title.setOpaque(true);
        Work1.add(Work1_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        ScrollPanel_Panel.add(Work1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 370, 190));

        Work2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work2_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work2_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work2_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work2_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work2_Title.setText("Infographics");
        Work2_Title.setOpaque(true);
        Work2.add(Work2_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        Work2_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Infographics.png"))); // NOI18N
        Work2_Pic.setText("jLabel2");
        Work2_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work2_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work2_PicMouseClicked(evt);
            }
        });
        Work2.add(Work2_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        ScrollPanel_Panel.add(Work2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        Work3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work3_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Comics.png"))); // NOI18N
        Work3_Pic.setText("jLabel2");
        Work3_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work3_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work3_PicMouseClicked(evt);
            }
        });
        Work3.add(Work3_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        Work3_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work3_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work3_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work3_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work3_Title.setText("Comics");
        Work3_Title.setOpaque(true);
        Work3.add(Work3_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        ScrollPanel_Panel.add(Work3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 370, 190));

        Work4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work4_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work4_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work4_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work4_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work4_Title.setText("Diagrams");
        Work4_Title.setOpaque(true);
        Work4.add(Work4_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        Work4_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Diagrams.png"))); // NOI18N
        Work4_Pic.setText("jLabel2");
        Work4_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work4_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work4_PicMouseClicked(evt);
            }
        });
        Work4.add(Work4_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        ScrollPanel_Panel.add(Work4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 370, 190));

        Work5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work5_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work5_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work5_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work5_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work5_Title.setText("Magazine Cover");
        Work5_Title.setOpaque(true);
        Work5.add(Work5_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        Work5_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Magazine Cover.png"))); // NOI18N
        Work5_Pic.setText("jLabel2");
        Work5_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work5_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work5_PicMouseClicked(evt);
            }
        });
        Work5.add(Work5_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        ScrollPanel_Panel.add(Work5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 370, 190));

        Work6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work6_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Photography1.jpg"))); // NOI18N
        Work6_Pic.setText("jLabel2");
        Work6_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work6_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work6_PicMouseClicked(evt);
            }
        });
        Work6.add(Work6_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        Work6_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work6_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work6_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work6_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work6_Title.setText("Photography");
        Work6_Title.setOpaque(true);
        Work6.add(Work6_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        ScrollPanel_Panel.add(Work6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 370, 190));

        Work7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work7_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work7_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work7_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work7_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work7_Title.setText("Photography #2");
        Work7_Title.setOpaque(true);
        Work7.add(Work7_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        Work7_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Photography2.jpg"))); // NOI18N
        Work7_Pic.setText("jLabel2");
        Work7_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work7_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work7_PicMouseClicked(evt);
            }
        });
        Work7.add(Work7_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        ScrollPanel_Panel.add(Work7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 370, 190));

        Work8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work8_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work8_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work8_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work8_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work8_Title.setText("Photography #3");
        Work8_Title.setOpaque(true);
        Work8.add(Work8_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        Work8_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/Photography3.jpeg"))); // NOI18N
        Work8_Pic.setText("jLabel2");
        Work8_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work8_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work8_PicMouseClicked(evt);
            }
        });
        Work8.add(Work8_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        ScrollPanel_Panel.add(Work8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 370, 190));

        Work9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work9_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/GIF.GIF"))); // NOI18N
        Work9_Pic.setText("jLabel2");
        Work9_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work9_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work9_PicMouseClicked(evt);
            }
        });
        Work9.add(Work9_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        Work9_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work9_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work9_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work9_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work9_Title.setText("Video Edit Example #1");
        Work9_Title.setOpaque(true);
        Work9.add(Work9_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        ScrollPanel_Panel.add(Work9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 660, 370, 190));

        Work10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Work11_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Works/Pictures/GIF2.GIF"))); // NOI18N
        Work11_Pic.setText("jLabel2");
        Work11_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Work11_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Work11_PicMouseClicked(evt);
            }
        });
        Work10.add(Work11_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 150));

        Work11_Title.setBackground(new java.awt.Color(255, 255, 255));
        Work11_Title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Work11_Title.setForeground(new java.awt.Color(0, 0, 0));
        Work11_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Work11_Title.setText("Video Edit Example #2");
        Work11_Title.setOpaque(true);
        Work10.add(Work11_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, 40));

        ScrollPanel_Panel.add(Work10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 890, 370, 190));
        ScrollPanel_Panel.add(Bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 1220, -1, -1));

        ScrollPanel.setViewportView(ScrollPanel_Panel);

        ScrollPanel.getVerticalScrollBar().setUnitIncrement(10);
        ScrollPanel.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        ScrollPanel.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Back Button Action
        dispose(); // Closes this frame.
        AboutMe.main(null); // Runs the AboutMe class where it will open a frame for the About me
    }

    private void Work1_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
    	// Sets the link to be used for the PhotoOpen method
        PhotoLink = "/Works/Pictures/Original/OriginalAdvertisement.png";
        PhotoOpen();
    }

    private void Work2_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalInfographics.png";
        PhotoOpen();
    }

    private void Work3_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalComics.png";
        PhotoOpen();
    }

    private void Work4_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalDiagrams.png";
        PhotoOpen();
    }

    private void Work5_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalMagazine.png";
        PhotoOpen();
    }

    private void Work6_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalPic1.jpg";
        PhotoOpen();
    }

    private void Work7_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalPic2.jpg";
        PhotoOpen();
    }

    private void Work8_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalPic3.jpeg";
        PhotoOpen();
    }

    private void Work9_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalGIF1.gif";
        PhotoOpen();
    }

    private void Work11_PicMouseClicked(java.awt.event.MouseEvent evt) {
// Photo Clicked Action
        PhotoLink = "/Works/Pictures/Original/OriginalGIF2.gif";
        PhotoOpen();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Works.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Works().setVisible(true);
        });
    }

// Swing Components Declaration
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel Bottom;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel ScrollPanel_Panel;
    private javax.swing.JPanel Work1;
    private javax.swing.JPanel Work10;
    private javax.swing.JLabel Work11_Pic;
    private javax.swing.JLabel Work11_Title;
    private javax.swing.JLabel Work1_Pic;
    private javax.swing.JLabel Work1_Title;
    private javax.swing.JPanel Work2;
    private javax.swing.JLabel Work2_Pic;
    private javax.swing.JLabel Work2_Title;
    private javax.swing.JPanel Work3;
    private javax.swing.JLabel Work3_Pic;
    private javax.swing.JLabel Work3_Title;
    private javax.swing.JPanel Work4;
    private javax.swing.JLabel Work4_Pic;
    private javax.swing.JLabel Work4_Title;
    private javax.swing.JPanel Work5;
    private javax.swing.JLabel Work5_Pic;
    private javax.swing.JLabel Work5_Title;
    private javax.swing.JPanel Work6;
    private javax.swing.JLabel Work6_Pic;
    private javax.swing.JLabel Work6_Title;
    private javax.swing.JPanel Work7;
    private javax.swing.JLabel Work7_Pic;
    private javax.swing.JLabel Work7_Title;
    private javax.swing.JPanel Work8;
    private javax.swing.JLabel Work8_Pic;
    private javax.swing.JLabel Work8_Title;
    private javax.swing.JPanel Work9;
    private javax.swing.JLabel Work9_Pic;
    private javax.swing.JLabel Work9_Title;
    private javax.swing.JPanel Works_Divider;
    private javax.swing.JTextPane Works_Title;
}
