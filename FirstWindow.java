package Lesson11ClassProgramms;

import java.awt.*;
import javax.swing.*;

public class FirstWindow
{
	public static void main(String[] args)
	{
		// This is not the best practice to create windows
		JFrame myWindow = new JFrame("First Window");
		myWindow.setSize(900,900);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}
}
