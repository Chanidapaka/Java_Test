package sit.int202;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        Set<Student> s1 = new HashSet<Student>(); // ใช้ HashSet สำหรับเก็บข้อมูล Student แบบไม่ซ้ำ
        Set<Student> s2 = new TreeSet<>(Student.GPAX_NAME_comparator); // ใช้ TreeSet สำหรับเก็บและเรียงลำดับด้วย Comparator

        // เพิ่ม Student พร้อมกำหนด id, name, และ gpax
        s1.add(new Student(10001, "Somsri", 3.25));
        s1.add(new Student(10002, "Somsak", 3.00));
        s1.add(new Student(10009, "Somchai", 3.26));
        s1.add(new Student(10007, "Somsiri", 3.25));
        s1.add(new Student(10037, "Sirisopaphan", 3.25));

        // เพิ่มข้อมูลจาก HashSet s1 ไปยัง ArrayList สำหรับการเรียงลำดับ
        List<Student> studentsList = new ArrayList<>();
        for (Student s : s1){
            studentsList.add(s);
        }

        // เรียงลำดับ StudentList ตาม Comparator
        Collections.sort(studentsList, Student.GPAX_NAME_comparator);

        s2.add(new Student(10001, "Somsri", 3.25));
        s2.add(new Student(10002, "Somsak", 3.00));
        s2.add(new Student(10009, "Somchai", 3.26));
        s2.add(new Student(10007, "Somsiri", 3.25));
        s2.add(new Student(10037, "Sirisopaphan", 3.25));

        // แสดงข้อมูลที่เรียงจาก TreeSet
        System.out.println("-------------------");
        System.out.println(" Tree Set ");
        System.out.println("-------------------");
        s2.forEach(s-> System.out.printf("%5d %-13s %6.2f\n",
                s.getId(), s.getName(), s.getGpax()));
        System.out.println("-------------------");

        // แสดงข้อมูลที่เรียงจาก ArrayList
        System.out.println(" From List");
        System.out.println("-------------------");
        studentsList.forEach(s-> System.out.printf("%5d %-13s %6.2f\n",
                s.getId(), s.getName(), s.getGpax()));
    }
    }

