public class Main {
    public static void main(String[] args) {
        //When a single player is playing
        System.out.println("When a single player is playing\n");
        Player p1 = new Player();
        int diceThrow=0;
        while(p1.position!=100){
            diceThrow++;
            Game.playGame(p1);
        }
        System.out.println("The total number of dice throws taken are " + diceThrow);

        //When two players are playing
        System.out.println("When two players are playing\n");
        Player p2 = new Player();
        Player p3 = new Player();
        boolean p2Turn=true, p3Turn=false;
        while(p2.position!=100 && p3.position!=100){
            if (p2Turn == true) {
                p2Turn = Game.playGame(p2);
                if(p2Turn==true) p3Turn=false;
                else p3Turn=true;
            }
            else if(p3Turn==true){
                p3Turn = Game.playGame(p3);
                if(p3Turn==true) p2Turn=false;
                else p2Turn=true;
            }
        }
        if(p2.position==100)
            System.out.println("Player 2 wins\n");
        else
            System.out.println("Player 3 wins\n");
    }
}