package validatorproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MySohu {
	List<FriendInfo> friendList = new LinkedList<>();
	RegexValidator rvalidator = new RegexValidator();
	
	JFrame f = new JFrame();  
	
	// Method for reading user data through gui and validate then returns the validated name
	public String addName() {
		String name = JOptionPane.showInputDialog(f, "Enter Name");
		String validatedName = rvalidator.validateName(name);
		while (validatedName==null) {
			name = JOptionPane.showInputDialog(f, "Enter Name");
			validatedName = rvalidator.validateName(name);
		}
		JOptionPane.showMessageDialog(f, validatedName);
		return validatedName;
	}
	// Method for reading user data through gui and validate then returns the validated Email
	public String addEmail() {
		String email = JOptionPane.showInputDialog(f, "Enter Email");
		String validatedEmail = rvalidator.validateEmail(email);
		while (validatedEmail==null) {
			email = JOptionPane.showInputDialog(f, "Enter Email");
			validatedEmail = rvalidator.validateEmail(email);
		}
		JOptionPane.showMessageDialog(f, validatedEmail);
		return validatedEmail;
		
	}
	// Method for reading user data through gui and validate then returns the validated Phone number
	public String addPhone() {
		String phone = JOptionPane.showInputDialog(f, "Enter Phone");
		String validatedPhone = rvalidator.validateTelephoneNumber(phone);
		while (validatedPhone==null) {
			phone = JOptionPane.showInputDialog(f, "Enter Phone");
			validatedPhone = rvalidator.validateTelephoneNumber(phone);
		}
		JOptionPane.showMessageDialog(f, validatedPhone);
		return validatedPhone;
	}
	// Method for reading user data through gui and validate then returns the validated Y/N
	public String continueAdding() {
		String yn = JOptionPane.showInputDialog(f, "Enter Y/N");
		String validatedYn = rvalidator.validateYn(yn);
		while (validatedYn==null) {
			yn = JOptionPane.showInputDialog(f, "Enter Y/N");
			validatedYn = rvalidator.validateYn(yn);
		}
		JOptionPane.showMessageDialog(f, validatedYn);
		return validatedYn;
	}
	
		
}
