
package Data;

import common.Library;
import java.util.ArrayList;
import java.util.Collections;
import model.Student;


public class StudentDao {
    private Library library;
    public StudentDao(){
    library = new Library();
    }
    private static StudentDao instance = null;
    public static StudentDao Instance(){
        if(instance == null){
            synchronized (StudentDao.class){
                if(instance == null){
                    instance = new  StudentDao();
                }
            }
        }
        return instance;
    }
    
    public void addStudent(ArrayList<Student> students) {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = library.inputString();
        System.out.print("Classes: ");
        String classes = library.inputString();
        System.out.print("Mark: ");
        float mark = library.checkInputFloat();
        students.add(new Student(name,classes,mark));
    }

    public void print(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(students);
        for (int i = 1; i < students.size(); i++) {
            System.out.println("--------Student " + i + "--------");
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Classes: " + students.get(i).getClasses());
            System.out.println("Mark: " + students.get(i).getMark());
        }
    }

    public void display() {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (library.checkInputYN()) {
                addStudent(students);
            } else {
                break;
            }
        }
        print(students);
    }
}
