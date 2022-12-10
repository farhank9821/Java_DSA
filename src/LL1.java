
import java.util.LinkedList;        // Operations of linkedList using frameworks


public class LL1 {
    public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();

      list.addFirst("a");
      list.addFirst("is");
      list.addFirst("This");          // if only add is written, then ll by default
      System.out.println(list);          // considers it addLast();

      list.addLast("LinkedList");
      System.out.println(list);

      System.out.println(list.size());

      list.removeFirst();
      list.removeLast();
      System.out.println(list);

      list.remove(3);    // If u want to delete a certain node
    }
}
