class Student {
    private int id;

    public void display() {
        System.out.println("Student details");
    }
}

public class Main {
    public static void main(String[] args) {

        Class<?> c = Student.class;

        System.out.println("Class Name: " + c.getName());

        System.out.println("Methods:");
        for (var m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }
}