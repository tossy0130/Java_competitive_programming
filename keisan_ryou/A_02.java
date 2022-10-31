import java.util.*;

//=========================== 配列に K の値が含まれているか 含まれていたら YES, 含まれてなかったら NO
public class A_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr_item = new int[N];
        int flg = 0;
        for (int i = 0; i < N; i++) {
            arr_item[i] = sc.nextInt();
            if (arr_item[i] == K) {
                flg = 1;
                break;
            } else {
                flg = 0;
            }
        }

        if (flg > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}