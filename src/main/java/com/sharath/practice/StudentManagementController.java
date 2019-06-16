package com.sharath.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharath.practice.model.Student;

@RestController
public class StudentManagementController {

	List<Student> students = new ArrayList<Student>();
    {
        students.add(new Student("Sharath", "Btech", "Hyderabad"));
        students.add(new Student("Raviteja", "PG", "Nizamabad"));
        students.add(new Student("Shruthi", "Mtech", "Bangalore"));
    }
 
    @RequestMapping(value = "/students")
    public List<Student> getStudents() {
        return students;
    }
}
