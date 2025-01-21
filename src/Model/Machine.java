package Model;

/**
 * Class for the vending machine
 */
public class Machine {
    private Item[][] items;
    private double balance;
    private final int ROWS = 3;
    private final int COLUMNS = 3;

    /**
     * Constructor for a machine object
     */
    public Machine() {
        this.balance=0;
        this.items = new Item[this.ROWS][this.COLUMNS];
    }

    /**
     * Get all the items of the vending machine
     * @return the items of the machine
     */
    public Item[][] getItems() {
        return items;
    }

    /**
     * Method for adding an item to the machine
     * @param item
     * @param row
     * @param column
     * @return true or false depending on if the item has been added
     */
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

    /**
     * Getter for the balance of the machine
     * @return the balance of the machine
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method for adding balance to a machine
     * @param balance
     */
    public void addBalance(double balance) {
        this.balance += balance;
        System.out.println("Balance added");
    }

    /**
     * Method to retire balance from the machine
     */
    public void retireBalance(){
        this.balance=0;
        System.out.println("Balance retired");
    }

    /**
     * Method for showing the content of the machine
     * @return
     */
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

    /**
     * method for buying an item from the machine
     * @param row
     * @param column
     * @return true or false depending on if the item has been bought or not
     */
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

    /**
     * Method for retiring an item from the machine
     * @param row
     * @param column
     */
    public void retireItem(int row, int column){
        this.items[row][column]=null;
    }

    /**
     * Method for showing the current balance of the machine
     * @return
     */
    public String showBalance(){
        return "The balance is: " + this.balance;
    }

}