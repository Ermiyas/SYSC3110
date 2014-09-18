
public class AddressBook {
	private BuddyInfo buddyInfo;
	public AddressBook() {
		this.buddyInfo = new BuddyInfo("","","");
	}

	public void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo!=null){
				BuddyInfo.add(aBuddyInfo))
		}
	}

	public void removeBuddy(int index) {
		if(index>=0 && index<buddyInfo.size()){
			buddyInfo.remove(index);
		}
		
	}
	public static void main(String[] args) {
	}
	
}



