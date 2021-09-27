package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Boris", "history");
        Student student = new Student("Anton");
        teacher.evaluate(student);
    }
}
