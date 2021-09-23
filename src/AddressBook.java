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

    public void test () {
        System.out.println("test");
    }

    public static void main(String[] args) {
        BuddyInfo buddy= new BuddyInfo("Christina", "Ottawa", "123456779");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
