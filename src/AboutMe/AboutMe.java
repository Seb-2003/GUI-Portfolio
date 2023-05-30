package AboutMe;
import Contacts.Contacts;
import SkillsInterests.SkillsInterests;
import Works.Works;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
@SuppressWarnings("serial")
public class AboutMe extends javax.swing.JFrame {
    
// Runs the method for creating the form
    public AboutMe() {
        initComponents();
        // Sets the Scrollbar at the top at start
        ScrollPanel.getViewport().setViewPosition(new Point(0, 0));
        SwingUtilities.invokeLater(() -> {
            ScrollPanel.getViewport().setViewPosition(new Point(0, 0));
        });
    }
    
// Method for switching panes
    public void Navigation() {
        if (TabbedPanes.getSelectedIndex() == 0) {
            TabbedPanes.setSelectedIndex(1);
        } else {
            TabbedPanes.setSelectedIndex(0);
        }
    }
    
 // Method for creating the frame
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ScrollPanel = new javax.swing.JScrollPane();
        ScrollPanel_Panel = new javax.swing.JPanel();
        Name = new javax.swing.JTextPane();
        Role = new javax.swing.JTextPane();
        ProfilePicture = new javax.swing.JLabel();
        WallpaperBG = new javax.swing.JLabel();
        TabbedPanes = new javax.swing.JTabbedPane();
        AboutMe_Panel = new javax.swing.JPanel();
        AboutMe_Title = new javax.swing.JTextPane();
        AboutMe_Text = new javax.swing.JTextArea();
        AboutMe_Divider = new javax.swing.JPanel();
        AboutMe_NavigationLeft = new javax.swing.JLabel();
        AboutMe_NavigationRight = new javax.swing.JLabel();
        Education_Panel = new javax.swing.JPanel();
        Education_Divider = new javax.swing.JPanel();
        Education_Title = new javax.swing.JTextPane();
        Education_NavigationRight = new javax.swing.JLabel();
        Education_NavigationLeft = new javax.swing.JLabel();
        Education_School1 = new javax.swing.JPanel();
        School1_Until = new javax.swing.JTextArea();
        School1_Date = new javax.swing.JTextArea();
        School1_Name = new javax.swing.JTextArea();
        School1_Divider = new javax.swing.JPanel();
        Education_School2 = new javax.swing.JPanel();
        School3_Name = new javax.swing.JTextArea();
        School3_Divider = new javax.swing.JPanel();
        School3_Until = new javax.swing.JTextArea();
        School3_Date = new javax.swing.JTextArea();
        Education_School3 = new javax.swing.JPanel();
        School2_Name = new javax.swing.JTextArea();
        School2_Divider = new javax.swing.JPanel();
        School2_Until = new javax.swing.JTextArea();
        School2_Date = new javax.swing.JTextArea();
        Categories_Panel = new javax.swing.JPanel();
        Categories_Title = new javax.swing.JTextPane();
        Categories_Divider = new javax.swing.JPanel();
        ContactButton = new javax.swing.JButton();
        SkillsInterestButton = new javax.swing.JButton();
        WorksButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 680));
        setResizable(false);

        MainPanel.setPreferredSize(new java.awt.Dimension(1330, 680));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPanel.setViewportView(null);
        ScrollPanel.getViewport().setViewPosition(new Point(0, 0));
        ScrollPanel.getVerticalScrollBar().setUnitIncrement(10);

        ScrollPanel_Panel.setFocusable(false);
        ScrollPanel_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setEditable(false);
        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(null);
        Name.setFont(new java.awt.Font("Century Gothic", 1, 60)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Sebastian Mercado");
        Name.setOpaque(false);
        ScrollPanel_Panel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 570, 70));

        Role.setEditable(false);
        Role.setBackground(new java.awt.Color(255, 255, 255));
        Role.setBorder(null);
        Role.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        Role.setForeground(new java.awt.Color(153, 153, 153));
        Role.setText("Information Technologist");
        Role.setToolTipText("");
        Role.setOpaque(false);
        ScrollPanel_Panel.add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 30));

        ProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutMe/Pictures/PFP.png"))); // NOI18N
        ProfilePicture.setText("jLabel2");
        ScrollPanel_Panel.add(ProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 230, 230));

        WallpaperBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutMe/Pictures/Background.jpg"))); // NOI18N
        WallpaperBG.setText("jLabel3");
        ScrollPanel_Panel.add(WallpaperBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 420));

        AboutMe_Panel.setBackground(new java.awt.Color(255, 255, 255));
        AboutMe_Panel.setFocusable(false);
        AboutMe_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AboutMe_Title.setEditable(false);
        AboutMe_Title.setBackground(new java.awt.Color(255, 255, 255));
        AboutMe_Title.setBorder(null);
        AboutMe_Title.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        AboutMe_Title.setForeground(new java.awt.Color(0, 0, 0));
        AboutMe_Title.setText("ABOUT ME");
        AboutMe_Title.setOpaque(false);
        AboutMe_Panel.add(AboutMe_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        AboutMe_Text.setEditable(false);
        AboutMe_Text.setBackground(new java.awt.Color(255, 255, 255));
        AboutMe_Text.setColumns(20);
        AboutMe_Text.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        AboutMe_Text.setForeground(new java.awt.Color(0, 0, 0));
        AboutMe_Text.setRows(5);
        AboutMe_Text.setText("I'm a student who is generally enthusiastic about learning new things, particularly \nabout technology. I've been editing various sorts of media for the last few years \nand have completed a few projects. Learning new technology-related skills is \nsomething I've always enjoyed doing, and I also strive to enhance my current \nones whenever the opportunity presents itself.");
        AboutMe_Text.setToolTipText("");
        AboutMe_Text.setWrapStyleWord(true);
        AboutMe_Text.setBorder(null);
        AboutMe_Panel.add(AboutMe_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 690, 160));

        AboutMe_Divider.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout AboutMe_DividerLayout = new javax.swing.GroupLayout(AboutMe_Divider);
        AboutMe_Divider.setLayout(AboutMe_DividerLayout);
        AboutMe_DividerLayout.setHorizontalGroup(
            AboutMe_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AboutMe_DividerLayout.setVerticalGroup(
            AboutMe_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        AboutMe_Panel.add(AboutMe_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 10));

        AboutMe_NavigationLeft.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        AboutMe_NavigationLeft.setForeground(new java.awt.Color(51, 51, 51));
        AboutMe_NavigationLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutMe_NavigationLeft.setText("<");
        AboutMe_NavigationLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutMe_NavigationLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMe_NavigationLeftMouseClicked(evt);
            }
        });
        AboutMe_Panel.add(AboutMe_NavigationLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 60, 60));

        AboutMe_NavigationRight.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        AboutMe_NavigationRight.setForeground(new java.awt.Color(51, 51, 51));
        AboutMe_NavigationRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutMe_NavigationRight.setText(">");
        AboutMe_NavigationRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutMe_NavigationRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMe_NavigationRightMouseClicked(evt);
            }
        });
        AboutMe_Panel.add(AboutMe_NavigationRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 270, 60, 60));

        TabbedPanes.addTab("tab1", AboutMe_Panel);

        Education_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Education_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Education_Divider.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout Education_DividerLayout = new javax.swing.GroupLayout(Education_Divider);
        Education_Divider.setLayout(Education_DividerLayout);
        Education_DividerLayout.setHorizontalGroup(
            Education_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Education_DividerLayout.setVerticalGroup(
            Education_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Education_Panel.add(Education_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 10));

        Education_Title.setEditable(false);
        Education_Title.setBackground(new java.awt.Color(255, 255, 255));
        Education_Title.setBorder(null);
        Education_Title.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        Education_Title.setForeground(new java.awt.Color(0, 0, 0));
        Education_Title.setText("EDUCATION");
        Education_Title.setOpaque(false);
        Education_Panel.add(Education_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        Education_NavigationRight.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Education_NavigationRight.setForeground(new java.awt.Color(51, 51, 51));
        Education_NavigationRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Education_NavigationRight.setText(">");
        Education_NavigationRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Education_NavigationRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Education_NavigationRightMouseClicked(evt);
            }
        });
        Education_Panel.add(Education_NavigationRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 270, 60, 60));

        Education_NavigationLeft.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Education_NavigationLeft.setForeground(new java.awt.Color(51, 51, 51));
        Education_NavigationLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Education_NavigationLeft.setText("<");
        Education_NavigationLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Education_NavigationLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Education_NavigationLeftMouseClicked(evt);
            }
        });
        Education_Panel.add(Education_NavigationLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 60, 60));

        Education_School1.setBackground(new java.awt.Color(255, 255, 255));
        Education_School1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        School1_Until.setEditable(false);
        School1_Until.setBackground(new java.awt.Color(255, 255, 255));
        School1_Until.setColumns(20);
        School1_Until.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        School1_Until.setForeground(new java.awt.Color(0, 0, 0));
        School1_Until.setRows(5);
        School1_Until.setText("(Elementary - Highschool)");
        Education_School1.add(School1_Until, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 20));

        School1_Date.setEditable(false);
        School1_Date.setBackground(new java.awt.Color(255, 255, 255));
        School1_Date.setColumns(20);
        School1_Date.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        School1_Date.setForeground(new java.awt.Color(102, 102, 102));
        School1_Date.setRows(5);
        School1_Date.setText("2010 - 2020");
        Education_School1.add(School1_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 20));

        School1_Name.setEditable(false);
        School1_Name.setBackground(new java.awt.Color(255, 255, 255));
        School1_Name.setColumns(20);
        School1_Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        School1_Name.setForeground(new java.awt.Color(0, 0, 0));
        School1_Name.setRows(5);
        School1_Name.setText("Holy Trinity Academy");
        Education_School1.add(School1_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 30));

        School1_Divider.setBackground(new java.awt.Color(0, 0, 0));
        School1_Divider.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout School1_DividerLayout = new javax.swing.GroupLayout(School1_Divider);
        School1_Divider.setLayout(School1_DividerLayout);
        School1_DividerLayout.setHorizontalGroup(
            School1_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        School1_DividerLayout.setVerticalGroup(
            School1_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Education_School1.add(School1_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 10, 1, 120));

        Education_Panel.add(Education_School1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 230, 130));

        Education_School2.setBackground(new java.awt.Color(255, 255, 255));
        Education_School2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        School3_Name.setEditable(false);
        School3_Name.setBackground(new java.awt.Color(255, 255, 255));
        School3_Name.setColumns(20);
        School3_Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        School3_Name.setForeground(new java.awt.Color(0, 0, 0));
        School3_Name.setRows(5);
        School3_Name.setText("Far Eastern University\n& Holy Trinity Academy");
        Education_School2.add(School3_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 50));

        School3_Divider.setBackground(new java.awt.Color(0, 0, 0));
        School3_Divider.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout School3_DividerLayout = new javax.swing.GroupLayout(School3_Divider);
        School3_Divider.setLayout(School3_DividerLayout);
        School3_DividerLayout.setHorizontalGroup(
            School3_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        School3_DividerLayout.setVerticalGroup(
            School3_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Education_School2.add(School3_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 10, 1, 130));

        School3_Until.setEditable(false);
        School3_Until.setBackground(new java.awt.Color(255, 255, 255));
        School3_Until.setColumns(20);
        School3_Until.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        School3_Until.setForeground(new java.awt.Color(0, 0, 0));
        School3_Until.setRows(5);
        School3_Until.setText("(Senior High School)");
        Education_School2.add(School3_Until, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 20));

        School3_Date.setEditable(false);
        School3_Date.setBackground(new java.awt.Color(255, 255, 255));
        School3_Date.setColumns(20);
        School3_Date.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        School3_Date.setForeground(new java.awt.Color(102, 102, 102));
        School3_Date.setRows(5);
        School3_Date.setText("2020 - 2022\n");
        Education_School2.add(School3_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 20));

        Education_Panel.add(Education_School2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 230, 130));

        Education_School3.setBackground(new java.awt.Color(255, 255, 255));
        Education_School3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        School2_Name.setEditable(false);
        School2_Name.setBackground(new java.awt.Color(255, 255, 255));
        School2_Name.setColumns(20);
        School2_Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        School2_Name.setForeground(new java.awt.Color(0, 0, 0));
        School2_Name.setRows(5);
        School2_Name.setText("National University\n(NU)");
        Education_School3.add(School2_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 50));

        School2_Divider.setBackground(new java.awt.Color(0, 0, 0));
        School2_Divider.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout School2_DividerLayout = new javax.swing.GroupLayout(School2_Divider);
        School2_Divider.setLayout(School2_DividerLayout);
        School2_DividerLayout.setHorizontalGroup(
            School2_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        School2_DividerLayout.setVerticalGroup(
            School2_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Education_School3.add(School2_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 10, 1, 130));

        School2_Until.setEditable(false);
        School2_Until.setBackground(new java.awt.Color(255, 255, 255));
        School2_Until.setColumns(20);
        School2_Until.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        School2_Until.setForeground(new java.awt.Color(0, 0, 0));
        School2_Until.setRows(5);
        School2_Until.setText("(College)");
        Education_School3.add(School2_Until, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 20));

        School2_Date.setEditable(false);
        School2_Date.setBackground(new java.awt.Color(255, 255, 255));
        School2_Date.setColumns(20);
        School2_Date.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        School2_Date.setForeground(new java.awt.Color(102, 102, 102));
        School2_Date.setRows(5);
        School2_Date.setText("2022 - Present\n");
        Education_School3.add(School2_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 20));

        Education_Panel.add(Education_School3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 230, 130));

        TabbedPanes.addTab("tab2", Education_Panel);

        ScrollPanel_Panel.add(TabbedPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1320, 530));

        Categories_Panel.setBackground(new java.awt.Color(19, 29, 17));
        Categories_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Categories_Title.setEditable(false);
        Categories_Title.setBackground(new java.awt.Color(255, 255, 255));
        Categories_Title.setBorder(null);
        Categories_Title.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Categories_Title.setForeground(new java.awt.Color(255, 255, 255));
        Categories_Title.setText("CATEGORIES");
        Categories_Title.setOpaque(false);
        Categories_Panel.add(Categories_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 220, 50));

        Categories_Divider.setBackground(new java.awt.Color(0, 150, 119));

        javax.swing.GroupLayout Categories_DividerLayout = new javax.swing.GroupLayout(Categories_Divider);
        Categories_Divider.setLayout(Categories_DividerLayout);
        Categories_DividerLayout.setHorizontalGroup(
            Categories_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Categories_DividerLayout.setVerticalGroup(
            Categories_DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Categories_Panel.add(Categories_Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 80, 10));

        ContactButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ContactButton.setForeground(new java.awt.Color(51, 51, 51));
        ContactButton.setText("CONTACT");
        ContactButton.setBorder(null);
        ContactButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContactButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactButtonMouseClicked(evt);
            }
        });
        Categories_Panel.add(ContactButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 160, 40));

        SkillsInterestButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SkillsInterestButton.setForeground(new java.awt.Color(51, 51, 51));
        SkillsInterestButton.setText("SKILLS | INTERESTS");
        SkillsInterestButton.setBorder(null);
        SkillsInterestButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SkillsInterestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SkillsInterestButtonMouseClicked(evt);
            }
        });
        Categories_Panel.add(SkillsInterestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 160, 40));

        WorksButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        WorksButton.setForeground(new java.awt.Color(51, 51, 51));
        WorksButton.setText("WORKS");
        WorksButton.setBorder(null);
        WorksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WorksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorksButtonMouseClicked(evt);
            }
        });
        Categories_Panel.add(WorksButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 160, 40));

        ScrollPanel_Panel.add(Categories_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 910, 1330, 290));

        ScrollPanel.setViewportView(ScrollPanel_Panel);

        MainPanel.add(ScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 1340, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AboutMe_NavigationRightMouseClicked(java.awt.event.MouseEvent evt) {
// Button Navigation Clicked Action
        Navigation();
    }

    private void Education_NavigationRightMouseClicked(java.awt.event.MouseEvent evt) {
// Button Navigation Clicked Action
        Navigation();
    }

    private void AboutMe_NavigationLeftMouseClicked(java.awt.event.MouseEvent evt) {
// Button Navigation Clicked Action
        Navigation();
    }

    private void Education_NavigationLeftMouseClicked(java.awt.event.MouseEvent evt) {
// Button Navigation Clicked Action
        Navigation();
    }

    private void SkillsInterestButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Skills Button Clicked Action
        dispose(); // Closes this frame.
        SkillsInterests.main(null); // Runs the SkillsInterests class where it will open a frame for the Skills & Interests
    }

    private void WorksButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Works Button Clicked Action
        dispose(); // Closes this frame.
        Works.main(null); // Runs the Works class where it will open a frame for the Works
    }

    private void ContactButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Contacts Button Clicked Action
        dispose(); // Closes this frame.
        Contacts.main(null); // Runs the Contacts class where it will open a frame for the Contacts
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(AboutMe.class.getName()).log(Level.SEVERE, null, ex);
            }
            new AboutMe().setVisible(true);
        });
    }
    
// Swing Components declaration
    private javax.swing.JPanel AboutMe_Divider;
    private javax.swing.JLabel AboutMe_NavigationLeft;
    private javax.swing.JLabel AboutMe_NavigationRight;
    private javax.swing.JPanel AboutMe_Panel;
    private javax.swing.JTextArea AboutMe_Text;
    private javax.swing.JTextPane AboutMe_Title;
    private javax.swing.JPanel Categories_Divider;
    private javax.swing.JPanel Categories_Panel;
    private javax.swing.JTextPane Categories_Title;
    private javax.swing.JButton ContactButton;
    private javax.swing.JPanel Education_Divider;
    private javax.swing.JLabel Education_NavigationLeft;
    private javax.swing.JLabel Education_NavigationRight;
    private javax.swing.JPanel Education_Panel;
    private javax.swing.JPanel Education_School1;
    private javax.swing.JPanel Education_School2;
    private javax.swing.JPanel Education_School3;
    private javax.swing.JTextPane Education_Title;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextPane Name;
    private javax.swing.JLabel ProfilePicture;
    private javax.swing.JTextPane Role;
    private javax.swing.JTextArea School1_Date;
    private javax.swing.JPanel School1_Divider;
    private javax.swing.JTextArea School1_Name;
    private javax.swing.JTextArea School1_Until;
    private javax.swing.JTextArea School2_Date;
    private javax.swing.JPanel School2_Divider;
    private javax.swing.JTextArea School2_Name;
    private javax.swing.JTextArea School2_Until;
    private javax.swing.JTextArea School3_Date;
    private javax.swing.JPanel School3_Divider;
    private javax.swing.JTextArea School3_Name;
    private javax.swing.JTextArea School3_Until;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel ScrollPanel_Panel;
    private javax.swing.JButton SkillsInterestButton;
    private javax.swing.JTabbedPane TabbedPanes;
    private javax.swing.JLabel WallpaperBG;
    private javax.swing.JButton WorksButton;
}
