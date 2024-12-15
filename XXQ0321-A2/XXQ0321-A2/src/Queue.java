import java.util.LinkedList;

public class Queue {
    private static LinkedList<Visitor> visitors;

    public Queue() {
        visitors = new LinkedList<>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public Visitor removeVisitorByIndex(int index) {
        if (!visitors.isEmpty()) {
            return visitors.remove(index);
        }
        return null;
    }

    public Visitor removeVisitor() {
        if (!visitors.isEmpty()) {
            return visitors.removeFirst();
        }
        return null;
    }

    public void printQueue() {
        if (visitors.isEmpty()) {
            System.out.println("队列是空的");
        } else {
            for (Visitor visitor : visitors) {
                System.out.println(visitor);
            }
        }
    }

    public boolean isEmpty() {
        return visitors.isEmpty();
    }
}

