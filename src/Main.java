import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayLists arrayMetod = new ArrayLists();
        ArrayList<Object> shoppingList = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Available actions!");
            System.out.println("0. To shutdown!");
            System.out.println("1. To add item(s) to list  (comma delimited list)");
            System.out.println("2. To remove any items (comma delimited list)");
            System.out.println("Enter the number for which action you want to take");
//-------------------------------------------------------------------------------------
            switch (sc.nextInt()) {
                case 0:
                    return;
                case 1:
                    System.out.println("Type in the shopping item you would like to add");
                    Object add = sc.next();
                    arrayMetod.addToArray(add);
                    shoppingList.add(add);
                    shoppingList.sort(null);
                    System.out.println(shoppingList.toString());
                    break;
                case 2:
                    System.out.println("Type in the shopping item you would like to remove");
                    Object remove = sc.next();
                    arrayMetod.removeFromArray(remove);
                    shoppingList.remove(remove);
                    shoppingList.sort(null);
                    System.out.println(shoppingList.toString());
                    break;
            }
        }
    }
}