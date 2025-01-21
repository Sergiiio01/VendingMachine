import Implementation.Item;
import Implementation.Machine;
import Implementation.MachineView;
import Implementation.MachineAdminView;

import java.util.Scanner;

/**
 * Main class of the project
 */
public class Main {
    /**
     * Main method of the project
     * @param args
     */
    public static void main(String[] args) {
        Machine vending = new Machine();
        Scanner sc = new Scanner(System.in);
        int type = 0;
        System.out.println("Please, select option: ");
        System.out.println("1. if you are an admin.");
        System.out.println("2. if you are a client. ");

        type = sc.nextInt();
        if(type == 1){
            MachineAdminView view = new MachineAdminView();
            view.start(vending);
        }
        else if(type == 2){
            Item item = new Item("Drink", 2, 5);
            Item item2 = new Item("Chips", 1.50, 8);
            vending.addNewItem(item, 2, 2);
            vending.addNewItem(item2, 1, 1);
            MachineView view = new MachineView();
            view.start(vending);
        }




    }
}