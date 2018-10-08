import java.util.HashMap;
import java.util.Map;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class Properties {

    private Map<String, String> map = new HashMap<>();

    private Properties parent;

    public void put(String key, String val) {
        map.put(key, val);
    }

    public String get(String key) {
        Properties curr = this;
        while (curr != null) {
            if (curr.map.get(key) != null) {
                return curr.map.get(key);
            }
            curr = curr.parent;
        }

        return null;
    }


    public static void main(String[] args) {
        Properties parent = new Properties();
        parent.put("a", "a");
        parent.put("b", "b");

        Properties son = new Properties();
        son.put("a", "aaa");

        son.parent = parent;

        String a = son.get("a");
        System.out.println(a);

        String b = son.get("b");
        System.out.println(b);

        String c = son.get("c");
        System.out.println(c);
    }
}
