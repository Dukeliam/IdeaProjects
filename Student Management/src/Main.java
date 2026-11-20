public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Williams", 23, 89);
        Student student2 = new Student("David", 19, 90);

        student1.setScore(95);
        student1.setScore(500);

        System.out.println(student1.getScore());
    }
}
