import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}


public class Main {
    private static void swap(IntWrapper a, IntWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper n = new IntWrapper(sc.nextInt()), m = new IntWrapper(sc.nextInt());
        swap(n,m);
        System.out.println(n.value + " " + m.value);
    }
}