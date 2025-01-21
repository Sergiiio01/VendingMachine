package View;

import Model.Machine;

import java.util.Scanner;

public class MachineView{


    public void start(Machine machine){
        do {
            int option = 0;
            int row = 0;
            int column = 0;
            System.out.print("\n\n\n\n-----Welcome-----\n");
            System.out.println("Here is the content of the machine: ");
            System.out.println(machine.showMachine());
            System.out.println(machine.showBalance());
            System.out.println("Select an option:");
            System.out.println("1. Insert balance");
            System.out.println("2. Buy an Item");
            System.out.println("3. Retire balance");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Insert the amount you want to add: ");
                    int amount = sc.nextInt();
                    machine.addBalance(amount);
                    break;
                case 2:
                    do{
                        System.out.println("Select the row of the item you want to buy: (between 0 and 2).");
                        row = sc.nextInt();
                        if(row < 0 || row > 2){
                            System.out.println("Please, make sure the row is between 0 and 2.");
                        }
                    }while(row < 0 || row > 2);
                    do{
                        System.out.println("Select the column of the item you want to buy: (between 0 and 2).");
                        column = sc.nextInt();
                        if(column < 0 || column > 2){
                            System.out.println("Please, make sure the column is between 0 and 2.");
                        }
                    }while(column < 0 || column > 2);
                    if(machine.buyItem(row ,column)){
                        System.out.println("Item bought.");
                    }
                    else{
                        System.out.println("Something went wrong, check your balance.");
                    }
                    break;

                case 3:
                    machine.retireBalance();
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

