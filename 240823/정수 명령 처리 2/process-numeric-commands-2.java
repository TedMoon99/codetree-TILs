import java.util.*;

public class Main {

    private static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String command = sc.next();
            num = (command.equals("push")) ? sc.nextInt(): 0;

            switch(command){
                case "push":
                    queue.add(num);
                    break;
                case "pop":
                    System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println((queue.isEmpty())? 1: 0);
                    break;
                case "front":
                    System.out.println(queue.peek());
                    break;
            }
        }


    }
}

/*
Java에서는 Queue를 이용 가능 하다.

import java.util.Queue;

Queue<Type> name = LinkedList<>();

1. add(E)
2. size()
3. isEmpty()
4. peek() : 맨 앞에 있는 데이터 조회
5. poll() : 맨 앞에 있는 데이터 삭제 및 반환
*/