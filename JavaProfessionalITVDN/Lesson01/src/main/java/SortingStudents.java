import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {

        int [] marks = {7,8,9,3,0,11};
        String[] students = {"Alex","Andrew", "Yauheni","Karina"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for (int tmp: marks) {
            System.out.println(tmp + ", ");
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", ");
        }
    }
}
