package sit.int202;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class testSotedset {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>(); //สร้างCollection Framework 1.ArrayList
        Set<Student> set = new TreeSet<Student>();     //สร้างCollection Framework 2.TreeSet
        Student x = null;
        for (int i = 0; i < 20; i++) {
          //  int x = (int) (Math.random() * 100)+10;
            x = new Student();
            x.setId(i+101);
            list.add(x); //ซ้ำได้
            set.add(x); //ห้ามซ้ำ เรียงตามkey
        }
        System.out.println(list);
        System.out.println(set);
    }
}
