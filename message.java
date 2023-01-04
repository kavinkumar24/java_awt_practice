import java.awt.*;
import java.awt.event.*;
class awt extends Frame{
    awt(){
        Button b1 = new Button("click");
        b1.setBounds(70,200,60,40);;
        
        TextField tf1 = new TextField(10);
        tf1.setBounds(100, 50, 85, 20);
        TextField tf2 = new TextField(10);
        tf2.setBounds(100, 100, 85, 20); 
        add(tf1);
        add(tf2);
        add(b1);
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) 
                {
                    tf1.setText("Welcome");
                }
            });
    }
  
