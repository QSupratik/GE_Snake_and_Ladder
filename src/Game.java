public class Game {
    public static boolean playGame(Player p1){
        int turn = Dice.diceThrow();
        int option = Dice.option();
        if(option==2){
            //Ladder Case
            if(p1.position+turn<=100) p1.position+=turn;
        }
        else if(option==3){
            //Snake Case
            if(p1.position-turn<0) p1.position=0;
            else p1.position-=turn;
        }
        System.out.println("The current position is " + p1.position);
        if(option==2) return true;
        else return false;
    }
}
