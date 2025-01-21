package Implementation;

/**
 * Class for the item object
 */
public class Item {
    private String name;
    private double price;
    private int stock;

    /**
     * Constructor for an item object
     * @param name
     * @param price
     * @param stock
     */
    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * getter for the item´s name
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the item`s name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for the item`s price
     * @return the price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for the price of the item
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for the item´s stock
     * @return the stock of the item
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter for the stock of the item
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Method to add stock to an item
     * @param stock
     */
    public void addStock(int stock){
        this.stock += stock;
    }

    /**
     * Method to reduce the stock of an item
     * @param stock
     */
    public void reduceStock(int stock){
        this.stock -= stock;
    }
}
