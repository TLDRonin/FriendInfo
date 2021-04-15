package validatorproject;

public class FriendInfo implements Comparable<FriendInfo>{
	// The friend information variables
	private String name;
	private String emailAddress;
	private String phoneNumber;
	
//	The empty constructor for class FriendInfo
	public FriendInfo() {
		super();
	}
//	The constructor with variables for class FriendInfo
	public FriendInfo(String name, String emailAddress, String phoneNumber) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
//	The setters and getters for the variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
//	To string method
	@Override
	public String toString() {
		return "FriendInfo [name=" + name + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + "]";
	}
//	The method that handles sorting through compareto method
	@Override
	public int compareTo(FriendInfo o) {
		
		return this.getName().compareTo( o.getName() );
	}
	
	
	
	

}
