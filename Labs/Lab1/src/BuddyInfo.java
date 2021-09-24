public class BuddyInfo {

    private String name = "Ben";
    private String address ;
    private String phoneNumber;

    public BuddyInfo() {
        this("Ben", "252 Emerald St", "+1 (234)7657759");
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getAddy() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "101 Street", "+1 (227)2342357");
        System.out.println("Hello " + homer.getName());
        System.out.println("You live at " + homer.getAddy());
    }
}

