
package Repository;

import java.util.ArrayList;
import model.Student;

public interface IStudentRepository {
    void addStudent(ArrayList<Student> students);
    
    void print(ArrayList<Student> students);
    
    void display();
    
}
