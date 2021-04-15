package validatorproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

// This is the driver class
public class MySohuApp {
	static RegexValidator rv = new RegexValidator();
	static MySohu mso = new MySohu();
	public static void main(String[] args) {
		showOptions();
		
		
	}
//	This is the function for adding records to our list  
	public static void addRecords() {
		
		String yn = "y";
		while (yn.equalsIgnoreCase("y")){
			String name = mso.addName();
			String email = mso.addEmail();
			String phone = mso.addPhone();
			yn = mso.continueAdding();
			FriendInfo friendInfo = new FriendInfo();
			friendInfo.setName(name);
			friendInfo.setEmailAddress(email);
			friendInfo.setPhoneNumber(phone);
			mso.friendList.add(friendInfo);
		}
		JFrame f = new JFrame(); 
		JOptionPane.showMessageDialog(f, mso.friendList);
		showOptions();
	}
//	This is the function for deleting a record based on the name from our list 
	public static void delete() {
		JFrame f = new JFrame(); 
		String name = JOptionPane.showInputDialog(f, "Enter Name to Delete");
		Predicate<FriendInfo> condition = friendInfo -> friendInfo.getName().equalsIgnoreCase(name);
		mso.friendList.removeIf(condition);
		JOptionPane.showMessageDialog(f, "Deleted successfully");
		showOptions();
		
	}
//	This is the function for printing records to our list 
	public static void print() {
		JFrame f = new JFrame();
		JOptionPane.showMessageDialog(f, mso.friendList);
		showOptions();
	}
//	This is the function for search records based on the name 
	public static void search() {
		JFrame f = new JFrame(); 
		String name = JOptionPane.showInputDialog(f, "Enter Name to Search");
		List<FriendInfo> search = mso.friendList.stream().filter(friendInfo -> friendInfo.getName().equals(name)).collect(Collectors.toList());
		JOptionPane.showMessageDialog(f, search);
		showOptions();
	}
//	This is the function for sorting our list 
	public static void sort() {
		
		Collections.sort(mso.friendList); 
		JFrame f = new JFrame(); 
		JOptionPane.showMessageDialog(f, mso.friendList);
		showOptions();
	}
//	This is the function for showing the menu with various options
	public static void showOptions() {
		List<String> optionList = new ArrayList<String>();
		optionList.add("Add");
		optionList.add("Delete");
		optionList.add("Search");
		optionList.add("Sort");
		optionList.add("Print");
		Object[] options = optionList.toArray();
		int value = JOptionPane.showOptionDialog(
		                null,
		                "Please select an option",
		                "Pick",
		                JOptionPane.YES_NO_OPTION,
		                JOptionPane.QUESTION_MESSAGE,
		                null,
		                options,
		                optionList.get(0));

		String opt = optionList.get(value);
		if (opt.equalsIgnoreCase("Add")) {
			addRecords();
		} else if (opt.equalsIgnoreCase("Delete")) {
			delete();
		} else if (opt.equalsIgnoreCase("Search")) {
			search();
		} else if (opt.equalsIgnoreCase("Sort")) {
			sort();
		} else if (opt.equalsIgnoreCase("Print")) {
			print();
		}
	}

}
