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
        System.out.println(" STUDENT  SUB1 SUB2 SUB3");
        for (int row = 0; row < detailsStore.length; row++) {
//            System.out.println(row);
            System.out.printf("Student %d\t", row+1);
            for (int column = 0; column < detailsStore[row].length; column++) {
                System.out.print(detailsStore[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println(canCalculateTheTotal(detailsStore));
    }
    public static int[][] canCollectNumberOfStudentAndSubject(int numberOfStudent, int numberOfSubject) {
        int[][] storeDetails = new int[numberOfStudent][numberOfSubject];
        return storeDetails;
    }

    public static int[][] canCalculateTheTotal(int[][] detailsStore) {
        int[] nums = new int[detailsStore.length];
        System.out.println(Arrays.toString(nums));
        int count1 = 0;
        for (int count = 0; count < detailsStore.length; count++) {
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
//                nums[count1] =
            }
        }

        return detailsStore;
    }
}
