import java.util.*;

//======================================================================
//==================== LIFO (後入れ先出し)  =============================
//======================================================================

class Stack {

    private int arr[];
    private int top;
    private int capacity;

    // Stack を初期化する コンストラクタ
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 要素を stack に 追加するユーティリティ関数
    public void push(int x) {
        // スタックが 満タンだったら 例外処理
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        // === ************* スタックへ追加 *************
        System.out.println("スタック追加" + x);
        arr[++top] = x;
    }

    // 一番上にある要素を POP する
    public int pop() {
        // スタックが 満タンだったら 例外処理
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("POP 処理:::" + peek());

        // Stackサイズを 1 減らし、POP した要素を返す
        return arr[top--];
    }

    // Stack の 最上位要素を返す
    public int peek() {
        // === 満杯じゃなかったら
        if (!isEmpty()) {
            return arr[top];
        } else {
            // === 満杯だったら -1 を返す
            System.exit(-1);
        }

        return -1;
    }

    // Stack のサイズを返す
    public int size() {
        return top + 1;
    }

    // Stack が空かどうかをチェックする
    public boolean isEmpty() {
        return top == -1;
    }

    // Stack が満杯かどうか チェック
    public boolean isFull() {
        return top == capacity - 1;
    }

    // === 配列内 全出力
    public void Arr_print() {
        for (Integer val : arr) {
            System.out.println(val);
        }
    }

}

public class A_02 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Stack stack = new Stack(3);

        stack.push(5); // 5を挿入
        stack.push(3); // 3を挿入

        stack.Arr_print();

        System.out.println("現在のトップ:::" + stack.peek());

        stack.pop();
        stack.pop();

        stack.Arr_print();

    }
}
