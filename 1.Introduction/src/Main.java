import static Introduction.Compulsory.*;
import static Introduction.Optional.*;

public class Main {
    public static void main(String[] args) {
        getCompulsory();
        printingWords(new String[]{"1", "2", "A", "10"});
        displayArray(generateWords(new String[]{"10", "7", "A", "B", "c", "d"}));
    }
}