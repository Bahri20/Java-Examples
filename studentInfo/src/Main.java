import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali","fzk");
        Teacher t2= new Teacher("Ayla","bio");
        Teacher t3= new Teacher("fatih","mat");

        Course fizik=new Course("fizik","101","fzk",t1);
        fizik.addTeacher(t1);
        Course biyoloji=new Course("biyoloji","102","bio",t2);
        biyoloji.addTeacher(t2);
        Course matematik=new Course("matematik","103","mat",t3);
        matematik.addTeacher(t3);

        Student s1= new Student("bahri","hazırlık","01",fizik,biyoloji,matematik);{
            s1.addExamNote(100,75,25);
            s1.isPass();

        }



















    }
}