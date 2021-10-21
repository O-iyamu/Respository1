import java.util.ArrayList;

public class Player {
    private String name;
    private double balance;
    private ArrayList<Property> propertiesOwned;
    private int currentPosition;

    public Player(String name) {
        this.name = name;
        balance = 1500;
        propertiesOwned = new ArrayList<Property>();
        currentPosition = 0;
    }

    public void rollDie(Dice d) {
        d.roll(6);
    }

    public double getBalance() {
        return balance;
    }

    private void addBalance(double amount) {
        balance += amount;
    }

    private void subtractBalance(double amount) {
        balance -= amount;
    }

    public void buyProperty(Property p) {
        this.subtractBalance(p.getPrice());
    }

    public void payRent(Property p) {
        this.subtractBalance(p.getRent());
    }

    public void collectRent(double rent) {
        this.addBalance(rent);
    }
}
