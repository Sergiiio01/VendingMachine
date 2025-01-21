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

    public void addNewItem(Item item, int row, int column){
        if(row<this.ROWS && column<this.COLUMNS) {
            this.items[row][column] = item;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public String showMachine(){
        StringBuilder machine= new StringBuilder();
        for(int i=0; i< this.ROWS; i++){

           machine.append("(");
            for(int j=0; j<this.COLUMNS; j++){
               machine.append("[ ");
                if(this.items[i][j] != null) {
                    machine.append(this.items[i][j].getName());
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

}