package Problem_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    // คำนวณความถี่ของคำพร้อมตำแหน่งในไฟล์
    public Map<String, List<Integer>> calculateWordFrequencyWithPositions(String filename) {
        Map<String, List<Integer>> wordPositions = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int position = 1;

            // อ่านแต่ละบรรทัดในไฟล์และเก็บคำพร้อมตำแหน่ง
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordPositions.putIfAbsent(word, new ArrayList<>());
                    wordPositions.get(word).add(position);
                    position++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordPositions;
    }

    // จัดเรียงและแสดงผลคำตามความถี่จากน้อยไปมาก
    public void displaySortedWordFrequency(Map<String, List<Integer>> wordPositions) {
        // สร้าง Map สำหรับเก็บความถี่ของแต่ละคำ
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : wordPositions.keySet()) {
            wordFrequency.put(word, wordPositions.get(word).size());
        }

        // จัดเรียงตามความถี่ของคำจากน้อยไปมาก
        wordFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int freqCompare = entry1.getValue().compareTo(entry2.getValue());
                    if (freqCompare != 0) return freqCompare;  // เรียงตามความถี่ก่อน
                    return Integer.compare(wordPositions.get(entry1.getKey()).get(0), wordPositions.get(entry2.getKey()).get(0));
                })
                .forEach(entry -> {
                    String word = entry.getKey();
                    int frequency = entry.getValue();
                    List<Integer> positions = wordPositions.get(word);

                    System.out.print(word + "(" + frequency + "): ");
                    for (Integer pos : positions) {
                        System.out.print("@" + pos + " ");
                    }
                    System.out.println();
                });
    }
}
