package Problem_2;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void findPairs(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>(); //ใช้ HashMap เพื่อเก็บค่าใน arr ที่เราผ่านไปแล้ว โดยเก็บเป็นคู่

        for (int i = 0; i < arr.length; i++){
            int complement = targetSum - arr[i]; //สำหรับแต่ละตัวเลขใน arr คำนวณค่า complement (ค่าที่จะทำให้ผลบวกเท่ากับ targetSum) โดยใช้ targetSum - arr[i]


            //ถ้า complement นี้เคยเจอใน HashMap แสดงว่าเราพบคู่ที่ผลรวมเท่ากับ targetSum แล้ว ให้พิมพ์ index ของทั้งคู่
            if (map.containsKey(complement)){
                System.out.println("(" + i +" , " + map.get(complement) + ")");
            }
            //เก็บค่า arr[i] และ index ลงใน HashMap
            map.put(arr[i], i); // เก็บค่าและตำแหน่งของตัวเลขในแผนที่
        }
    }
}
