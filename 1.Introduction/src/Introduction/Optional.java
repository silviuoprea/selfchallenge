package Introduction;

import java.util.ArrayList;
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
                if(!Character.isLetter(args[i].charAt(0)) ||  args[i].length() != 1 )
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

    public static boolean checkIfNeighbours(String left, String right)
    {
        int sizeLeft = left.length(), sizeRight = right.length(), max, size = 26;
        int[] frequencyArrayLeft = new int[size], frequencyArrayRight = new int[size];
        String newLeft = left.toLowerCase();
        String newRight = right.toLowerCase();
        max = Math.max(sizeLeft, sizeRight);
        for(int i = 0; i < max; i++)
        {
            if (i < sizeLeft)
                frequencyArrayLeft[newLeft.charAt(i) - 97]++;
            if (i < sizeRight)
                frequencyArrayRight[newRight.charAt(i) - 97]++;
        }
        for(int i = 0; i < size; i++)
        {
            if (frequencyArrayLeft[i] != 0 && frequencyArrayRight[i] != 0)
                return true;
        }
        return false;
    }

    public static Neighbours[] getNeighbours(String[] input)
    {
        int size = input.length;
        Neighbours[] neighbours = new Neighbours[size];
        Neighbours current;
        for(int i = 0; i < size; i++)
        {
            current = new Neighbours(input[i], new ArrayList<>());
            for(int j = 0; j < size; j++)
                if(i != j && checkIfNeighbours(input[i], input[j]))
                {
                    current.setListOfNeighbours(input[j]);
                }
            neighbours[i] = current;
        }
        return neighbours;
    }

    public static boolean[][] makeAdjacencyMatrix(String[] input)
    {
        int size = input.length;
        boolean[][] adjacencyMatrix = new boolean[size][size];
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
            {
                if(checkIfNeighbours(input[i], input[j]))
                    adjacencyMatrix[i][j] = true;
            }
        return adjacencyMatrix;
    }
    public  static void displayArray(String[] input)
    {
        System.out.println(Arrays.toString(input));
    }
}
