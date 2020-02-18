package example;

import javax.swing.JOptionPane;

public class JopDemo {

	public static void main(String[] args) {
		String name, ageStr;
		int age;
		JOptionPane.showMessageDialog(null, "Hello");
		name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "hi "+name);
		ageStr=JOptionPane.showInputDialog("Enter your age");
		age=Integer.parseInt(ageStr);
		age+=10;
		JOptionPane.showMessageDialog(null, "your age is "+age);
		
	}

}
