import java.util.*;
import java.util.ArrayList;

/**
 * 
 * 入力例1
 * 5
 * 10 20 30 40 50
 * 3
 * 2 4 1
 * 
 * 出力例1
 * 20
 * 40
 * 10
 * 
 * 
 */

public class A_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loop_num_01 = sc.nextInt();
        ArrayList<Integer> arr_list_01 = new ArrayList<Integer>();

        // === 値取得
        int idx = 0;
        while (idx < loop_num_01) {
            arr_list_01.add(sc.nextInt());
            idx = idx + 1;
        }

        int loop_num_02 = sc.nextInt();

        int i = 0;
        int tmp = 0;
        // === idnex を取得して、値を入れる。
        while (i < loop_num_02) {
            tmp = sc.nextInt();
            System.out.println(arr_list_01.get(tmp - 1));
            i++;
        }

    }
}