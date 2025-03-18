public class Teacher {
    private String teacherId;
    private String name;
    private String dob;
    private String gender;
    private String phone;

    public Teacher() {
    }

    public Teacher(String teacherId, String name, String dob, String gender, String phone) {
        this.teacherId = teacherId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone;
    }
}
