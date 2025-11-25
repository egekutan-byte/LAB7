public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Ege",18);
        student.printStudentInfo();
    }
}
class Student {
    public String name;
    public int age;
    public Student(String name, int age){//parameterized constructor
        this.name = name;
        this.age = age;
    }
    public Student(){//default constructor
        this.name = "none";
        this.age = 67;
    }
    
    public void printStudentInfo(){
        System.out.println(name);
        System.out.println(age);
    }


}
/*3.1-)since ı assign the values of ege to string and 18 to int ı have the result like this: Ege
                                                                                           18   */
//3.2-)NO ERRORS


/*4-)There are 2 parameters in the public Student constructor thats why there
are no errors in the main method otherwise would have a "no arguments found" error.*/
