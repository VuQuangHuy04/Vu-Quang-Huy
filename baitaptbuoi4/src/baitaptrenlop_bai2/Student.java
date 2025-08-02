package baitaptrenlop_bai2;
public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public static void main(String[] args) {
        Student student = new Student("Huy", 18);
        student.setName("Hehehe");
        student.setAge(20);
        System.out.println("new name: " + student.getName());
        System.out.println("new age: " + student.getAge());

    }
}
