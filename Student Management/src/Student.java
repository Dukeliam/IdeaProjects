public class Student {

    private String name;
    private int age;
    private int score;

    public Student (String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void study() {
        System.out.println("Student is studying");
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public void setScore(int newScore) {
        if (newScore >= 0 && newScore <= 100) {
            score = newScore;
        } else {
            System.out.println("Invalid Score");
        }
    }

    public int getScore() {
        return score;
    }
}
