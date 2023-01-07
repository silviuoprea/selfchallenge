package Introduction;

/**
 * I.Compulsory :
 * Basic java application that handles numerical operations
 * and the use of strings for printing purposes
 *
 * @author Silviu Oprea
 * @version 1.0
 * @since 2023-01-07
 */
public class Compulsory {
    // 1.a
    public static void sayingHello() {
        System.out.println("Hello World!");
    }

    // 1.b
    public static String[] getStrings() {
        return new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
    }

    // 1.c
    public static int getRandomInteger() {
        return (int) (Math.random() * 1_000_000);
    }

    // 1.d
    public static int computeRandomInteger(int n) {
        n *= 3;
        n += 0b10101;
        n += 0xFF;
        n *= 6;
        return n;
    }

    // 1.e
    public static int computeSingleDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int computeN(int n) {
        int result = n;
        while (result / 10 != 0) {
            result = computeSingleDigit(result);
        }
        return result;
    }

    // 1.f
    public static void displayMessage() {
        System.out.println("Willy-nilly, from now on, I will practice " + getStrings()[computeN(computeSingleDigit(computeRandomInteger(getRandomInteger())))]);
    }

    public static void getCompulsory() {
        sayingHello();
        displayMessage();
    }
}
