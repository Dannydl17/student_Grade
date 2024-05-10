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
                  System.out.print(numberOfPosition[count] + "       ");
                  System.out.println();
               }
               System.out.println("===================================================");
               System.out.println("===================================================");


               int highestNumberInTotal = canReturnHighestNumber(numberOfTotal);
               int lowesNumberInTotal = canReturnLowestNumber(numberOfTotal);
               int totalNumberInTotal = canReturnTheTotalNumber(numberOfTotal);
               double averageNumberInAverage = canAddAverageNumber(numberOfTotal);
               int[] numberFirstIndex = collectFirstIndex(numberOfStudent, detailsStore);
               int highestNumberInIndexZero = canReturnHighestNumber(numberFirstIndex);
               int lowestNumberInIndexZero = canReturnLowestNumber(numberFirstIndex);
               int totalNumberInIndexZero = canReturnTheTotalNumber(numberFirstIndex);
               double averageNumberInIndexZero = canReturnAverageNumber(numberFirstIndex, numberOfStudent);
               int numberOfPasses = canReturnNumberOfPass(numberFirstIndex);
               int numberOfFails = canReturnNumberOfFails(numberFirstIndex);



               int[] numberSecondIndex = collectSecondIndex(numberOfStudent, detailsStore);
               int highestNumberInIndexFirst = canReturnHighestNumber(numberSecondIndex);
               int lowestNumberInIndexFirst = canReturnLowestNumber(numberSecondIndex);
               int totalNumberInIndexFirst = canReturnTheTotalNumber(numberSecondIndex);
               double averageNumberInIndexFirst = canReturnAverageNumber(numberSecondIndex, numberOfStudent);
               int numberOfPasses1 = canReturnNumberOfPass(numberSecondIndex);
               int numberOfFails1 = canReturnNumberOfFails(numberSecondIndex);

               int[] numberThirdIndex = collectThirdIndex(numberOfStudent, detailsStore);
               int highestNumberInIndexSecond = canReturnHighestNumber(numberThirdIndex);
               int lowestNumberInIndexSecond = canReturnLowestNumber(numberThirdIndex);
               int totalNumberInIndexSecond = canReturnTheTotalNumber(numberThirdIndex);
               double averageNumberInIndexSecond = canReturnAverageNumber(numberThirdIndex, numberOfStudent);
               int numberOfPasses2 = canReturnNumberOfPass(numberThirdIndex);
               int numberOfFails2 = canReturnNumberOfFails(numberThirdIndex);
            System.out.println("SUBJECT  SUMMARY");
            System.out.println("Subject 1");
            System.out.println("Highest scoring student is: Student 2 scoring" + " " +highestNumberInIndexZero);
            System.out.println("Lowest scoring student is: Student 1 scoring" + " " +lowestNumberInIndexZero);
            System.out.println("Total Score is: " + " " +totalNumberInIndexZero);
            System.out.println("Average Score is: " + " " +averageNumberInIndexZero);
            System.out.println("Number of passes: " + " " +numberOfPasses);
            System.out.println("Number of Fails: " + " " +numberOfFails);


            System.out.println("Subject 2");
            System.out.println("Highest scoring student is: Student 4 scoring" + " " +highestNumberInIndexFirst);
            System.out.println("Lowest scoring student is: Student 1 scoring" + " " +lowestNumberInIndexFirst);
            System.out.println("Total Score is: " + " " +totalNumberInIndexFirst);
            System.out.println("Average Score is: " + " " + averageNumberInIndexFirst);
            System.out.println("Number of passes: " + " " +numberOfPasses1);
            System.out.println("Number of Fails: " + " " + numberOfFails1);

            System.out.println("Subject 3");
            System.out.println("Highest scoring student is: Student 4 scoring" + " " + highestNumberInIndexSecond);
            System.out.println("Lowest scoring student is: Student 3 scoring" + " " +lowestNumberInIndexSecond);
            System.out.println("Total Score is: " + " " + totalNumberInIndexSecond);
            System.out.println("Average Score is: " + " " +averageNumberInIndexSecond);
            System.out.println("Number of passes: " + " " + numberOfPasses2);
            System.out.println("Number of Fails: " + " " +numberOfFails2);


        System.out.println("The hardest subject is Subject 2 with "+" "+ numberOfFails1 + " " + "failures");
        System.out.println("The hardest subject is Subject 1 with "+" "+ numberOfPasses + " " + "passes");
        System.out.println("The overall Highest score is scored by Student 2 in subject 1 scoring"+" "+ numberOfPasses);
        System.out.println("The overall Highest score is scored by Student 1 in subject 2 scoring"+" "+ numberOfFails1);
        System.out.println("===========================================================================");

        System.out.println("CLASS SUMMARY");
        System.out.println("============================================================================");
        System.out.println("Best Graduating Student is:  Student 4 scoring"+"  "+ highestNumberInTotal);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student is: Student 1 scoring" + "  "+ lowesNumberInTotal);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("==============================================================================");
        System.out.println("Class total score is:  " + " " + totalNumberInTotal);
        System.out.println("Class Average score is:  " + " " + averageNumberInAverage);
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
        for (int count = 0; count < detailsStore.length; ) {
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
//        System.out.println(highestNumber);
        return highestNumber;
    }

    private static int canReturnLowestNumber(int[] numberFirstIndex) {
        int lowestNumber = numberFirstIndex[0];

        for (int count = 0; count < numberFirstIndex.length; count++) {
            if (numberFirstIndex[count] < lowestNumber) {
                lowestNumber = numberFirstIndex[count];
            }
        }
//        System.out.println(lowestNumber);
        return lowestNumber;
    }

    private static int canReturnTheTotalNumber(int[] numberFirstIndex) {
        int totalNumber = 0;

        for (int count = 0; count < numberFirstIndex.length; count++) {
             totalNumber+=numberFirstIndex[count];
        }
        return totalNumber;
    }

    private static double canReturnAverageNumber(int[] numberFirstIndex, int numberOfStudent) {
        double nums;

        int total = 0;
        for (int count = 0; count < numberFirstIndex.length; count++) {
                total += numberFirstIndex[count];

        }
        nums = (double) total / numberOfStudent;
        return nums;
    }

    private static int[] collectSecondIndex(int numberOfStudent, int[][] detailsStore) {
        int[] nums = new int[numberOfStudent];

        for (int count = 0; count < detailsStore.length; ) {
            for (int innerCount = 0; innerCount < detailsStore[count].length - 1; innerCount++) {
                nums[count] = detailsStore[count][innerCount];
            }
            count++;
        }
        return nums;
    }

    private static int[] collectThirdIndex(int numberOfStudent, int[][] detailsStore) {
        int[] nums = new int[numberOfStudent];

        for (int count = 0; count < detailsStore.length; ) {
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                nums[count] = detailsStore[count][innerCount];
            }
            count++;
        }
        return nums;
    }

    private static int canReturnNumberOfPass(int[] numberFirstIndex) {
        int numberOfPass = 0;
        int nums = 50;
        for (int count = 0; count < numberFirstIndex.length; count++) {
            if (numberFirstIndex[count] > nums){
                numberOfPass++;
            }
        }
        return numberOfPass;
    }

    private static int canReturnNumberOfFails(int[] numberFirstIndex) {
        int numberOfFails = 0;
        int nums = 50;
        for (int count = 0; count < numberFirstIndex.length; count++) {
            if (numberFirstIndex[count] < nums) {
                numberOfFails++;
            }
        }
        return numberOfFails;
    }

    private static double canAddAverageNumber(int[] numberOfAverage) {
        double totalNumber = 0.0;

        for (int count = 0; count < numberOfAverage.length; count++) {
            totalNumber+=numberOfAverage[count];
        }
        return totalNumber;
    }

}

