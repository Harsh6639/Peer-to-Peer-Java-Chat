/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oneonone;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author LENOVO
 */
public class User1 implements ActionListener {
    
    JTextField msg_area;
    JPanel lower,upper;
    
    static JFrame f = new JFrame();
    
    User1(JPanel upper){
    f.setSize(1000,500);
    f.setLocation(0,0);
    f.setVisible(true);
    
    f.setLayout(null);
    
    upper = new JPanel();
    upper.setBackground(new Color(0,255,255));
    upper.setBounds(0,0,1000,50);
    f.add(upper);
    
    JButton exit = new JButton("EXIT");
    exit.setLayout(null);
    exit.setBounds(888,0,100,60);
    exit.setFont(new Font("",Font.BOLD,20));
    exit.setForeground(Color.white);
    exit.setBackground(Color.black);
    
    upper.add(exit);
    
    exit.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent a)
        {
            System.exit(0);
        }});
    
    JLabel user_name = new JLabel("** USER 1 **");
    user_name.setLayout(null);
    user_name.setBounds(5,0,200,50);
    user_name.setForeground(Color.black);
    user_name.setFont(new Font("",Font.BOLD,30));
    upper.add(user_name);
    
    
    
    JLabel active = new JLabel("(Active)");
    active.setLayout(null);
    active.setBounds(200,5,100,50);
    active.setForeground(Color.black);
    active.setFont(new Font("",Font.BOLD,15));
    upper.add(active);
    
    lower = new JPanel();
    lower.setBounds(0,50,980,400);
    f.add(lower);
    
    msg_area = new JTextField();
    msg_area.setLayout(null);
    msg_area.setBounds(0,400,850,50);
    msg_area.setFont(new Font("",Font.PLAIN,20));
    f.add(lower);
    
    
    JButton push = new JButton("PUSH");
    push.setLayout(null);
    push.setBounds(870,400,100,50);
    push.setBackground(Color.white);
    push.setForeground(Color.black);
    push.setFont(new Font("",Font.BOLD,20));
    push.addActionListener(this);
    f.add(push);
    
        
//    {
//        
//    });
    
    

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//    public static void main(String ar[]){
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
        String msg = msg_area.getText();
        
        JLabel msg_label = new JLabel(msg);
        msg_label.setFont(new Font("",Font.PLAIN,20));
        
        JPanel ping = formatLabel(msg);
       
        lower.setLayout(new BorderLayout());
        
        JPanel right = new JPanel(new BorderLayout());
        right.add(ping, BorderLayout.LINE_END);
        upright.add(right);
        upright.add(Box.createVerticalStrut(15));
        
        lower.add(upright,BorderLayout.PAGE_START);
        msg_area.setText("");
        
        
        out.writeUTF(msg);
        
        
        f.repaint();
        f.invalidate();
        f.validate();
       }
        catch(Exception ee){
        System.out.println(ee);
        }
 
    }
    public static JPanel formatLabel(String msg){
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        
        JLabel out = new JLabel("<html><p style=\"width:150px\">"+msg+"<p></html>");
        out.setFont(new Font("",Font.PLAIN,20));
        out.setBackground(Color.yellow);
        out.setOpaque(true);
        out.setBorder(new EmptyBorder(15,15,15,50));
        p.add(out);
        
        Calendar c = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm");
        
        JLabel t = new JLabel();
        
        t.setText(s.format(c.getTime()));
        
        p.add(t);
        
        return p;
    }

//    p
     public static void main(String ar[]){
        new User1();
        
        
        try{
            ServerSocket s = new ServerSocket(6001);
            while(true){
                Socket ss = s.accept();
                DataInputStream in = new DataInputStream(ss.getInputStream());
                out = new DataOutputStream(ss.getOutputStream());
                
                
                while(true){
                    String chat = in.readUTF();
                    JPanel panel = formatLabel(chat);
                    
                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel,BorderLayout.LINE_START);
                    upright.add(left);
                    f.validate();
                    
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
}
