//in new pacckage com.code
//oppeng GUI form
//jPanell= panell main
//button1=button_msg;

package com.code;

import java.swing.*;


public class App{
private JButton button_msg;
private JPanel panelmain;

public App(){
button_msg.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(null,"Hello world");
}
});
}

public static void main (String[]args){
JFrame frame = new JFrame("App");
frame.setContentPane(new App().panelMain);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
}
