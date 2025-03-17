package edu.rit.week_8_again.CONTROLLER;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> s=new ArrayList<Student>();

    public List<Student> findStudents(){
        return s;
    }
   public void addStudents(Student student){
       s.add(student);
   }

}
