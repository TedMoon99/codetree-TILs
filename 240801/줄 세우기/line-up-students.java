import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] studentList = new Student[n];
        for (int i = 0; i < n; i++){
            int height = sc.nextInt(), weight = sc.nextInt();

            Student data = new Student(height, weight, i+1);
            studentList[i] = data;
        }

        Arrays.sort(studentList);

        for(int i = 0; i < n; i++){
            System.out.printf("%d %d %d\n", studentList[i].height, studentList[i].weight, studentList[i].number);
        }
    }
}

class Student implements Comparable<Student>{
    int height, weight, number;

    Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }


    @Override
    public int compareTo(Student other){
        if (this.height == other.height){
            // 몸무게가 같다면
            if(this.weight == other.weight) return other.number - this.number;
            return other.weight- this.weight;
        }
        return other.height-this.height;
    }
}