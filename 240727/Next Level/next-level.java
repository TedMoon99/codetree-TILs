import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String id = sc.next();
        int level = sc.nextInt();
        // Instance call
        Info info1 = new Info();
        Info info2 = new Info(id, level);
        // output
        System.out.printf("user %s lv %d\n", info1.id, info1.level);
        System.out.printf("user %s lv %d", info2.id, info2.level);
    }
}

class Info{
    String id;
    int level;
    // no parameter
    public Info(){
        this.id = "codetree";
        this.level = 10;
    }
    // existed parameter
    public Info(String id, int level){
        this.id = id;
        this.level = level;
    }
}