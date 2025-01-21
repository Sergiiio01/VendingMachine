package Model;

public class Machine {
    private Item[][] items;
    private double balance;
    private final int ROWS = 3;
    private final int COLUMNS = 3;


    public Machine() {
        this.balance=0;
        this.items = new Item[this.ROWS][this.COLUMNS];
    }

    public Item[][] getItems() {
        return items;
    }

    public boolean addNewItem(Item item, int row, int column){
        if(row<this.ROWS && column<this.COLUMNS) {
            if(this.items[row][column] == null) {
                this.items[row][column] = item;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
        System.out.println("Balance added");
    }

    public void retireBalance(){
        this.balance=0;
        System.out.println("Balance retired");
    }

    public String showMachine(){
        StringBuilder machine= new StringBuilder();
        for(int i=0; i< this.ROWS; i++){

           machine.append("(");
            for(int j=0; j<this.COLUMNS; j++){
               machine.append("[ ");
                if(this.items[i][j] != null) {
                    machine.append(this.items[i][j].getName() + " ( " + this.items[i][j].getStock() + " )");

                }
                else{
                    machine.append("x");
                }
                machine.append(" ] ");
            }
            machine.append(")\n");
        }
        return machine.toString();
    }

    public boolean buyItem(int row, int column){
        if(this.items[row][column] != null) {
            if(this.balance >= this.items[row][column].getPrice()){
                this.items[row][column].reduceStock(1);
                this.balance -= this.items[row][column].getPrice();
                if(this.items[row][column].getStock() == 0){
                    this.items[row][column] = null;
                }

                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public void retireItem(int row, int column){
        this.items[row][column]=null;
    }

    public String showBalance(){
        return "The balance is: " + this.balance;
    }

}