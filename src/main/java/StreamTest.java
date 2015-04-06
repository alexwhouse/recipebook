import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alexwhouse on 2/20/15.
 */
public class StreamTest {
    /**
     * Main Launch
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("def");

        List<String> list2 = new ArrayList<String>();
        list2.add("ghi");
        list2.add("jkl");

        map.put("first", list1);
        map.put("second", list2);

        boolean parallel = map.entrySet().parallelStream().flatMap(entry -> entry.getValue().stream()).isParallel();
        System.out.println("isParallel: " + parallel);
    }

}
