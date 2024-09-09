import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}


public class Main {

    private static void fun(IntWrapper a, IntWrapper b){
        if (a.value >= b.value){
            b.value += 10;
            a.value *= 2;
        } else{
            b.value *= 2;
            a.value += 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt()), b = new IntWrapper(sc.nextInt());
        fun(a, b);
        System.out.println(a.value + " " + b.value);

    }
}