import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        Student[] studentList = new Student[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            
            Student data = new Student(name, height, weight);
            studentList[i] = data;
        }

        // 이름순으로 정렬
        Arrays.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (int i = 0; i < n; i++){
            System.out.printf("%s %d %.1f\n", studentList[i].name, studentList[i].height, studentList[i].weight);
        }

        // 키가 큰 순으로 정렬
        Arrays.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b){
                return b.height - a.height;
            }
        });

        System.out.println("\nheight");
        for (int i = 0; i < n; i++){
            System.out.printf("%s %d %.1f\n", studentList[i].name, studentList[i].height, studentList[i].weight);
        }
    }
}


class Student{
    String name;
    int height;
    double weight;

    Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}