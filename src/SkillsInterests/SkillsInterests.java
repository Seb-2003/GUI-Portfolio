package SkillsInterests;
import AboutMe.AboutMe;
import java.awt.Dimension;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class SkillsInterests extends javax.swing.JFrame {
	
	
    public SkillsInterests() {
        initComponents();
// Multiple Inheritance
        // Set an object info to call the methods and objects of the Interest class and it inherited
		Interest info = new Interest();
		// Calls the method of each classes.
		info.setSkillTitle();
		info.setSkillDescription();
		info.setInterests();
// Sets the Scrollbar at the top at start
        ScrollPanel.getViewport().setViewPosition(new Point(0, 0));
        SwingUtilities.invokeLater(() -> {
            ScrollPanel.getViewport().setViewPosition(new Point(0, 0));
        });
    }
    
 // Method for creating the frame
    public void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ScrollPanel = new javax.swing.JScrollPane();
        ScrollPanel_BG = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        Skill_Title = new javax.swing.JTextPane();
        Skills_Divider = new javax.swing.JPanel();
        Skill1 = new javax.swing.JPanel();
        Skill1_Desc = new javax.swing.JTextPane();
        Skill1_Title = new javax.swing.JTextPane();
        Skill2 = new javax.swing.JPanel();
        Skill2_Desc = new javax.swing.JTextPane();
        Skill2_Title = new javax.swing.JTextPane();
        Skill3 = new javax.swing.JPanel();
        Skill3_Desc = new javax.swing.JTextPane();
        Skill3_Title = new javax.swing.JTextPane();
        Skill4 = new javax.swing.JPanel();
        Skill4_Desc = new javax.swing.JTextPane();
        Skill4_Title = new javax.swing.JTextPane();
        Skill5 = new javax.swing.JPanel();
        Skill5_Desc = new javax.swing.JTextPane();
        Skill5_Title = new javax.swing.JTextPane();
        Skill6 = new javax.swing.JPanel();
        Skill6_Desc = new javax.swing.JTextPane();
        Skill6_Title = new javax.swing.JTextPane();
        Skill7 = new javax.swing.JPanel();
        Skill7_Desc = new javax.swing.JTextPane();
        Skill7_Title = new javax.swing.JTextPane();
        Skill8 = new javax.swing.JPanel();
        Skill8_Desc = new javax.swing.JTextPane();
        Skill8_Title = new javax.swing.JTextPane();
        Interest_Divider = new javax.swing.JPanel();
        Interest_Title = new javax.swing.JTextPane();
        Interest1 = new javax.swing.JTextPane();
        Interest2 = new javax.swing.JTextPane();
        Interest3 = new javax.swing.JTextPane();
        Interest4 = new javax.swing.JTextPane();
        Interest5 = new javax.swing.JTextPane();
        Interest6 = new javax.swing.JTextPane();
        Interest7 = new javax.swing.JTextPane();
        Bottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel.setBorder(null);

        ScrollPanel_BG.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackButton.setText("<");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        ScrollPanel_BG.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        Skill_Title.setEditable(false);
        Skill_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill_Title.setBorder(null);
        Skill_Title.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        Skill_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill_Title.setText("SKILLS");
        Skill_Title.setOpaque(false);
        ScrollPanel_BG.add(Skill_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        Skills_Divider.setBackground(new java.awt.Color(0, 150, 119));

        javax.swing.GroupLayout Skills_DividerLayout = new javax.swing.GroupLayout(Skills_Divider);
        Skills_Divider.setLayout(Skills_DividerLayout);
        Skills_DividerLayout.setHorizontalGroup(
            Skills_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Skills_DividerLayout.setVerticalGroup(
            Skills_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        ScrollPanel_BG.add(Skills_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 10));

        Skill1.setBackground(new java.awt.Color(255, 255, 255));
        Skill1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill1_Desc.setEditable(false);
        Skill1_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill1_Desc.setBorder(null);
        Skill1_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill1_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill1_Desc.setText("Managing and Organizing Various Data.");
        Skill1_Desc.setOpaque(false);
        Skill1.add(Skill1_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 40));

        Skill1_Title.setEditable(false);
        Skill1_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill1_Title.setBorder(null);
        Skill1_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill1_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill1_Title.setText("Data Organizing");
        Skill1_Title.setOpaque(false);
        Skill1.add(Skill1_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 260, 130));

        Skill2.setBackground(new java.awt.Color(255, 255, 255));
        Skill2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill2_Desc.setEditable(false);
        Skill2_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill2_Desc.setBorder(null);
        Skill2_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill2_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill2_Desc.setText("Photoshop, Gimp");
        Skill2_Desc.setOpaque(false);
        Skill2.add(Skill2_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 20));

        Skill2_Title.setEditable(false);
        Skill2_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill2_Title.setBorder(null);
        Skill2_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill2_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill2_Title.setText("Photo Editing");
        Skill2_Title.setOpaque(false);
        Skill2.add(Skill2_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 260, 130));

        Skill3.setBackground(new java.awt.Color(255, 255, 255));
        Skill3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill3_Desc.setEditable(false);
        Skill3_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill3_Desc.setBorder(null);
        Skill3_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill3_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill3_Desc.setText("Sony Vegas, Kdenlive, Adobe Premiere.");
        Skill3_Desc.setOpaque(false);
        Skill3.add(Skill3_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 40));

        Skill3_Title.setEditable(false);
        Skill3_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill3_Title.setBorder(null);
        Skill3_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill3_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill3_Title.setText("Video Editing");
        Skill3_Title.setOpaque(false);
        Skill3.add(Skill3_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 260, 130));

        Skill4.setBackground(new java.awt.Color(255, 255, 255));
        Skill4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill4_Desc.setEditable(false);
        Skill4_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill4_Desc.setBorder(null);
        Skill4_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill4_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill4_Desc.setText("Word, Excel, PowerPoint, OneNote, Access.");
        Skill4_Desc.setOpaque(false);
        Skill4.add(Skill4_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 40));

        Skill4_Title.setEditable(false);
        Skill4_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill4_Title.setBorder(null);
        Skill4_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill4_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill4_Title.setText("MS Office");
        Skill4_Title.setOpaque(false);
        Skill4.add(Skill4_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 260, 130));

        Skill5.setBackground(new java.awt.Color(255, 255, 255));
        Skill5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill5_Desc.setEditable(false);
        Skill5_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill5_Desc.setBorder(null);
        Skill5_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill5_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill5_Desc.setText("Mobile Cameras, Low-mid Compacts, High-end Compacts.");
        Skill5_Desc.setOpaque(false);
        Skill5.add(Skill5_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 40));

        Skill5_Title.setEditable(false);
        Skill5_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill5_Title.setBorder(null);
        Skill5_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill5_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill5_Title.setText("Photography");
        Skill5_Title.setOpaque(false);
        Skill5.add(Skill5_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 260, 130));

        Skill6.setBackground(new java.awt.Color(255, 255, 255));
        Skill6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill6_Desc.setEditable(false);
        Skill6_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill6_Desc.setBorder(null);
        Skill6_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill6_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill6_Desc.setText("Drive, Forms, Sheets, Docs, Slides.");
        Skill6_Desc.setOpaque(false);
        Skill6.add(Skill6_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 40));

        Skill6_Title.setEditable(false);
        Skill6_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill6_Title.setBorder(null);
        Skill6_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill6_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill6_Title.setText("Gsuite");
        Skill6_Title.setOpaque(false);
        Skill6.add(Skill6_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 260, 130));

        Skill7.setBackground(new java.awt.Color(255, 255, 255));
        Skill7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill7_Desc.setEditable(false);
        Skill7_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill7_Desc.setBorder(null);
        Skill7_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill7_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill7_Desc.setText("HTML, Python, Java");
        Skill7_Desc.setOpaque(false);
        Skill7.add(Skill7_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 40));

        Skill7_Title.setEditable(false);
        Skill7_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill7_Title.setBorder(null);
        Skill7_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill7_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill7_Title.setText("Programming");
        Skill7_Title.setOpaque(false);
        Skill7.add(Skill7_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ScrollPanel_BG.add(Skill7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 260, 130));

        Skill8.setBackground(new java.awt.Color(255, 255, 255));
        Skill8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skill8_Desc.setEditable(false);
        Skill8_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Skill8_Desc.setBorder(null);
        Skill8_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Skill8_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Skill8_Desc.setText("Computer building, troubleshooting, managing.");
        Skill8_Desc.setOpaque(false);
        Skill8.add(Skill8_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 40));

        Skill8_Title.setEditable(false);
        Skill8_Title.setBackground(new java.awt.Color(255, 255, 255));
        Skill8_Title.setBorder(null);
        Skill8_Title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Skill8_Title.setForeground(new java.awt.Color(0, 0, 0));
        Skill8_Title.setText("Hardware Support");
        Skill8_Title.setOpaque(false);
        Skill8.add(Skill8_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        ScrollPanel_BG.add(Skill8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 280, 130));

        Interest_Divider.setBackground(new java.awt.Color(0, 150, 119));

        javax.swing.GroupLayout Interest_DividerLayout = new javax.swing.GroupLayout(Interest_Divider);
        Interest_Divider.setLayout(Interest_DividerLayout);
        Interest_DividerLayout.setHorizontalGroup(
            Interest_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Interest_DividerLayout.setVerticalGroup(
            Interest_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        ScrollPanel_BG.add(Interest_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 50, 10));

        Interest_Title.setEditable(false);
        Interest_Title.setBackground(new java.awt.Color(255, 255, 255));
        Interest_Title.setBorder(null);
        Interest_Title.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        Interest_Title.setForeground(new java.awt.Color(0, 0, 0));
        Interest_Title.setText("INTERESTS");
        Interest_Title.setOpaque(false);
        ScrollPanel_BG.add(Interest_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        Interest1.setEditable(false);
        Interest1.setBackground(new java.awt.Color(255, 255, 255));
        Interest1.setBorder(null);
        Interest1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest1.setForeground(new java.awt.Color(0, 0, 0));
        Interest1.setText("Video Games");
        Interest1.setOpaque(false);
        ScrollPanel_BG.add(Interest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 780, -1, -1));

        Interest2.setEditable(false);
        Interest2.setBackground(new java.awt.Color(255, 255, 255));
        Interest2.setBorder(null);
        Interest2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest2.setForeground(new java.awt.Color(0, 0, 0));
        Interest2.setText("Films");
        Interest2.setOpaque(false);
        ScrollPanel_BG.add(Interest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 780, -1, -1));

        Interest3.setEditable(false);
        Interest3.setBackground(new java.awt.Color(255, 255, 255));
        Interest3.setBorder(null);
        Interest3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest3.setForeground(new java.awt.Color(0, 0, 0));
        Interest3.setText("Music");
        Interest3.setOpaque(false);
        ScrollPanel_BG.add(Interest3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 780, -1, -1));

        Interest4.setEditable(false);
        Interest4.setBackground(new java.awt.Color(255, 255, 255));
        Interest4.setBorder(null);
        Interest4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest4.setForeground(new java.awt.Color(0, 0, 0));
        Interest4.setText("Editing various medias");
        Interest4.setOpaque(false);
        ScrollPanel_BG.add(Interest4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 780, -1, -1));

        Interest5.setEditable(false);
        Interest5.setBackground(new java.awt.Color(255, 255, 255));
        Interest5.setBorder(null);
        Interest5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest5.setForeground(new java.awt.Color(0, 0, 0));
        Interest5.setText("Technology");
        Interest5.setOpaque(false);
        ScrollPanel_BG.add(Interest5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, -1, -1));

        Interest6.setEditable(false);
        Interest6.setBackground(new java.awt.Color(255, 255, 255));
        Interest6.setBorder(null);
        Interest6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest6.setForeground(new java.awt.Color(0, 0, 0));
        Interest6.setText("Modding");
        Interest6.setOpaque(false);
        ScrollPanel_BG.add(Interest6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 860, -1, -1));

        Interest7.setEditable(false);
        Interest7.setBackground(new java.awt.Color(255, 255, 255));
        Interest7.setBorder(null);
        Interest7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Interest7.setForeground(new java.awt.Color(0, 0, 0));
        Interest7.setText("Programming");
        Interest7.setOpaque(false);
        ScrollPanel_BG.add(Interest7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 860, -1, -1));

        Bottom.setEnabled(false);
        ScrollPanel_BG.add(Bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 960, -1, -1));

        ScrollPanel.setViewportView(ScrollPanel_BG);

        ScrollPanel.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        ScrollPanel.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        MainPanel.add(ScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 720));
        ScrollPanel.getVerticalScrollBar().setUnitIncrement(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Back Button Clicked Action
        dispose(); // Closes this frame.
        AboutMe.main(null); // Runs the AboutMe class where it will open a frame for the About me
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(SkillsInterests.class.getName()).log(Level.SEVERE, null, ex);
            }
            new SkillsInterests().setVisible(true);
        });
    }

// Swing Components declaration
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel Bottom;
    static javax.swing.JTextPane Interest1;
    public static javax.swing.JTextPane Interest2;
    public static javax.swing.JTextPane Interest3;
    public static javax.swing.JTextPane Interest4;
    public static javax.swing.JTextPane Interest5;
    public static javax.swing.JTextPane Interest6;
    public static javax.swing.JTextPane Interest7;
    private javax.swing.JPanel Interest_Divider;
    private javax.swing.JTextPane Interest_Title;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel ScrollPanel_BG;
    private javax.swing.JPanel Skill1;
    public static javax.swing.JTextPane Skill1_Desc;
    public static javax.swing.JTextPane Skill1_Title;
    private javax.swing.JPanel Skill2;
    public static javax.swing.JTextPane Skill2_Desc;
    public static javax.swing.JTextPane Skill2_Title;
    private javax.swing.JPanel Skill3;
    public static javax.swing.JTextPane Skill3_Desc;
    public static javax.swing.JTextPane Skill3_Title;
    private javax.swing.JPanel Skill4;
    public static javax.swing.JTextPane Skill4_Desc;
    public static javax.swing.JTextPane Skill4_Title;
    private javax.swing.JPanel Skill5;
    public static javax.swing.JTextPane Skill5_Desc;
    public static javax.swing.JTextPane Skill5_Title;
    private javax.swing.JPanel Skill6;
    public static javax.swing.JTextPane Skill6_Desc;
    public static javax.swing.JTextPane Skill6_Title;
    private javax.swing.JPanel Skill7;
    public static javax.swing.JTextPane Skill7_Desc;
    public static javax.swing.JTextPane Skill7_Title;
    private javax.swing.JPanel Skill8;
    public static javax.swing.JTextPane Skill8_Desc;
    public static javax.swing.JTextPane Skill8_Title;
    private javax.swing.JTextPane Skill_Title;
    private javax.swing.JPanel Skills_Divider;
}
