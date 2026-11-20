public class Teacher extends Person{

    protected String subject;

    public Teacher(String name){
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("I am a teacher");
    }
}
