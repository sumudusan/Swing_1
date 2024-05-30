

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
//-----------------------------------------------------------------------------------
// 6.CheckBox
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener
{
    JCheckBox checkBox1,checkBox2;
    JTextField textField;
MyFrame()
{
checkBox1=new JCheckBox("Bold");
checkBox2=new JCheckBox("Italic");
textField=new JTextField();
textField.setColumns(20);

this.add(checkBox1);
this.add(checkBox2);
this.add(textField);
this.setLayout(new FlowLayout());

checkBox1.addActionListener(this);
checkBox2.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
     int bold=0;
     int italic=0;

    if (checkBox1.isSelected())
    {
        bold=Font.BOLD;
    }
    if (checkBox2.isSelected())
    {
        italic=Font.ITALIC;
    }
    textField.setFont(new Font("Times New Roman",bold | italic,12));
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
//------------------------------------------------------------------------------------------------------
// 7.Radio Button
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    JLabel label;

    MyFrame()
    {
    ButtonGroup group=new ButtonGroup();
    radioButton1=new JRadioButton("Male");
    radioButton2=new JRadioButton("Female");
    radioButton3=new JRadioButton("Other");
    label=new JLabel("Not Selected");

    radioButton1.addActionListener(this);
    radioButton2.addActionListener(this);
    radioButton3.addActionListener(this);

        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(label);
    this.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(radioButton1.isSelected())
{
   label.setText(radioButton1.getText());
}
if (radioButton2.isSelected())
{
    label.setText(radioButton2.getText());
}
if (radioButton3.isSelected())
{
    label.setText(radioButton3.getText());
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
//---------------------------------------------------------------------------------------------------------
//     8.Listbox  , Combobox
/*
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ListSelectionListener, ActionListener
{
JList listbox;
JComboBox combobox;

     MyFrame()
     {
     String[] languages={"java","python","c++","c#"};
    listbox=new JList<>(languages);
    listbox.setVisibleRowCount(3);
    listbox.addListSelectionListener(this);

    combobox=new JComboBox<>(languages);
    combobox.addActionListener(this);

    this.add(listbox);
    this.add(new JScrollPane(listbox));
    this.add(combobox);
    this.setLayout(new FlowLayout());
      }

    @Override
    public void valueChanged(ListSelectionEvent e) {
    if (e.getSource()==listbox)
    {
        System.out.println(listbox.getSelectedValuesList());
    }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==combobox)
        {
            System.out.println(combobox.getSelectedItem() );
        }
    }
}

public class Main
{
    public static void main(String [] args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("application");
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
 */
//-----------------------------------------------------------------------------------------------
//    9.layouts (Boaderlayout,FlowLayout)
/*
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame
{
    JButton b1,b2,b3,b4,b5;
    MyFrame()
    {
        b1 =new JButton("Button 1");
        b2 =new JButton("Button 2");
        b3 =new JButton("Button 3");
        b4 =new JButton("Button 4");
        b5 =new JButton("Button 5");

        //this.setLayout(new BorderLayout());
        //this.add(b1,BorderLayout.NORTH);
        //this.add(b2,BorderLayout.EAST);
        //this.add(b3,BorderLayout.WEST);
        //this.add(b4,BorderLayout.SOUTH);


import javax.swing.*;
import java.awt.*;

FlowLayout f=new FlowLayout();
        f.setAlignment(FlowLayout.CENTER);
        f.setHgap(30);
        f.setVgap(30);
        this.setLayout(f);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }
}
public class Main
{
    public static void main(String []args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/
//---------------------------------------------------------------------------------------------------
//      10.Panels

