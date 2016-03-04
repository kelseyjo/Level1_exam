import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
public class ColorTeacher implements ActionListener {
	private JPanel panel;
	private JFrame frame;
	private JButton yellow;
	private JButton red;
	private JButton blue;
	private JButton green;

	

	public ColorTeacher()
	{
		panel = new JPanel();
		panel.setSize(300, 300);
		frame = new JFrame();
		frame.setTitle("Color Teacher");
		yellow = new JButton();
		yellow.setSize(50, 20);
		red = new JButton();
		red.setSize(50, 20);
		blue = new JButton();
		blue.setSize(50, 20);
		green = new JButton();
		green.setSize(50, 20);
		
	}
	public void run()
	{
		frame.setSize(300, 50);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		yellow.addActionListener(this);
		blue.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
	}
	
	void speak(String words)
	{
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main (String[] args)
	{
		ColorTeacher teach = new ColorTeacher();
		teach.run();
		
		


       
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if((JButton)arg0.getSource() == yellow)
	    	 speak("yellow");
	     if((JButton)arg0.getSource() == red)
	    	 speak("red");
	     if((JButton)arg0.getSource() == blue)
	    	 speak("blue");
	     if((JButton)arg0.getSource() == green)
	    	 speak("green");
	}
	
	
}
