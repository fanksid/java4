package practice08;

public class Klass {
    private int number;
    private Student student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        student.setLeader(true);
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }

}
