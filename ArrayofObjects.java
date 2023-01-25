class Student{
    int id;
    String name;
    int marks;
}
public class ArrayofObjects{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Pooja";
        s1.marks = 99;
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Ilu";
        s2.marks = 99;
        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Manpreet";
        s3.marks = 99;

        Student studentArray[] = new Student[3];
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;

        for(Student stud : studentArray){
            System.out.println(stud.id + " : "+stud.name + " : "+stud.marks);
        }
    }
}