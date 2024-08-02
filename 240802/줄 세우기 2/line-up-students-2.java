import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] studentList = new Student[n];
        // input
        for (int i = 0; i < n; i++){
            int height = sc.nextInt(), weight = sc.nextInt();
            Student student = new Student(i+1, height, weight);
            studentList[i] = student;
        }
        // Sort
        Arrays.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student me, Student other){
                if (me.height == other.height) return other.weight - me.weight;
                return me.height - other.height;
            }
        });

        // output
        for(int i = 0; i < n; i++){
            System.out.printf("%d %d %d\n", studentList[i].height, studentList[i].weight, studentList[i].number);
        }

    }
}

class Student{
    int number, height, weight;

    Student(int number, int height, int weight){
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

}