package Exo3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Point, Circle> m = new HashMap();

        Point p = new Point(100, 150);
        Circle c = new Circle(p, 100);

        m.put(p, c);
        System.out.println(m.containsKey(p));
        System.out.println(m.containsKey(new Point(1, 2)));
    }

}
