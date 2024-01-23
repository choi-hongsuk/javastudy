package pkg03_input;

import javax.swing.JOptionPane;

public class Class02_JOptionPane {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String strAge = JOptionPane.showInputDialog("나이를 입력하세요");
		String strheight = JOptionPane.showInputDialog("키를 입력하세요");
		String strGender = JOptionPane.showInputDialog("성별을 입력하세요");
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strheight);
		char gender = strGender.charAt(0);
		
		JOptionPane.showMessageDialog(null, name + ", " + age + ", " + height + ", " + gender);
	}

}
