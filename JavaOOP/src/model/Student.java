package model;

public class Student {
    private String studentName;
    private int studentAge;
    private String studentGender;
    private int studentIdNum;

    public Student(String studentName, int studentAge, String studentGender, int studentIdNum) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdNum = studentIdNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentIdNum() {
        return studentIdNum;
    }

    public void setStudentIdNum(int studentIdNum) {
        this.studentIdNum = studentIdNum;
    }
}
