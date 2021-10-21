public class Dice {
    private int faces;
    private int rolledVal;

    public Dice(int faces){
        this.faces = faces;
    }

    public int getValue(){
        return faces;
    }

    public int roll(int faces){
        rolledVal = (int)Math.floor(Math.random()*(faces)+1);
        return rolledVal;
    }
}
