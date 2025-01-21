package Implementation;

import java.util.Scanner;

/**
 * Class for the admin view
 */
public class MachineAdminView {
    /**
     * Method for starting the admin view
     * @param machine
     */
    public void start(Machine machine){
        // Admin menu, will be executed until the user exits
        do {
            int option = 0;
            int row = 0;
            int column = 0;
            System.out.print("\n\n\n\n-----Welcome-----\n");
            System.out.println("Here is the content of the machine: ");
            System.out.println(machine.showMachine());
            System.out.println(machine.showBalance());
            System.out.println("Select an option:");
            System.out.println("1. Insert Item");
            System.out.println("2. Retire an Item");
            System.out.println("3. Add stock to an Item");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Please, enter the name for the new item: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Please, enter the price for the new item: ");
                    double price = sc.nextDouble();
                    System.out.println("Please, enter the stock you want to include: ");
                    int stock = sc.nextInt();
                    do {
                        System.out.println("Please, enter the row for the new item (between 0 and 2)");
                        row = sc.nextInt();
                        if(row<0 || row>2)
                            System.out.println("Please, make sure the row is between 0 and 2.");
                    }while(row < 0 || row > 2);
                    do {
                        System.out.println("Please, enter the column for the new item (between 0 and 2)");
                        column = sc.nextInt();
                        if(column<0 || column>2)
                            System.out.println("Please, make sure the column is between 0 and 2.");
                    }while(column < 0 || column > 2);
                    if(machine.addNewItem(new Item(name, price, stock), row, column)){
                        System.out.println("Item added");
                    }
                    else {
                        System.out.println("There is already an item in that position.");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Please, enter the row of the item you want to retire (between 0 and 2)");
                        row = sc.nextInt();
                        if(row<0 || row>2)
                            System.out.println("Please, make sure the row is between 0 and 2.");
                    }while(row < 0 || row > 2);
                    do {
                        System.out.println("Please, enter the column of the item you want to retire (between 0 and 2)");
                        column = sc.nextInt();
                        if(column<0 || column>2)
                            System.out.println("Please, make sure the column is between 0 and 2.");
                    }while(column < 0 || column > 2);
                    machine.retireItem(row, column);
                    System.out.println("Item retired.");
                    break;
                case 3:
                    do {
                        System.out.println("Select the row of the item you want to add stock to: (between 0 and 2).");
                        row = sc.nextInt();
                        if(row<0 || row>2)
                            System.out.println("Please, make sure the row is between 0 and 2.");
                    }while(row < 0 || row > 2);
                    do {
                        System.out.println("Select the column of the item you want to add stock to: (between 0 and 2).");
                        column = sc.nextInt();
                        if(column<0 || column>2)
                            System.out.println("Please, make sure the column is between 0 and 2.");
                    }while(column < 0 || column > 2);
                    System.out.println("Please, select the stock you want to add: ");
                    int newStock = sc.nextInt();
                    machine.getItems()[row][column].addStock(newStock);
                    System.out.println("Item retired.");
                    break;
                case 4:
                    System.out.println("Bye!!!");
                    return;
                default:
                    System.out.println("Wrong option. Try again.");
            }
        }while(true);
    }
}
