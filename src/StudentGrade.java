import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int[][] detailsStore = canCollectNumberOfStudentAndSubject(4,3);
        for (int count = 0; count < detailsStore.length; count++) {
            System.out.printf("Entering score for student %d\n",count+1);
            for (int innerCount = 0; innerCount < detailsStore[count].length; innerCount++) {
                System.out.printf("Enter score for subject %d: \n", innerCount+1);
                int number = keyboardInput.nextInt();
                detailsStore[count][innerCount] = number;
            }
        }
        System.out.println(Arrays.deepToString(detailsStore));
    }
    public static int[][] canCollectNumberOfStudentAndSubject(int numberOfStudent, int numberOfSubject) {
        int[][] storeDetails = new int[numberOfStudent][numberOfSubject];
        return storeDetails;
    }

}
