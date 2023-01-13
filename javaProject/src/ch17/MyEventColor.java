package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame implements ActionListener {
	private JButton[] button = {new JButton("Red"), new JButton("Green"), new JButton("Blue"), new JButton("Yellow")};
	private String[] str = {"North", "East", "South", "West"};
	private Color[] color = {Color.red, Color.green, Color.blue, Color.yellow};
	private Color c;
	private Container con;
	private JFrame f;

	public MyEventColor(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}

	public MyEventColor() {
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0; i<button.length; i++) {
			add(button[i], str[i]);
		}

		for(int i=0; i<button.length; i++) {
			button[i].addActionListener(new MyEventColor(this, color[i]));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}

	public static void main(String[] args) {
		new MyEventColor();
	}
}
