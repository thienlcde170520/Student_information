package controller;

import common.Library;
import java.util.ArrayList;
import model.Student;
import Repository.IStudentRepository;
import Repository.StudentRepository;

import view.Menu;

public class StudentManager extends Menu<String>{
    static String[] mc = {"Manager student information", "Exit"};
    
    private Library library;
    private IStudentRepository studentRepository;
    
    ArrayList<Student> students = new ArrayList<>();
    
    public StudentManager() {
        super("====== Collection Sort Program ======", mc);
        library = new Library();
        studentRepository = new StudentRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                studentRepository.display();
                break;
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
}