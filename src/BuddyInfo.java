public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    public BuddyInfo() {
        this("Christina", "Ottawa", "1234567890");
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        buddy.name = "Vishesh.";
        System.out.println("Hello "+ buddy.getName());
    }
}
