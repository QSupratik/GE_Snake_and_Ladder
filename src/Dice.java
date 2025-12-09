public class Dice {
    public static int diceThrow(){
        return (int)(Math.random()*6+1);
    }

    public static int option(){
        return (int)(Math.random()*3+1);
    }
}
