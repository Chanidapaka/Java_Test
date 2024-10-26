package sit.int202;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.Size2DSyntax;
import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        Set<Student> s1= new HashSet<Student>();
        Set<Student> s2= new TreeSet<>(Student.GPAX_NAME_comparator);
        s1.add(new Student(10001,"Somsri",3.25 ));
        s1.add(new Student(10002,"Somsak",3.00 ));
        s1.add(new Student(10009,"Somchai",3.26 ));
        s1.add(new Student(10007,"Somsri",3.25 ));
        s1.add(new Student(10037,"Sirisopaphan",3.25 ));
        s1.add(new Student(10097,"Somsri",3.25 ));
        List<Student> StudentList = new ArrayList<>();
        for (Student s : s1) {
            StudentList.add(s);
        }
       Collections.sort (StudentList, Student.GPAX_NAME_comparator); //เอามาเรียงกัน

        s2.add(new Student(10001,"Somsri",3.25 ));
        s2.add(new Student(10002,"Somsak",3.00 ));
        s2.add(new Student(10009,"Somchai",3.26 ));
        s2.add(new Student(10007,"Somsri",3.25 ));
        s2.add(new Student(10037,"Sirisopaphan",3.25 ));
        s2.add(new Student(10097,"Somsri",3.25 ));
        s2.forEach(s-> System.out.printf("%5d %-13s %6.2f\n",
             s.getId(), s.getName(), s.getGpax()));
        System.out.println("--------------------------");
        System.out.println(" From List");
        StudentList.forEach(s-> System.out.printf("%5d %-13s %6.2f\n",
                s.getId(),s.getName(), s.getGpax()));
    }
    }

