import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = Arrays.stream(marks).sum();
        this.average = total / (double) marks.length;
    }
    public String toString() {
        return name + " | Total: " + total + " | Average: " + average;
    }
}

public class Studentsort{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", new int[]{80, 90, 85}));
        students.add(new Student("Bob", new int[]{70, 75, 80}));
        students.add(new Student("Charlie", new int[]{95, 85, 88}));
        students.sort(Comparator.comparingInt(s -> s.total));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
