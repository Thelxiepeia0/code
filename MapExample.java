import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapExample {
    public static void main(String[] args) {
        // 创建一个Map对象
        Map<String, Integer> map = new HashMap<>();

        // 向Map中添加键值对
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", null);

        System.out.println("使用Iterator遍历Map：");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        System.out.println("HashMap是否线程安全：");
        try {
            Thread.sleep(1000); // 模拟其他线程修改map
            map.put("pear", 30);
            System.out.println("HashMap是线程不安全的");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" HashMap是否允许null值：");
                Integer value = map.get("orange");
        System.out.println("'orange'对应的值为：" + value);

    }
}