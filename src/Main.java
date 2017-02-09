import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArtToolItem> tools = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            processInv();
        }
    }

    public static void processInv() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add item to stock.");
        System.out.println("2. Remove item from stock.");
        System.out.println("3. Change quantity of the item in stock.");

        String choice = scanner.nextLine();
            if (choice.equals("1")) {
                // take item from user and find the matching category

                System.out.println("Add item by name.");
                String itemName = scanner.nextLine();

                // ask user what category to put this in
                tools.add(InventoryHandler.categoryChoice(itemName, 0));

            } else if (choice.equals("2")) {
                System.out.println("Remove item by item index number.");
                int i = tools.size();
                for (ArtToolItem stock : tools) {
                    System.out.println("[" + i + "] " + stock.name + " " + stock.category + " " + stock.quantity);
                }
                tools.remove(Integer.parseInt(scanner.nextLine()));
            } else if (choice.equals("3")) {
                //Show items in the inventory including name, quantity, and category.

                Integer i = 1; //loops thru the list
                for (ArtToolItem stock : tools) {
                    System.out.println("[" + i + "] " + stock.name + " " + stock.category + " " + stock.quantity);
                    i++;
                }
                //prompt to select the index number of the item to be changed
                System.out.println("Choose an index number to change quantity of item.");

                //receives user choice - holds that index number
                Integer itemIndexNum = Integer.parseInt(scanner.nextLine());

                //points at the address where the item is found in the index
                //like pointing at a specific mailbox
                ArtToolItem indexPointer = tools.get(itemIndexNum - 1);

                System.out.println("Input quantity of item to be changed.");

                Integer quantityAdj = Integer.parseInt(scanner.nextLine());
                indexPointer.quantity = quantityAdj;


            }


    }
}