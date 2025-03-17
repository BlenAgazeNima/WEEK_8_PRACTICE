package edu.rit.week_8_again.CONTROLLER;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appController {
    private StudentService ss;
    public appController(StudentService ss){
        this.ss=ss;
    }
    @GetMapping("/students")
    public String getStudent(Model m){
        var s=ss.findStudents();
        m.addAttribute("students",s);
        return "students";
    }



    @PostMapping("/students")

    public String postStudents(Student s,Model m){
        ss.addStudents(s);
        var students=ss.findStudents();
        m.addAttribute("students",students);
        return "students";
    }
}
