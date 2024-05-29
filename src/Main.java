

//1.Add a label
/*
import javax.swing.*;

class MyFrame extends JFrame {
    JLabel label;

    MyFrame()
    {
        label=new JLabel("Hello World");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(label);
    }

}

public class Main
{
    public static void main(String [] args)
    {
        //make the forms application
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 */
//------------------------------------------------------------------------------
//2.Add a button
/*
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame
{
    JButton button;

            MyFrame()
            {
                button=new JButton("Click me");
                button.setVerticalAlignment(JButton.TOP);
                button.setHorizontalAlignment(JButton.CENTER);

                this.add(button);
                this.setLayout(new FlowLayout());
            }
}

public class Main
{
    public static void main(String [] args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
 */
//----------------------------------------------------------------------------
//3.Event Handling
/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel label;
    JButton incrementButton;
    JButton decrementButton;
    int count=0;

    MyFrame()
    {
        label=new JLabel();
        label.setText("Hello"+count);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        incrementButton=new JButton("Increment");
        decrementButton=new JButton("Decrement");

        this.setLayout(new  FlowLayout());
        this.add(label);
        this.add(incrementButton);
        this.add(decrementButton);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);
    }
public void actionPerformed(ActionEvent e)
{
    if(e.getSource() ==incrementButton)
    {
        count++;
    }
    if(e.getSource()==decrementButton)
    {
        count--;
    }
    label.setText("Hello"+count);
}
}

public class Main
{
    public static void main(String [] args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
 */
//------------------------------------------------------------------------
//    4.TextField
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener
{
    JLabel label;
    JButton button;
    JTextField textField;

    MyFrame()
    {
textField=new JTextField();
textField.setColumns(15);

button=new JButton("Click");

label=new JLabel("Empty field");

this.add(textField);
this.add(button);
this.add(label);
this.setLayout(new FlowLayout());

button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button)
{
    label.setText(textField.getText());
}
    }
}

public class Main
{
    public static void main(String [] args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 */
//----------------------------------------------------------------------------
//    5.Text Area
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    JTextArea textArea;
    JButton button;


    MyFrame()
    {
      textArea=new JTextArea(10,40);
      button=new JButton("Add text");

      this.add(textArea);
      this.add(button);
      this.setLayout(new FlowLayout());
      this.button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button);
        System.out.println(textArea.getSelectedText());
    }
}

public class Main
{
    public static void main(String []args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
 */

