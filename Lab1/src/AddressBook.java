import java.util.*;
public class AddressBook {
	//private BuddyInfo buddyInfo;
	private Set<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		//this.buddyInfo = new BuddyInfo("","","");
		this.buddyInfo = new HashSet<BuddyInfo>();
	}
	public void addBuddy(String name, String address, String phoneNumber) {
		addBuddy(new BuddyInfo(name, address, phoneNumber));
	}
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo!=null){
			buddyInfo.add(aBuddyInfo);
		}
		//ermiyas
	}

	public void removeBuddy(int index) {
		if(index>=0 && index<buddyInfo.size()){
			buddyInfo.remove(index);
			
		}
		
	}
	public static void main(String[] args) {
		BuddyInfo buddy= new BuddyInfo("Tom","Carleton","613");
		AddressBook addressBook=new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
	
}



