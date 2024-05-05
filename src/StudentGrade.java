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

        int[][] detailsStore = canCollectNumberOfStudentAndSubject(numberOfStudent,numberOfSubject);
        for (int count = 0; count < detailsStore.length; count++) {
            System.out.printf("Entering score for student %d\n",count+1);
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                System.out.printf("Enter score for subject %d: \n", innerCount+1);
                int number = keyboardInput.nextInt();
                detailsStore[count][innerCount] = number;
            }
        }

        int[][] num1 = printOut(detailsStore);

    }


    public static int[][] printOut(int[][] detailsStore){
        int[][] nums = new int[detailsStore.length][detailsStore.length + 2];
        System.out.println(Arrays.deepToString(nums));
        for (int row = 0; row < detailsStore.length; row++) {
//            System.out.println(row);
            System.out.printf("Student %d\t", row+1);
            for (int column = 0; column < detailsStore[row].length; column++) {
                  nums[row][column] = detailsStore[row][column];
                System.out.println(Arrays.deepToString(nums));
            }
            System.out.println();
        }
        return canCalculateTheTotal(nums, detailsStore);
    }

    public static int[][] canCollectNumberOfStudentAndSubject(int numberOfStudent, int numberOfSubject) {
        int[][] storeDetails = new int[numberOfStudent][numberOfSubject];
        return storeDetails;
    }

    public static int[][] canCalculateTheTotal(int[][] nums, int[][] detailsStore) {
        int[] num1 = new int[detailsStore.length];
        System.out.println(Arrays.toString(num1));
        int count1 = 0;
        for (int count = 0; count < detailsStore.length; count++) {
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                num1[count]+=detailsStore[count][innerCount];

            }
        }

        for (int counter = 0; counter < nums.length; counter++  ) {
            for (int innerCount = 0; innerCount < nums[counter].length; innerCount++) {
                if (innerCount == nums[counter].length -3) {
                    nums[counter][innerCount] = num1[counter];
                    System.out.println(Arrays.deepToString(nums));
                }
            }
        }



        return nums;
    }

}

