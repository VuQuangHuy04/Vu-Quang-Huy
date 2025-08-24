package venha.bai3;

public interface StudentManagerInterface {
    public void sortByScoreDesc();
    public void sortByScoreAsc();
    public Student findByName(String name);
    void printStudents();
}
