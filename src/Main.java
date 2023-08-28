import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();

        studentRecord.addStudent("Gonzalo", 10);
        studentRecord.addStudent("Damian", 6);
        studentRecord.addStudent("Juli", 9);

        System.out.println("the Juli grade is: " +  studentRecord.getGrade("Juli"));

        studentRecord.removeStudent("Damian");

        System.out.println("is Damian in record? " + studentRecord.isStudentInRecord("Damian"));

        Set<String> studentSet = studentRecord.toStudentSet();

        System.out.println(studentSet.contains("Gonzalo"));

        System.out.println("is ten in record ? "+ studentRecord.isGradeInRecord(5));
    }
}