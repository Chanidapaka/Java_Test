package sit.int202;

import lombok.*; //ตัวที่ช่วยทำ คือการเอาทุกอย่างไปทำให้ ตามฟิล

import java.util.Comparator;

//Lombok ช่วยทำ Mathod หมดเลย อยากได้อะไรก็ใส่ได้เลย
@Setter //คือตัวที่เราอยากได้จาก lombok
@Getter
@ToString //คือการไม่อยากได้
@AllArgsConstructor
@NoArgsConstructor

public class Student implements Comparable<Student> {
    private Integer id; //เก็บID
    private String name;  //เก็บชื่อ
    private Double gpax; //เก็บเกรด


    public static Comparator<Student> GPAX_NAME_comparator = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            double x1 = s1.getGpax();
            double x2 = s2.getGpax();
            if (x1 != x2) {
                if (x1 > x2) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return s1.getName().compareTo(s1.getName());
            }
        }
    };

        @Override
        public int compareTo(Student o) {
            return -(this.id - o.id);
        }

}
