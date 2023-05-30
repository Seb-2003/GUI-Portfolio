package Contacts;
import AboutMe.AboutMe;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class Contacts extends javax.swing.JFrame {
    
// Runs the method for creating the form
    public Contacts() {
        initComponents();
    }

// Method for creating the frame
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        Title = new javax.swing.JTextPane();
        Divider = new javax.swing.JPanel();
        Phone = new javax.swing.JTextPane();
        Phone_Desc = new javax.swing.JTextPane();
        Email = new javax.swing.JTextPane();
        Email_Desc = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        MainPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        Title.setEditable(false);
        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setBorder(null);
        Title.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("CONTACTS");
        Title.setOpaque(false);
        MainPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        Divider.setBackground(new java.awt.Color(0, 150, 119));

        javax.swing.GroupLayout DividerLayout = new javax.swing.GroupLayout(Divider);
        Divider.setLayout(DividerLayout);
        DividerLayout.setHorizontalGroup(
            DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DividerLayout.setVerticalGroup(
            DividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MainPanel.add(Divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 10));

        Phone.setEditable(false);
        Phone.setBackground(new java.awt.Color(255, 255, 255));
        Phone.setBorder(null);
        Phone.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Phone.setForeground(new java.awt.Color(0, 0, 0));
        Phone.setText("Phone");
        Phone.setOpaque(false);
        MainPanel.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        Phone_Desc.setEditable(false);
        Phone_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Phone_Desc.setBorder(null);
        Phone_Desc.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Phone_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Phone_Desc.setText(" (63+) 9663650178");
        Phone_Desc.setOpaque(false);
        MainPanel.add(Phone_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, 30));

        Email.setEditable(false);
        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        Email.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText("Email");
        Email.setOpaque(false);
        MainPanel.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        Email_Desc.setEditable(false);
        Email_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Email_Desc.setBorder(null);
        Email_Desc.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Email_Desc.setForeground(new java.awt.Color(0, 0, 0));
        Email_Desc.setText("SebastianMercado003@gmail.com");
        Email_Desc.setOpaque(false);
        MainPanel.add(Email_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 253, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {
// Back Button clicked action
        dispose(); // Closes this frame.
        AboutMe.main(null); // Runs the AboutMe class where it will open a frame for the About me
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Contacts().setVisible(true);
        });
    }

// Swing Components declaration
    private javax.swing.JLabel BackButton;
    private javax.swing.JPanel Divider;
    private javax.swing.JTextPane Email;
    private javax.swing.JTextPane Email_Desc;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextPane Phone;
    private javax.swing.JTextPane Phone_Desc;
    private javax.swing.JTextPane Title;
}
