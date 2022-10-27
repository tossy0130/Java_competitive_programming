package LeetCode.stack_queue;
import java.util.*;

//=============== スタック・キュー 01
public class B_06 {
    
    static void Stack_and_queue_01(int[] arr){
        
        //=== 全出力
        for(Integer val : arr) {
            System.out.println(val);
        }
    }
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] arr = new int [num + 1];
        arr[0] = num;
        for(int i = 1; i < num + 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        Stack_and_queue_01(arr);
        
    }
}