public class Student {
    private int studentId;
    private String name;
    private String dob;
    private String gender;
    private String phone;
    private String classId;

    public Student(int studentId, String name, String dob, String gender, String phone, String classId) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.classId = classId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getClassId() {
        return classId;
    }

    @Override
    public String toString() {
        return studentId + ", " + name + ", " + dob + ", " + gender + ", " + phone + ", " + classId;
    }
}
