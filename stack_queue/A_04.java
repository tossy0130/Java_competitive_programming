import java.util.*;
import java.util.ArrayList;

/**
 * 
 * 入力例1
 * 5 2
 * 1 2 3 4 5
 * 
 * 出力例1
 * 2
 *
 */

public class A_04 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int target = sc.nextInt();

        // === リスト作成
        ArrayList<Integer> arr_list = new ArrayList<Integer>();

        int idx = 0;
        while (idx < loop) {
            // === リストへ値を格納
            arr_list.add(sc.nextInt());
            idx = idx + 1;
        }

        System.out.println(arr_list.get(target - 1));

    }
}