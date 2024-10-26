package Problem_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] data = {8, 2, 3, 7, 8, 8, 7, 4, 7, 4, 4,
                2, 2, 3, 8, 2, 7, 3, 3, 8}; // กำหนดอาเรย์ข้อมูลตัวเลข
        Map<Integer, List<Integer>> map = new HashMap<>(); // สร้าง Map เพื่อเก็บข้อมูลแต่ละตัวเลขและตำแหน่งที่พบ

        for (int i = 0; i < data.length; i++){ // วนลูปผ่านแต่ละตำแหน่งของอาเรย์ data
            if (map.get(data[i]) == null) { // ตรวจสอบว่า key (data[i]) มีอยู่ใน map หรือไม่
                map.put(data[i], new ArrayList<>()); // ถ้าไม่มี key ให้เพิ่ม key ใหม่และสร้าง List สำหรับเก็บตำแหน่ง
            }
            map.get(data[i]).add(i); // เพิ่มตำแหน่ง i ลงใน List ที่สัมพันธ์กับตัวเลข data[i] ใน map
        }
        int maxFrequency = 0; // ตัวแปรเก็บความถี่สูงสุดของตัวเลข
        int maxIndex = 0; // ตัวแปรเก็บค่าของตัวเลขที่มีความถี่สูงสุด

        for (Map.Entry<Integer , List<Integer>> entry : map.entrySet()) { // วนลูปใน map เพื่อตรวจสอบแต่ละรายการ
            if (entry.getValue().size() > maxFrequency){ //ถ้าความถี่ของ entry นี้มากกว่า maxFrequency
                maxFrequency = entry.getValue().size(); // อัปเดต maxFrequency ด้วยความถี่ใหม่ที่มากกว่า
                maxIndex = entry.getKey(); // อัปเดต maxIndex ด้วยตัวเลขที่มีความถี่มากสุดในขณะนี้
            }
        }
        // แสดงผลตัวเลขที่มีความถี่สูงสุด (maxIndex) และตำแหน่งที่มันปรากฏในรูปแบบที่กำหนด
        System.out.printf("%d (%d) : %s\n", maxFrequency, maxIndex,
                map.get(maxIndex).toString());
    }

    /*สรุปการทำงาน:
        จัดเก็บตำแหน่งของตัวเลขแต่ละตัว: ใช้ HashMap เพื่อเก็บตำแหน่งที่พบของแต่ละตัวเลข โดยเก็บเป็น List ของตำแหน่ง
        ค้นหาค่าความถี่สูงสุด: ตรวจสอบความถี่ของแต่ละตัวเลข และเก็บค่าตัวเลขที่มีความถี่สูงที่สุดใน maxIndex และจำนวนครั้งที่พบใน maxFrequency
        แสดงผลลัพธ์: แสดงตัวเลขที่มีความถี่สูงสุดพร้อมตำแหน่ง*/
}
