package trans.steam;

import trans.Transport;

public interface Steam extends Transport {
    default void beep(){
        System.out.println("Beep Beeep");
    }
}
