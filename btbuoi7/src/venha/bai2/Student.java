package venha.bai2;

public class Student {
    private String id;
    private String name;
    private double score;
    private int age;
    private String email;
    private String className;
    private String address;

    public Student(String id, String name, double score, int age, String email, String className, String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.email = email;
        this.className = className;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void getGrade(){
        System.out.print("diem thang 4 la :");
        if(getScore() >= 8){
            System.out.print("A");
        } else if (getScore() >= 6) {
            System.out.print("B");
        } else if (getScore() >=4) {
            System.out.print("C");
        }else{
            System.out.print("D");
        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
