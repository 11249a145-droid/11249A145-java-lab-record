class Student
{
    String name;
    int rollNo;
    int marks;
    Student(String name,int rollNo,int marks)
{
this.name=name;
this.rollNo=rollNo;
this.marks=marks;
}
void display(){
    System.out.println("Student Name:"+name);
    System.out.println("Roll Number :"+rollNo);
    System.out.println("Marks       :"+marks);
    System.out.println("Grade       :"+CalculateGrade());
    System.out.println();
}
String CalculateGrade(){
    if(marks>=90)
        return "A";
    else if(marks>=75)
        return "B";
    else if(marks>=60)
        return "C";
    else if(marks>=40)
        return "F";
    else 
        return "F";
}
}
public class StudentDemo{
    public static void main(String[]args){
        Student s1=new Student("Rahul",101,92);
        Student s2=new Student("Priya",102,78);
        s1.display();
        s2.display();
    }
}