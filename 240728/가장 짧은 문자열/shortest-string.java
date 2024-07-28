import java.util.*;

class Input{
    String str;
    int size;

    public Input(){
        this.str = "";
        this.size = 0;
    }
    
    public Input(String str, int size){
        this.str = str;
        this.size = size;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input[] inputList = new Input[3];
        for (int i = 0; i < 3; i++){
            String str = sc.next();
            int size = str.length();
            // Make Instance 
            inputList[i] = new Input(str, size);
        }

        int min = inputList[0].size;
        int max = inputList[0].size;
        for (int i = 0; i <3; i++){
            if (max < inputList[i].size) max = inputList[i].size;
            else if(min > inputList[i].size) min = inputList[i].size;
        }
        // output
        System.out.println(max - min);
    }
}