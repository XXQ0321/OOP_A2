import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 首先按名字字母顺序排序，如果名字相同，则按年龄排序
        int nameComparison = v1.getName().compareTo(v2.getName());
        if (nameComparison != 0) {
            return nameComparison; // 如果名字不同，则按照名字排序
        } else {
            return Integer.compare(v1.getAge(), v2.getAge()); // 如果名字相同，则按年龄排序
        }
    }
}
