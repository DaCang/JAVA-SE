package com.songyl.test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		new Login();
	}

	private JFrame frame = new JFrame("登录");
	private Container c = frame.getContentPane();
	private JTextField username = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JButton ok = new JButton("确定");
	private JButton cancel = new JButton("取消");

	public Login() {
		frame.setSize(300, 200);
		c.setLayout(new BorderLayout());
		initFrame();
		frame.setVisible(true);
	}

	private void initFrame() {

		//顶部
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(new JLabel("系统管理员登录"));
		c.add(titlePanel, "North");

		//中部表单
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(null);
		JLabel jLabel_1 = new JLabel("用户名:");
		jLabel_1.setBounds(50, 20, 50, 20);
		JLabel jLabel_2 = new JLabel("密    码:");
		jLabel_2.setBounds(50, 60, 50, 20);
		fieldPanel.add(jLabel_1);
		fieldPanel.add(jLabel_2);
		username.setBounds(110, 20, 120, 20);
		password.setBounds(110, 60, 120, 20);
		fieldPanel.add(username);
		fieldPanel.add(password);
		c.add(fieldPanel, "Center");

		//底部按钮
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(ok);
		buttonPanel.add(cancel);
		c.add(buttonPanel, "South");
	}

}