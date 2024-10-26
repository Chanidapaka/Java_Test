package sit.int202;

import lombok.*; //ตัวที่ช่วยทำ คือการเอาทุกอย่างไปทำให้ ตามฟิล

import java.util.Comparator;

//เอาไฟล์นี้ ไป RUN ในไฟล์ TestComparator
//Lombok ช่วยทำ Mathod หมดเลย อยากได้อะไรก็ใส่ได้เลย
@Setter
@Getter
@ToString
@AllArgsConstructor //สร้างคอนสตรัคเตอร์ (Constructor) ที่มีพารามิเตอร์ครบทุกฟิลด์
@NoArgsConstructor //สร้างคอนสตรัคเตอร์แบบไม่มีพารามิเตอร์

//การประกาศคลาส
public class Student implements Comparable<Student> { //Comparable ใช้เปรียบเทียบ
    private Integer id;
    private String name;
    private Double gpax;

   //Comparator สำหรับเรียงลำดับโดย GPAX และชื่อ
    public static Comparator<Student> GPAX_NAME_comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) { //เป็นเมธอดที่ใช้เปรียบเทียบ gpax ของนักเรียนทั้งสองคน
            double x1 = s1.getGpax();
            double x2 = s2.getGpax();
            if (x1 != x2) {
                if (x1 > x2) { //ถ้า gpax ของ s1 มากกว่า s2 จะคืนค่า -1 (บอกว่า s1 มาก่อน)
                    return -1;
                } else {   //ถ้า gpax ของ s1 น้อยกว่า s2 จะคืนค่า 1 (บอกว่า s2 มาก่อน)
                    return 1;
                }
            } else {
                return s1.getName().compareTo(s2.getName()); //ถ้า gpax เท่ากัน จะใช้การเปรียบเทียบจาก name แทน โดยเรียงตามลำดับตัวอักษร
            }
        }
    };

    //เมธอด compareTo สำหรับเปรียบเทียบตาม id
        @Override
        public int compareTo(Student o) {
            return -(this.id - o.id); //ใช้การลบเพื่อทำให้เรียงจากมากไปหาน้อย
        }
}
