package Lesson11ClassProgramms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondWindow extends JFrame implements ActionListener
{
	JButton b1 = new JButton("Ok");
	JButton b2 = new JButton("Cancel");
	JTextField f1 = new JTextField();
	JLabel l1 = new JLabel("Name");
	JTextField f2 = new JTextField();
	JLabel l2 = new JLabel("Age");

	// Only for the panel example
	JPanel p = new JPanel();
	JButton pb1 = new JButton();
	
	public SecondWindow()
	{
		super("Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,180);
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(4,2));
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);

		// Example panel to combine layouts (only for demonstration)
		add(p);
		p.setLayout(new GridLayout(2,2));
		p.add(pb1);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			System.out.println("You entered " + f1.getText() + " " + f2.getText());
		}
		if (e.getSource() == b2)
		{
			System.out.println("Bye bye");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}