public import java.util.*;

/**


入力例1
5
4 1 3 5 2

出力例1
1 4 3 5 2
1 2 3 5 4
1 2 3 5 4
1 2 3 4 5
 
 * 
 * 
 */

//================================== 選択　ソート ==============================
public class A_02 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int loop_num = sc.nextInt();
        int[] arr_item = new int[loop_num];
        for(int i = 0; i < loop_num; i++) {
            arr_item[i] = sc.nextInt();
        }
        
        //=============== 選択ソート　ロジック =================
        for(int i = 0; i < arr_item.length - 1; i++) {
            
            int min_idx = i; // === 最長値の index
            
            for(int j = i + 1; j < arr_item.length; j++) {
                if(arr_item[j] < arr_item[min_idx]) {  //==== １回目のループ  4 < 1
                    min_idx = j;   // １回目のループ mid_idx = 1  , 
                }
            } //=== END for
            
            int min = arr_item[min_idx];  // １回目のループ   min = 1
            arr_item[min_idx] = arr_item[i]; // １回目のループ arr_item[min_idx] = 4
            arr_item[i] = min; // min 最小値　が入る   １回目のループ arr_item[i] = 1
            
            for(int k = 0; k < arr_item.length; k++) {
                if(k == arr_item.length - 1) {
                    System.out.print(arr_item[k]);
                } else {
                    System.out.print(arr_item[k] + " ");
                }
                
            }
            
            System.out.println();
            
        } //=== END for 
        
    }
}
