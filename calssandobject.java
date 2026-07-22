class Student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    Student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Dept:"+dept);
        System.out.println("Section:"+section);
        System.out.println("Year:"+year);
        System.out.println();
    }
}
public class Main{
    public static void main (String[] args){
    Student[]student=new Student[3];
    Student s1=new Student(105,"arun","ECE","B",4);
    student[0]=s1;
    Student s2=new Student(103,"anbu","CSE","C",3);
    student[1]=s2;
    student[2]=new Student(104,"aravindh","IT","A",2);
    for (int i=0;i<student.length;i++){
        student[i].display();
    }
}
}
