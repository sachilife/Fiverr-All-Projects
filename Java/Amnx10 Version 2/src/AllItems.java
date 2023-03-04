import java.util.ArrayList;

public class AllItems {

    private static final ArrayList<Item> items = new ArrayList<>();

    public AllItems() {
    }


    public static void addItem(int item_number, String title, int available) {
        for (Item item : items) {
            if (item.getItem_number() == item_number) {
                System.out.println("Item already exists!");
                return;
            }
        }

        Item item = new Item(item_number, title, available);
        AllItems.items.add(item);
    }

    public static int requestItem(int item_number) {
        for (Item item : items) {
            if (item.getItem_number() == item_number) {
                return item.borrowItem();

            }
        }

        System.out.println("Item does not found!");
        return -1;
    }

    public static void displayItems() {
        System.out.println();
        for (Item item : items) {
            item.display();
        }
    }

    public static void searchByItemNumber(int item_number) {
        for (Item item : items) {
            if (item.getItem_number() == item_number) {
                item.display();
                return;
            }
        }

        System.out.println("Item does not found!");
    }

    public static void searchByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().compareToIgnoreCase(title) == 0) {
                item.display();
                return;
            }
        }
        System.out.println("Item does not found!");

    }

    public static void returnItem(int item_number){
        for (Item item:items) {
            if(item.getItem_number() == item_number){
                item.returnItem();
                break;
            }
        }
    }
}