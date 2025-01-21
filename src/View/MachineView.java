package View;

import Model.Machine;

import java.util.Scanner;

public class MachineView{


    public void start(Machine machine){
        do {
            int option = 0;
            System.out.println("-----Welcome-----");
            System.out.println("Here is the content of the machine: ");
            System.out.println(machine.showMachine());
            System.out.println(machine.showBalance());
            System.out.println("Seleccione una opcion:");
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
                    System.out.println("Select the row of the item you want to include: (between 0 and 2).");
                    int row = sc.nextInt();
                    System.out.println("Select the column of the item you want to include: (between 0 and 2).");
                    int column = sc.nextInt();
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
                default:
                    System.out.println("Wrong option. Try again.");
            }
        }while(true);

    }
}

