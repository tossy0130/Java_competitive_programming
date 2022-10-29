import java.util.*;

public class A_01 {

    // ================ 配列の index を出力 ====================
    static void Arr_03(ArrayList<Integer> arr_list, int idx) {
        System.out.println(arr_list.get(idx));
    }

    // === 配列の要素 全て出力 ===
    static void Arr_02(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {

        // ================ start ======================================
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 1, 3, 4, 5, 12, 6, 8, 1, 3 };

        // ================= 関数 Arr_02 実行 ====================
        Arr_02(arr);
        // ================ END ======================================

        // ================ start ======================================
        int[] arr_03 = { 5, 1, 3, 4, 5, 12, 6, 8, 1, 3 };
        ArrayList<Integer> arr_list_03 = new ArrayList<Integer>();

        int idx_03 = 0;
        // =============== 配列 => リスト へ値代入
        for (Integer val_03 : arr_03) {
            arr_list_03.add(val_03);
            idx_03++;
        }

        Arr_03(arr_list_03, 4 - 1);
        // ================ END ======================================

    }
}