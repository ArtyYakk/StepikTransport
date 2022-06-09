package trans.social;

import trans.Transport;

public interface Social extends Transport {
    default void pay(){
        System.out.println("thanks for paying the travel");
    };
}
