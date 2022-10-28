import java.util.ArrayDeque;
import java.util.Deque;

////===============================================================================================
//=========================== ArrayDeque で  FIFO , LFLO 実装 =====================================
////===============================================================================================
public class A_03 {

    public static void main(String[] args) {

        // === Deque クラス
        Deque<String> queue = new ArrayDeque<String>();

        // キューにデータを登録（エンキュー）
        queue.addLast("5");
        queue.addLast("3");
        queue.addLast("8");

        System.out.println(queue);

        // === キューから１つ取り出す（デキュー）
        System.out.println(queue.removeFirst());

        System.out.println(queue);

        // =============================== FIFO
        queue.addLast("2"); // === プッシュ push
        System.out.println(queue);

        queue.removeLast(); // === ポップ POP
        System.out.println(queue);

    }

}