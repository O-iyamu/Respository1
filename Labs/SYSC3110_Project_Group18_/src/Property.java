/**
 *
 * author: Iyamu Osaretinmwen
 * version: 1.0
 */
public class Property {
    private String name;
    private double price;
    private double rent;
    private Player owner;

    public Property(String name, double price, double rent){
        this.name = name;
        this.price = price;
        this.rent = rent;
    }
    public void setOwner(Player player){
        this.owner = player;
    }

    public String getName(){ return this.name; }
    public double getRent(){ return this.rent; }
    public double getPrice(){ return this.price; }
    public Player getOwner(){ return this.owner; }
}
