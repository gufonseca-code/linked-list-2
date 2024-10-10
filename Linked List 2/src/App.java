import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList = linkedList.reversed();

        System.out.println(linkedList);
    }
}
