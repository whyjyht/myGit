package ch17;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		super("과제");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2));
		add(new JLabel("id"));
		add(new JTextField(20));
		add(new JLabel("비밀번호"));
		add(new JPasswordField(20));
		add(new JLabel("이메일"));
		add(new JTextField(20));
		add(new JLabel("hp"));
		add(new JTextField(20));
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
