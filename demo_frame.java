import java.awt.*;
class frame extends Frame{
    frame(){
        Button b = new Button("Button1");
        b.setBounds(10,50,80,40);
        add(b);
        Label l1 = new Label("first name");
        add(l1);
        TextField tf1 = new TextField(20);
        tf1.setBounds(40,50,80,40);
        add(tf1);
    }
    public  static void main(String args[]){
        frame f = new frame();
        f.setSize(300,300);
        f.setTitle("Demo frame");
        f.setVisible(true);
    }
}
