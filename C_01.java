import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class C_01 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        String[] sarr = sc.nextLine().split(" ");

        int[] iarr = new int[3];
        for (int i = 0; i < 3; i++) {
            iarr[i] = Integer.parseInt(sarr[i]);
        }

        // ================= 昇順にソート （クイックソート） ==============
        for (int i = iarr.length - 1; 0 < i; i--) {
            if (iarr[i] < iarr[i - 1] && i > 0) {
                int tmp = iarr[i - 1];
                iarr[i - 1] = iarr[i];
                iarr[i] = tmp;
            }
        }

        // ============ ソート済みの配列、 Max の値 - MIN の値
        System.out.println(iarr[iarr.length - 1] - iarr[0]);

    }
}