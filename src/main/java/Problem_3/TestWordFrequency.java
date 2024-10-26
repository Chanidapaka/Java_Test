package Problem_3;

import Problem_3.WordFrequency;

import java.util.List;
import java.util.Map;

public class TestWordFrequency {
    public static void main(String[] args) {
        // สร้าง instance ของ WordFrequency
        WordFrequency wordFrequency = new WordFrequency();

        // ระบุไฟล์ที่ต้องการทดสอบ
        String filename = "C:/Aom_020/Java/demo1_13082024/src/main/java/Problem_3/data";

        // คำนวณความถี่และตำแหน่งของคำ
        Map<String, List<Integer>> wordPositions = wordFrequency.calculateWordFrequencyWithPositions(filename);

        // แสดงผลตามรูปแบบที่กำหนด
        wordFrequency.displaySortedWordFrequency(wordPositions);

    }
}
