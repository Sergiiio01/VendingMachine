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
        this.items[row][column]=item;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}