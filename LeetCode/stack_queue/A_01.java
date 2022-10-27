import java.util.*;
import java.util.ArrayList;

/**
 * 
 * Q = int(input())
 * 
 * A = [] # キュー, スタック本体
 * for i in range(Q):
 * query = input().split()
 * if query[0] == "1":
 * # PUSH
 * A.append(query[1])
 * elif query[0] == "2":
 * # STAY(何もしない)
 * continue
 * print(len(A))
 * for i in range(len(A)):
 * print(A[i])
 * 
 * 
 */

public class A_01 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int idx = 0;
        int[] arr = new int[num + 1];

        ArrayList<Integer> arr_ans = new ArrayList<Integer>();
        int first_num = 0;
        while (idx < num) {
            arr[idx] = sc.nextInt();
            if (arr[idx] == 1) {
                first_num += 1;
                int tmp = sc.nextInt();
                arr_ans.add(tmp);
                // System.out.println(tmp);
            }

            idx += 1;
        }

        // === 先頭に値を追加
        if (arr_ans.size() > 0) {
            arr_ans.add(0, first_num);
            for (Integer val : arr_ans) {
                System.out.println(val);
            }
        } else {
            System.out.println("0");
        }

    }
}