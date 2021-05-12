package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author mehmet ozen <mehmetozen159@gmail.com>
 */
public class Mailer extends JFrame{
    JPanel mainPanel;
    JPanel mail;
    JPanel openedMail;
    JPanel sent;
    JPanel sentMails;
    JTabbedPane tabbs;
    JScrollPane scrollPane1;
    JScrollPane about;
    JLabel aboutMail;
    JLabel title;
    JLabel toText;
    JLabel fromText;
    JList mailsRecieved;
    JTextArea typeMail;
    JTextField enterTitle;
    JTextField to;
    JTextField from;
    JButton sentButton;

    public Mailer() {
        components();
    }                     
    
    private void components() {

        mainPanel = new JPanel();
        tabbs = new JTabbedPane();
        mail = new JPanel();
        openedMail = new JPanel();
        aboutMail = new JLabel();
        title = new JLabel();
        scrollPane1 = new JScrollPane();
        mailsRecieved = new JList<>();
        sent = new JPanel();
        sentMails = new JPanel();
        toText = new JLabel();
        fromText = new JLabel();
        enterTitle = new JTextField();
        sentButton = new JButton();
        about = new JScrollPane();
        typeMail = new JTextArea();
        to = new JTextField();
        from = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tabbs.setBackground(new Color(51, 51, 51));
        tabbs.setForeground(new Color(204, 204, 204));
        tabbs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbs.setFont(new Font("Monospaced", 1, 14)); 

        mail.setForeground(new Color(153, 153, 153));
        mail.setFont(new Font("Maiandra GD", 1, 14)); 

        openedMail.setBackground(new Color(102, 102, 102));

        aboutMail.setBackground(new Color(102, 102, 102));
        aboutMail.setForeground(new Color(0, 0, 0));
        aboutMail.setText("The mail text about the topic other person sent... "
                + "The mail text about the topic other person sent... "
                + "The mail text about the topic other person sent...");
        aboutMail.setFocusable(false);
        aboutMail.setHorizontalTextPosition(SwingConstants.LEADING);

        title.setFont(new Font("DialogInput", 1, 18)); 
        title.setText("The Title Of this Mail");

        GroupLayout openedMailLayout = new GroupLayout(openedMail);
        openedMail.setLayout(openedMailLayout);
        openedMailLayout.setHorizontalGroup(
            openedMailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(openedMailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(openedMailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(aboutMail, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(title, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addContainerGap())
        );
        openedMailLayout.setVerticalGroup(
            openedMailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(openedMailLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(title)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutMail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mailsRecieved.setFont(new Font("Dubai", 1, 14)); 
        mailsRecieved.setModel(new AbstractListModel<String>() {
            String[] strings = { "Hi Josh!", "A little Help", "(AD) %50 Discount", 
                "dont have any Idea", "What to type", "to Test", "the slider is working",
                "Yaaayy", "Lets gooo", "Boiiiiii", "Niceee", "Niceee2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPane1.setViewportView(mailsRecieved);

        GroupLayout mailLayout = new GroupLayout(mail);
        mail.setLayout(mailLayout);
        mailLayout.setHorizontalGroup(mailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, mailLayout.createSequentialGroup()
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(openedMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mailLayout.setVerticalGroup(mailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, mailLayout.createSequentialGroup()
                .addGroup(mailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(openedMail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbs.addTab("MAILS", mail);

        sent.setFont(new Font("Maiandra GD", 1, 14)); 

        sentMails.setBackground(new Color(102, 102, 102));

        toText.setFont(new Font("Dialog", 1, 12)); 
        toText.setForeground(new Color(0, 0, 0));
        toText.setText("To:");

        fromText.setFont(new Font("Dialog", 1, 12)); 
        fromText.setForeground(new Color(0, 0, 0));
        fromText.setText("From:");

        enterTitle.setFont(new Font("DialogInput", 1, 18)); 
        enterTitle.setText("TITLE");

        sentButton.setText("Sent");
        sentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        typeMail.setColumns(20);
        typeMail.setFont(new Font("Dubai", 0, 14)); 
        typeMail.setLineWrap(true);
        typeMail.setRows(5);
        typeMail.setText("Type something about your mail");
        about.setViewportView(typeMail);

        to.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });

        GroupLayout sentMailsLayout = new GroupLayout(sentMails);
        sentMails.setLayout(sentMailsLayout);
        sentMailsLayout.setHorizontalGroup(
            sentMailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, sentMailsLayout.createSequentialGroup()
                .addGroup(sentMailsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(sentMailsLayout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(about, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE))
                    .addGroup(sentMailsLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(toText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(from, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(sentButton, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sentMailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTitle)
                .addContainerGap())
        );
        sentMailsLayout.setVerticalGroup(
            sentMailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, sentMailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTitle, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(about, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sentMailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sentButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(toText)
                    .addComponent(fromText))
                .addContainerGap())
        );

        GroupLayout sentLayout = new GroupLayout(sent);
        sent.setLayout(sentLayout);
        sentLayout.setHorizontalGroup(
            sentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sentMails, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sentLayout.setVerticalGroup(
            sentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sentMails, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbs.addTab("SENT", sent);

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tabbs)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tabbs)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                              

    /**
     * @param args
     */
    public static void main(String args[]) {
        LoginGUI loginscreen = new LoginGUI();
        loginscreen.setLocationRelativeTo(null);
        loginscreen.setVisible(true);
        Mailer mailer = new Mailer();
        mailer.setLocationRelativeTo(null); 
        while (!loginscreen.logined){
            mailer.setVisible(false);
        }
        mailer.setVisible(true);
        loginscreen.setVisible(false);
    }
}