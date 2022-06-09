package trans.war;

import trans.Transport;

public interface War extends Transport {
    default void battle(){
        System.out.println("prepear for the battle");
    }
}
