import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("How many students do you have?:   ");
        int numberOfStudent = keyboardInput.nextInt();
        System.out.println("How many subject did they do?:   ");
        int numberOfSubject = keyboardInput.nextInt();

        int[][] detailsStore = canCollectNumberOfStudentAndSubject(numberOfStudent , numberOfSubject);
        for (int count = 0; count < detailsStore.length; count++) {
//            System.out.printf("Entering score for student %d\n",count+1);
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                System.out.printf("Entering score for student %d\n",count+1);
                System.out.printf("Enter score for subject %d: \n", innerCount+1);
                int number = keyboardInput.nextInt();
                System.out.println("Saving" + "  " + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                detailsStore[count][innerCount] = number;
            }
        }

        int[][] num1 = printOut(detailsStore);
        int[] numberOfTotal = canCalculateTheTotal(num1, detailsStore);
        double[] numberOfAverage = calculateTheAverage(numberOfTotal, numberOfSubject,numberOfStudent);
        int[] sortTheArray = sortTheArray(numberOfTotal);
        int[] numberOfPosition = findThePosition(sortTheArray, numberOfTotal);


        System.out.println(
                """
                =====================================================
                 STUDENT   SUB1   SUB2   SUB3    TOT      AVE    POS
                =====================================================""");
               for (int count = 0; count < num1.length; count++){
                   System.out.printf("Student %d\t", count+1);
                  for (int innerCount = 0; innerCount < num1[count].length; innerCount++) {
                         System.out.print(num1[count][innerCount] + "     ");

                  }
                  System.out.print(numberOfTotal[count] + "     ");
                  System.out.print(numberOfAverage[count] +"   ");
                  System.out.print(numberOfPosition[count] + "         ");
                  System.out.println();
               }
               System.out.println("===================================================");
               System.out.println("===================================================");


               int[] numberFirstIndex = collectFirstIndex(numberOfStudent, detailsStore);
               int highestNumberInIndexZero = canReturnHighestNumber(numberFirstIndex);
               int lowestNumberInIndexZero = canReturnLowestNumber(numberFirstIndex);

            System.out.println(
                    """
                    SUBJECT  SUMMARY
                    """);
        for (int count = 0; count < numberOfSubject; count++) {
            System.out.printf("Subject %d\t", count+1);
        }
    }




    public static int[][] printOut(int[][] detailsStore){
        int[][] nums = new int[detailsStore.length][detailsStore.length -1];
        for (int row = 0; row < detailsStore.length; row++) {
            for (int column = 0; column < detailsStore[row].length; column++) {
                  nums[row][column] = detailsStore[row][column];
            }
        }
        return nums;
    }

    public static int[][] canCollectNumberOfStudentAndSubject(int numberOfStudent, int numberOfSubject) {
        int[][] storeDetails = new int[numberOfStudent][numberOfSubject];
        return storeDetails;
    }

    public static int[] canCalculateTheTotal(int[][] nums, int[][] detailsStore) {
        int[] num1 = new int[detailsStore.length];
        for (int count = 0; count < detailsStore.length; count++) {
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                num1[count]+=detailsStore[count][innerCount];

            }
        }

        return num1;
    }

    private static double[] calculateTheAverage(int[]num1, int numberOfSubject, int pupil) {
        double[] counter = new double[pupil];
        for (int count = 0; count < num1.length; count++) {
            double value = num1[count] * 1.00/ numberOfSubject;
            counter[count] = Math.round(value * 100.00) /100.00;
        }
        return counter;
    }


    private static int[] sortTheArray(int[] numberOfTotal) {
        int[] resultNum = new int[numberOfTotal.length];

        for (int count = 0; count < numberOfTotal.length; count++) {
             resultNum[count] = numberOfTotal[count];
        }

        int[] numbers = new int[resultNum.length];
        for (int count = 0; count < resultNum.length;) {
            int nums = resultNum[count];
            int counter;
            for ( counter = count + 1; counter < resultNum.length; counter++) {
                if (nums > resultNum[counter]) break;
            }
            if (counter == resultNum.length) {
                numbers[count] = nums;
                count++;
            }else {
                int tempo = resultNum[counter];
                resultNum[counter] = nums;
                resultNum[count] = tempo;
            }
        }
        return numbers;
    }

    private static int[] findThePosition(int[] sortTheArray, int[] numberOfTotal) {
        int[] position = new int[numberOfTotal.length];

        for (int count = 0; count < numberOfTotal.length; count++) {
            for (int innerCount = 0; innerCount < sortTheArray.length; innerCount++) {
                if (numberOfTotal[count] == sortTheArray[innerCount]) {
                    position[count] = numberOfTotal.length - innerCount;
                }
            }
        }
        return position;
    }

    private static int[] collectFirstIndex(int numberOfStudent, int[][] detailsStore) {
        int[] nums = new int[numberOfStudent];
        int count;
        for (count = 0; count < detailsStore.length; ) {
            System.out.println(Arrays.toString(detailsStore[count]));
            for (int innerCount = 0; innerCount < detailsStore[count].length - 2; innerCount++) {
                   nums[count] = detailsStore[count][innerCount];
            }
            count++;
        }

      return nums;
    }

    private static int canReturnHighestNumber(int[] numberFirstIndex) {
        int highestNumber = numberFirstIndex[0];

        for (int count = 0; count < numberFirstIndex.length; count++) {
            if (numberFirstIndex[count] > highestNumber) {
                highestNumber = numberFirstIndex[count];
            }
        }
        System.out.println(highestNumber);
        return highestNumber;
    }

    private static int canReturnLowestNumber(int[] numberFirstIndex) {
        int lowestNumber = numberFirstIndex[0];

        for (int count = 0; count < numberFirstIndex.length; count++) {
            if (numberFirstIndex[count] < lowestNumber) {
                lowestNumber = numberFirstIndex[count];
            }
        }
        System.out.println(lowestNumber);
        return lowestNumber;
    }

}

