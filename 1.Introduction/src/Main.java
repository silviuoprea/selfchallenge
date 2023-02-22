import Introduction.Neighbours;

import java.util.Arrays;

import static Introduction.Compulsory.*;
import static Introduction.Optional.*;

public class Main {
    public static void main(String[] args) {
        long begin = System.nanoTime();
        getCompulsory();
        printingWords(new String[]{"1", "2", "A", "b"});
        String[] generated = generateWords(new String[]{"10", "10", "A", "B", "c", "d", "e", "f", "G", "h", "i", "j", "k", "l", "m", "n"});
        displayArray(generated);

        System.out.println(checkIfNeighbours("Input", "aool"));
        long end = System.nanoTime();
        if(generated.length < 30_000)
            for(int i = 0; i < generated.length; i++)
            {
                getNeighbours(generated)[i].printDataStructure();
            }
        else System.out.println(end-begin);
    }
}