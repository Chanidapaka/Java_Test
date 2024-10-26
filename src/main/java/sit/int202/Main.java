package sit.int202;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); //สร้าง Object ของ Student
        System.out.println(s1.getId()); //แสดงผลออกมา

        s1.setId(1234); //lombok เขียนให้
        s1.setName("Aom");
        s1.setGpax(3.98);
        System.out.println(s1);

    }
}