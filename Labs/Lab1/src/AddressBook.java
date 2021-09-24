import java.util.ArrayList;

public class AddressBook {
    BuddyInfo homer = new BuddyInfo("Homer", "101 Street", "+1 (227)2342357");
    BuddyInfo marge = new BuddyInfo("Marge", "101 Street", "+1 (287)2942055");
    BuddyInfo bart = new BuddyInfo("Bart", "101 Street", "+1 (227)2348756");
    BuddyInfo lisa = new BuddyInfo("Lisa", "101 Street", "+1 (287)2354359");

    private ArrayList<BuddyInfo> Buddies = new ArrayList<BuddyInfo>();

    private void addBuddy(BuddyInfo newBuddy){
        Buddies.add(newBuddy);
    }

    private void removeBuddy(BuddyInfo buddyToRemove){
        for(BuddyInfo buddy : Buddies){
            if (buddy.equals(buddyToRemove)){
                Buddies.remove(buddy);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo Buddy = new BuddyInfo("Buddy", "101 Street", "+1 (229)2442361");
        AddressBook addy = new AddressBook();
        addy.addBuddy(Buddy);
        addy.removeBuddy(Buddy);
    }


}
