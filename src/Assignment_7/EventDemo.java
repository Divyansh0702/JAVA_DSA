package Assignment_7;

import java.awt.*;
import java.awt.event.*;

public class EventDemo extends Frame implements ActionListener {
    Button b;

    EventDemo() {
        b = new Button("Click Me");
        b.addActionListener(this);
        add(b);
        setSize(200,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String args[]) {
        new EventDemo();
    }
}
