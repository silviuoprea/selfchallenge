package Introduction;

import java.util.Arrays;
/**
 * I.Optional :
 * Basic java application that handles numerical operations
 * and the use of strings for printing purposes
 *
 * @author Silviu Oprea
 * @version 1.0
 * @since 2023-01-08
 */
public class Optional {
    public static void printingWords(String[] args)
    {
        if (validateArguments(args))
        {
            System.out.println("Valid arguments");
        }
        else System.out.println("Invalid arguments");
    }
    public static boolean validateArguments(String[] args)
    {
        int i = 2, size = args.length;
        if (size < 3)
            return false;
        try {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
            while (i < size) {
                if(!(Character.isLetter(args[i].charAt(0)) && (args[i].length()>0)))
                    return false;
                i++;
            }
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    public static String[] generateWords(String[] args) {
        int n = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int k = 2;
        String[] words = new String[n];
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                if (k >= args.length)
                    k = 2;
                word.append(args[k]);
                if (Math.random() > 0.499)
                    k+=2;
                else k++;
            }
            words[i] = word.toString();
            word = new StringBuilder();
        }
        return words;
    }
    public  static void displayArray(String[] input)
    {
        System.out.println(Arrays.toString(input));
    }
}
