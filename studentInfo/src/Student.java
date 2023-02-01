public class Student {
    String name;
    String classes;
    String stNo;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    Student(String name,String classes, String stNo,Course c1,Course c2, Course c3){
        this.name=name;
        this.avarage=0.0;
        this.classes=classes;
        this.stNo=stNo;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.isPass=false;
    }
    void addExamNote(int note1,int note2, int note3){
        if(note1>0&& note1<=100){
            this.c1.note=note1;
        }
        if(note2>0&& note2<=100){
            this.c2.note=note2;
        }
        if(note3>0&& note3<=100){
            this.c3.note=note3;
        }
    }

    void isPass(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>=50){
            System.out.println("tebrikler sınıfı geçtiniz!");
            this.isPass=true;
        }else {
            System.out.println("sınıfta kaldınız!");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name +" "+ this.c1.note);
        System.out.println(this.c2.name +" "+ this.c2.note);
        System.out.println(this.c3.name +" "+ this.c3.note);
        System.out.println("ortalamanız: "+ this.avarage);
    }


}
