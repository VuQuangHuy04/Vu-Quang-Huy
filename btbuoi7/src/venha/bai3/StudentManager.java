package venha.bai3;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager implements StudentManagerInterface{
       private ArrayList<Student> list = new ArrayList<>();

    public StudentManager(ArrayList<Student> list) {
        this.list = list;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void printStudents(){
        System.out.printf("%-5s | %-10s | %-3s | %-20s | %-7s | %-10s | %-5s | %-5s\n",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        for (Student s : list) {
            System.out.printf("%-5s | %-10s | %-3d | %-20s | %-7s | %-10s | %-5.2f | %-5s\n",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(),
                    s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
        }
      }
       @Override
       public void sortByScoreDesc(){
             list.sort(Comparator.comparingDouble(Student::getScore).reversed());
             printStudents();
       }

    @Override
    public void sortByScoreAsc() {
        list.sort(Comparator.comparingDouble(Student::getScore));
        printStudents();
    }
    @Override
    public Student findByName(String name){
        for(Student s : list){
            if(s.getName().equalsIgnoreCase(name)){
                return s;
            }
        }
        return null;
    }
}
