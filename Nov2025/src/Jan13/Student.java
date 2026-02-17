package Jan13;

public class Student {

    private String name;
    private int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    private void show(){
        System.out.println("Student name is : " + name + "and roll num is : " + roll_no);
    }

    public String getName(){
        return name;
    }
    public int getRoll_no(){
        return roll_no;
    }
}
