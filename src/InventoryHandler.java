import java.util.Scanner;
public class InventoryHandler{

     public static ArtToolItem categoryChoice(String name, Integer quantity){
        System.out.println("Choose a category for the item\n" + "[1] Brush\n" + "[2] Paint\n" + "[3] Pencil\n" + "[4] Canvas\n" + "[5] Paper\n");
        Scanner scanner = new Scanner(System.in);
        int itemCat = Integer.parseInt(scanner.nextLine());

        ArtToolItem item = new ArtToolItem();//object created to hold the return value of this method.

        switch (itemCat){
            case 1: ArtToolItem brush = new Brush(name, quantity);
                item = brush;
                break;
            case 2: ArtToolItem paint = new Paint(name, quantity);
                item = paint;
                break;
            case 3: ArtToolItem pencil = new Pencil(name, quantity);
                item = pencil;
                break;
            case 4: ArtToolItem canvas = new Canvas(name, quantity);
                item = canvas;
                break;
            case 5: ArtToolItem paper = new Paper(name, quantity);
                item = paper;
                break;
        }
        return item;
    }

}

