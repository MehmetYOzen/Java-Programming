/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
 * Login screen for mailbox
 * @author mehmet ozen <mehmetozen159@gmail.com>
 */

public class LoginGUI extends JFrame{
    
    JPanel signupPanel;
    JLabel closeDefault;
    JLabel loginText;
    JLabel signinText;
    JLabel createAccountButton;
    JLabel usernameText;
    JLabel passwordText;
    JTextField username;
    JPasswordField password;
    JButton loginButton;
    GroupLayout signupPanelLayout;
    GroupLayout layout;
    
    boolean cleanableUserName = true;
    boolean cleanablePassword = true;
    public boolean logined = false;
    
    public LoginGUI(){
        components();
    }
                        
    private void components() {
        //Set Panel
        signupPanel = new JPanel();
        
        //Set Labels
        closeDefault = new JLabel("x");
        loginText = new JLabel("Login");
        signinText = new JLabel("Don't have an account?");
        createAccountButton = new JLabel("Create One!");
        usernameText = new JLabel("username");
        passwordText = new JLabel("password");
        
        //Set TextFields
        username = new JTextField("username");
        password = new JPasswordField("password");
        
        //Buttons
        loginButton = new JButton("Login");
        
        //GroupLayout
        signupPanelLayout = new GroupLayout(signupPanel);
        layout = new GroupLayout(getContentPane());
        
        //Set default close button
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        //Login Text
        loginText.setFont(new Font("Segoe UI Black", 1, 18));
        loginText.setHorizontalAlignment(SwingConstants.CENTER);

        //Signin Text
        signinText.setHorizontalAlignment(SwingConstants.CENTER);

        //Create Account Button
        createAccountButton.setForeground(new Color(102, 153, 255));
        createAccountButton.setToolTipText("Sign-up");
        createAccountButton.setHorizontalAlignment(SwingConstants.CENTER);
        createAccountButton.setHorizontalTextPosition(SwingConstants.CENTER);
        createAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                createAccountButton(evt);
            }

        });

        //Username textfield
        username.setForeground(new Color(102, 102, 102));
        username.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                unTextFieldMouseClicked(evt);
            }
        });

        //Password textfield
        password.setForeground(new Color(102, 102, 102));
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                pwTextFieldMouseClicked(evt);
            }
        });

        //Username text
        usernameText.setHorizontalAlignment(SwingConstants.CENTER);
        passwordText.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Close Button
        closeDefault.setFont(new Font("Dialog", 1, 14));
        closeDefault.setHorizontalAlignment(SwingConstants.CENTER);
        closeDefault.setText("X");
        closeDefault.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt){
                closeDefaultMouseReleased(evt);
            }
            
        });
        
        //Login Button
        loginButton.setForeground(Color.red);
        loginButton.setFont(new Font("Dialog", 1, 14)); 
        loginButton.setText("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoginToMailBox(evt);
            }
        });
        
        //Signup panel
        signupPanel.setLayout(signupPanelLayout);
        signupPanelLayout.setHorizontalGroup(
            signupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(signinText, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(createAccountButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(signupPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(signupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(signupPanelLayout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(signupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(passwordText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usernameText, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(signupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addGap(96, 96, 96)
            .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
            .addComponent(username, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(password))
            .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, signupPanelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(closeDefault, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
        );
        signupPanelLayout.setVerticalGroup(
            signupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(signupPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(closeDefault)
            .addGap(6, 6, 6)
            .addComponent(loginText, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
            .addGap(45, 45, 45)
            .addGroup(signupPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(usernameText))
            .addGap(18, 18, 18)
            .addGroup(signupPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(passwordText))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
            .addComponent(loginButton)
            .addGap(18, 18, 18)
            .addComponent(signinText, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(createAccountButton)
            .addGap(47, 47, 47))
        );
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(signupPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(signupPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }
    public static void main(String[] args) {
         // call javaxtest
        LoginGUI loginScreen = new LoginGUI();
        loginScreen.setLocationRelativeTo(null); 
        loginScreen.setVisible(true);
    }

    
                //Mouse Events//
    //Buttons//
    void LoginToMailBox(ActionEvent evt) {
        logined = true;
    }
    
    void closeDefaultMouseReleased(MouseEvent evt){
        this.closeDefault.setBackground(new Color(255, 255, 255));
        System.exit(0);
    }
    
    void createAccountButton(MouseEvent evt) {
        if (createAccountButton.getText() == "Create One!"){
            loginText.setText("Signup");
            loginButton.setText("Signup");
            signinText.setText("Already a member?");
            createAccountButton.setText("Sign in!");
        } else {
            loginText.setText("Login");
            loginButton.setText("Sign");
            signinText.setText("Don't have an account?");
            createAccountButton.setText("Create One!");
        }
    }
    
    //TextFields//
    void unTextFieldMouseClicked(MouseEvent evt){
        if (cleanableUserName){
            username.setText("");
            cleanableUserName = false;
        }
    }
    void pwTextFieldMouseClicked(MouseEvent evt){
        if (cleanablePassword){
            password.setText("");
            cleanablePassword = false;
            loginButton.setForeground(Color.black);
        }
    }
    
    
}
