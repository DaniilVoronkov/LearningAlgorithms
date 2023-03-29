import java.util.Hashtable;
import java.util.Map;

public class LearningHashTables {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();
        table.put("test", 23);
        table.put("Orange", 67);
        System.out.println(table);
        System.out.println(table.get("Orange"));
    }
}
