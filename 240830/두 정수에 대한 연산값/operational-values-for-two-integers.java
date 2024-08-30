import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        IntWrapper aWrapper = new IntWrapper(a), bWrapper = new IntWrapper(b);

        changeNumber(aWrapper, bWrapper);
        a = aWrapper.value;
        b = bWrapper.value;
        System.out.println(a + " " + b);

    }

    // 문제에서 설명한 대로 a와 b를 변경한다
    // call by reference를 구현한다
    public static void changeNumber(IntWrapper a, IntWrapper b){
        if (a.value > b.value){
            b.value *= 2;
            a.value += 25;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

/*

완전 탐색이란, 문제를 해결할 수 있는 가장 `naive`한 방법(=> 모든 가능한 경우를 다 따져보는 방법)이다. 이는 모든 가능한 경우를 따져보는 것으로, 코드를 작성하기 쉽다는 장점이 있지만 모든 가능한 경우를 전부 계산해야 하므로 올바른 정답을 찾기까지 걸리는 시간(프로그램 수행시간)이 비교적 오래 걸린다.
- 장점 : 코드짜기가 쉽다
- 단점 : 수행시간이 비교적 오래 걸린다
결론 : 시간복잡도 계산해보고 시간초과가 나지 않을 것 같다면 무조건 쓰기
*/