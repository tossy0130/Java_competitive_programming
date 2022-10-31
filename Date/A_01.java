import java.util.*;

/**
 * 
 * ・西暦が4で割り切れる年は閏年
 * ・ただし、100で割り切れる年は平年
 * ・ただし、400で割り切れる年は閏年
 * ・西暦が4で割り切れない年は平年
 * 
 * 入力例1
 * 2019
 * 
 * 出力例1
 * No
 * 
 * 入力例2
 * 2020
 * 
 * 出力例2
 * Yes
 * 
 * 
 */

public class A_01 {

    public void Date_01(int num) {

        // ================ 閏年 ===========
        int flg = 0;
        if (num % 4 == 0) {
            flg = 1;
        } else {
            flg = 0;
        }

        if (flg == 1) {
            if (num % 100 != 0 || num % 400 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {

        A_01 md = new A_01();
        Scanner sc = new Scanner(System.in);

        int t_num = sc.nextInt();

        // === インスタンスメソッド
        md.Date_01(t_num);

    }
}