import java.util.*;

/***
 * 
 * 入力例1
 * 5
 * 4 1 3 5 2
 * 
 * 出力例1
 * 1 4 3 5 2
 * 1 3 4 5 2
 * 1 3 4 5 2
 * 1 2 3 4 5
 * 
 * 
 * 
 */
// ===============================================================
// =========================== 挿入ソート =========================
// ===============================================================
public class A_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ループ回数（配列の要素）
        int l_num_01 = sc.nextInt();

        // １行を split で取得
        // String[] s_arr_01 = sc.nextLine().split(" ");

        int[] i_arr_01 = new int[l_num_01];

        for (int i = 0; i < l_num_01; i++) {
            i_arr_01[i] = sc.nextInt();
        }

        // ============= 挿入ソート用 ロジック
        for (int i = 1; i < i_arr_01.length; i++) {
            int j = i;
            while (j >= 1 && i_arr_01[j - 1] > i_arr_01[j]) {

                int tmp = i_arr_01[j - 1];
                i_arr_01[j - 1] = i_arr_01[j];
                i_arr_01[j] = tmp;

                j--;
            }

            // ========== 出力用
            for (int k = 0; k < i_arr_01.length; k++) {
                // === 出力 スペース処理
                if (k == i_arr_01.length - 1) {
                    System.out.print(i_arr_01[k]);
                } else {
                    System.out.print(i_arr_01[k] + " ");
                }
            }

            // === 出力用 改行
            System.out.println();

        }

    }
}