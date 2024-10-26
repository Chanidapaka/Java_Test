package sit.int202;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(120); //สร้าง array ให้ 10ช่อง //จำนวนช่อง สำคัญมาก //มันเต็มแล้วขยาย1.5 เท่า กว่าจะครบ100 มันขยายหลายรอบมาก
        for (int i = 0; i < 30; i++){
            list.add((int) (Math.random()*100));
        }
    }
}
