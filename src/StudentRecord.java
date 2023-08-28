import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRecord {

    private final Map<String, Integer> studentRecordMap;

    public StudentRecord() {
        this.studentRecordMap = new HashMap<>();
    }

    public void addStudent (String name, Integer grade){
        this.studentRecordMap.put(name,grade);
        System.out.println("Added student");
    }

    public void removeStudent (String student){
        this.studentRecordMap.remove(student);
        System.out.println("removed student");
    }

    public int getGrade(String student){
        int grade = this.studentRecordMap.get(student);

        return grade;
    }

    public boolean isStudentInRecord(String student){
       boolean isStudent = this.studentRecordMap.containsKey(student);

       return isStudent;
    }

    public Set<String> toStudentSet(){
        return this.studentRecordMap.keySet();
    }

    public boolean isGradeInRecord(int grade){
        return this.studentRecordMap.containsValue(grade);
    }


}
