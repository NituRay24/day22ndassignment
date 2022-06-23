import java.util.PriorityQueue;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;

public class QueueDemons {
    public void demonsQueue() {
        Queue<String> strQue = new PriorityQueue<>();
        System.out.println(strQue.isEmpty());
        strQue.add("Summer");
        System.out.println(strQue.isEmpty());
        strQue.add("Monsoon");
        strQue.add("Autumn");
        strQue.add("Winter");
        strQue.add("Spring");
        Iterator<String> itrString = strQue.iterator();
        while (itrString.hasNext()) {
            System.out.println(itrString.next());
        }

        System.out.println(strQue);
        System.out.println(strQue.poll());
//strQue.poll(); //

        strQue.remove();
        Iterator<String> itrString1 = strQue.iterator();
        while (itrString1.hasNext()) {
            System.out.println(itrString1.next());
        }

    }

    public static void main(String[] args) {
        QueueDemons qDemons = new QueueDemons();
        qDemons.demonsQueue();
    }
}
