public class Student {

    private String name;
    private int age;
    private int score;

   public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void displayDetail(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }

    public boolean hasPassed(){
        return score >= 50;
   }
}
