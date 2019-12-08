package Xin;
import java.awt.*;
import java.awt.Label;

import javax.swing.*;

class Windows 
{

	public static void main(String[] args) {
		JFrame win = new JFrame("学生选课系统");
		win.setSize(400,500);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		win.add(p1);
		Label l1 = new Label("学生选课信息");
		p1.add(l1);
		JTextField text = new JTextField(15);
	
			JCheckBox box1 = new JCheckBox("大学英语");

			p1.add(box1);
	        JCheckBox box2 = new JCheckBox("高等数学");
	   
	        p1.add(box2);
	        JCheckBox box3 = new JCheckBox("线性代数");

	        p1.add(box3);
	        JCheckBox box4 = new JCheckBox("马克思哲学");

	        p1.add(box4);
	
	      
	
		
		
		Label l2 = new Label("添加课程");
		p1.add(l2);
		Label l3 = new Label("课程名称");
		p1.add(l3);
		JTextField text1 = new JTextField(20);
		p1.add(text1);
		
		
		
	}
}
