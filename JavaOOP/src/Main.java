import model.Student;
import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) {
        // write your code here
        String studentName = "Blake";
        int studentAge = 123;
        String studentGender = "Male";
        int studentIdNum = 223;
        Student student = new Student(studentName, studentAge, studentGender, studentIdNum);
        System.out.println("Student values declared in constructor: \nName: "+studentName +"\nAge: "
                +studentAge+"\nGender: "+studentGender+"\nID Number: "+ studentIdNum+"\n");


        student.setStudentName("Kevin");
        student.setStudentAge(18);
        student.setStudentGender("Male");
        student.setStudentIdNum(231);
        studentName =student.getStudentName();
        studentAge =student.getStudentAge();
        studentGender =student.getStudentGender();
        studentIdNum= student.getStudentIdNum();
        System.out.println("Value after using method setters and getters:\nName: "+studentName+"\nAge: "
                +studentAge+"\nGender: "+studentGender+"\nID Number: "+studentIdNum+"\n");

        Field[] fields = Student.class.getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        System.out.println("Attributes of Student:");
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
            //System.out.println(fieldNames[i]); -> this can be use but to avoid errors below is more recommended
        }
        for (int j = 0; j < fieldNames.length; j++) {
            System.out.println(fieldNames[j]);

        }


    }
    }