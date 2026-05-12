import java.util.LinkedList;
import java.util.Queue;

public class Queues {

   public static void main(String[] args) {

      System.out.println("JAVA COLLECTION");

      Queue<Integer> queue = new LinkedList<>();

      queue.add(5);
      queue.add(9);
      queue.add(7);
      queue.add(23);

      System.out.println(queue);

      // Intentional Error
      int result = 10 / 0;

      System.out.println(result);
   }
}
