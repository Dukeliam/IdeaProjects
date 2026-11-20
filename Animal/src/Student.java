public class Student extends Person {

    protected String subject;

    public Student(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("I am a student");
    }
}
