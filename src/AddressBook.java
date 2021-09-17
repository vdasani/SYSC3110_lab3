import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> collection = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo newBuddy){
        collection.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        if(collection.contains(buddy)==true){
            collection.remove(buddy);
        }
        else {
            System.out.println("This buddy is not in the list");
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
