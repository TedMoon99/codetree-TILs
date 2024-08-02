import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Person[] personList = new Person[n];
        // input
        for (int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt(), weight = sc.nextInt();
            
            Person person = new Person(name, height, weight);
            personList[i] = person;
        }
        
        // 키를 기준으로 정렬한다
        Arrays.sort(personList, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b){
                // 몸무게 내림차순 정렬
                if (a.height == b.height) return b.weight-a.weight;
                return a.height-b.height;
            }
        });
        
        // ouput
        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d\n", personList[i].name, personList[i].height, personList[i].weight);
        }
    }
}

class Person{
    String name;
    int height, weight;
    
    Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}