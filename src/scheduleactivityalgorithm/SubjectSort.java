package scheduleactivityalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Schedule Activity algorithm -
 * Step 1 : Sort Subjects based on End time
 * Step 2 : Add first subject , then check next subject starts after first subject finishes or not . If yes then add next subject
 * Step 3. Count all selected subjects.
 * <p>
 * Time Complexity - O(nlogn) as its not sorted . we are going to sort it
 * Space Complexity - O(n) - as we are creating on ArrayList based on our input size n.
 */
public class SubjectSort {

    /**
     * Accept list of subjects and prints maximum number of activity that can be scheduled.
     *
     * @param list accepts list of subject object . Subject should be - "SUBJECTNAME" "STARTTIME" "ENDTIME"
     * @return int
     */
    private static int getTotalSubject(List<Subject> list) {
        String endTime = null;
        int count = 0;
        int noOfSubject = 0;
        for (Subject subject : list) {
            if (count == 0) {
                count++;
                endTime = subject.getEndTime();
                noOfSubject++;
            } else {
                if (subject.getStartTime().compareTo(endTime) > 0) {
                    endTime = subject.getEndTime();
                    noOfSubject++;
                }
            }
        }
        return noOfSubject;
    }

    public static void main(String[] args) {
        /**
         * First input should be number of day
         * Second input should be number of subject
         * Third input should be Subject object. (Only one space between them)  example :
         *                                        "math" "10:00" "13:00"
         *                                        "chem" "11:00" "12:00"
         *                                        "phy" "11:00" "12:30"
         */
        Scanner scanner = new Scanner(System.in);
        try {
            int days = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < days; i++) {
                int sub = Integer.parseInt(scanner.nextLine());
                List<Subject> list = new ArrayList<>();
                for (int k = 0; k < sub; k++) {
                    Subject subject;
                    String subDetails = scanner.nextLine();
                    String[] subAndTimes = subDetails.split(" ");
                    subject = new Subject(subAndTimes[0], subAndTimes[1], subAndTimes[2]);
                    list.add(subject);
                }
                Collections.sort(list);
                System.out.println(getTotalSubject(list));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
