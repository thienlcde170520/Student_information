
package Repository;

import Data.StudentDao;
import java.util.ArrayList;
import model.Student;


public class StudentRepository implements IStudentRepository{
    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(ArrayList<Student> students) {
        StudentDao.Instance().addStudent(students);
    }

    @Override
    public void print(ArrayList<Student> students) {
        StudentDao.Instance().print(students);
    }

    @Override
    public void display() {
        StudentDao.Instance().display();
    }
}