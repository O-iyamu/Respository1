import java.util.ArrayList;

public class AddressBook {
    BuddyInfo homer = new BuddyInfo("Homer", "101 Street", "+1 (227)2342357");
    BuddyInfo marge = new BuddyInfo("Marge", "101 Street", "+1 (287)2942055");
    BuddyInfo bart = new BuddyInfo("Bart", "101 Street", "+1 (227)2348756");
    BuddyInfo lisa = new BuddyInfo("Lisa", "101 Street", "+1 (287)2354359");
    BuddyInfo maggie = new BuddyInfo("Maggie", "101 Street", "+1 (229)2442361");

    private ArrayList<BuddyInfo> Buddies = new ArrayList<BuddyInfo>();

    private void addBuddy(String name, String address, String phoneNumber){
        BuddyInfo newBuddy = new BuddyInfo(name, address, phoneNumber);
        Buddies.add(newBuddy);
    }

    private void removeBuddy(String name, String address, String phoneNumber){
        BuddyInfo newBuddy = new BuddyInfo(name, address, phoneNumber);
        for(BuddyInfo buddy : Buddies){
            if (buddy.equals(newBuddy)){
                Buddies.remove(buddy);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
