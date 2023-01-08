package Introduction;

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
}
