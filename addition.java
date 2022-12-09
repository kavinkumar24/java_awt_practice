import java.awt.*;
import java.awt.event.*;  
class frame extends Frame implements ActionListener{
    TextField tf1; 
            TextField tf2; 
            TextField tf3;
            Label l1; 
            Button b;
            Button b1;
    frame(){
        setTitle("Adder"); 
                          tf1 = new TextField(); 
                          tf1.setBounds(100, 50, 85, 20);
                          tf2 = new TextField(); 
                          tf2.setBounds(100, 100, 85, 20); 
                          b = new Button("Add");
                          tf3 = new TextField("result will be shown here:");
                          tf3.setBounds(100,130,150,20);
                          b.setBounds(110,160,60,40);
                          b1 =new Button("Subtract");
                          b1.setBounds(110,220,60,40);
                          l1 = new Label(""); 
                          l1.setBounds(100, 120, 85, 20); 
                          add(b); 
                          add(tf1); 
                          add(tf2); 
                          add(tf3);
                          add(b1);
                          add(l1); 
                          setSize(300,300); 
                          setVisible(true);
                          b.addActionListener(this);
                          b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = a+b;
        int d = a-b;
        String result_sub = String.valueOf(c);
        String result = String.valueOf(c);
        tf3.setText(result);
   
        
    }
    public  static void main(String args[]){
        frame f = new frame();
        f.setSize(400,400);
        f.setTitle("Demo frame");
        f.setVisible(true);
    }
}
