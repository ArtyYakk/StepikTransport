package trans;

import trans.social.Bus;
import trans.social.Trolleybus;
import trans.steam.SteamBoat;
import trans.steam.SteamTrain;
import trans.war.Fjet;
import trans.war.Tank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Let's see how a social transport works\n");

        Bus school = new Bus();
        school.pay();
        school.move();
        Trolleybus three = new Trolleybus();
        three.pay();
        three.move();

        System.out.println("\nLet's add some steam to this project\n");

        SteamBoat moskva = new SteamBoat();
        moskva.move();
        moskva.beep();
        SteamTrain zvezda = new SteamTrain();
        zvezda.move();
        zvezda.beep();

        System.out.println("\nThe end of a peaceful life\n");

        Fjet eagle = new Fjet();
        eagle.battle();
        eagle.move();
        Tank ttt = new Tank();
        ttt.battle();
        ttt.move();
    }
}
