package edu.rit.week_8_again.CONTROLLER;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
    private StudentService ss;
    @GetMapping("/students")
    public String getStudent(Model m){
        var s=ss.findStudents();
        m.addAttribute("students",s);
        return "students";
    }
}
