import java.util.*;
import java.util.ArrayList;

//===============================================================
//======================= 配列の最後に追加する ====================
//===============================================================
public class A_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();

        ArrayList<Integer> arr_list_01 = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            arr_list_01.add(sc.nextInt());
        }

        // === リスト 追加
        // === add (index, 値)
        arr_list_01.add(K, Q);

        for (Integer val : arr_list_01) {
            System.out.println(val);
        }

    }
}
