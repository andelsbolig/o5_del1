package test;
import spil.Die;

public class DieTest
{
    public static void roll1000AndPrint()
    {
        int[] rollSums = get1000RollSums();
        int[] numberOfEachSum = sortNumberOfEachSum(rollSums);
        printStats(numberOfEachSum);
    }

    private static int[] get1000RollSums() {
        Die die1 = new Die();
        Die die2 = new Die();
        int[] rollSums = new int[1000];

        for (int i = 0; i < rollSums.length; i++) {
            rollSums[i] = die1.roll() + die2.roll();
        }

        return rollSums;
    }

    private static int[] sortNumberOfEachSum(int[] sums)
    {
        int[] numberOfEachSum = new int[11];
        for (int i = 0; i < sums.length; i++)
        {
            numberOfEachSum[sums[i] - 2] += 1;
        }
        return numberOfEachSum;
    }

    private static void printStats(int[] intArray)
    {
        System.out.println("sum:\thyppighed:\tfrekvens:\tforventet:");
        String[] expectedProbabilities = {"2,78", "5,56", "8,33", "11,11", "13,89", "16,67", "13,89", "11,11", "8,33", "5,56", "2,78"};
        String[] probabilities = getProbabilities(intArray);
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(i + 2 + ":\t\t" + intArray[i] + "\t\t\t" + probabilities[i] + "%" + "\t\t" + expectedProbabilities[i] + "%");
        }
    }
    private static String[] getProbabilities(int[] intArray)
    {
        String[] probabilities = new String[11];
        for (int i = 0; i < intArray.length; i++)
        {
            probabilities[i] = String.format("%.2f", intArray[i]/10.0d);
        }
        return probabilities;
    }
}


