package cn.itcast.user.web;

import cn.itcast.user.mapper.StudentMapper;
import cn.itcast.user.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{name}")
    public String getEnglish(@PathVariable("name") String name){
        return studentService.getEnglish(name);
    }
}
