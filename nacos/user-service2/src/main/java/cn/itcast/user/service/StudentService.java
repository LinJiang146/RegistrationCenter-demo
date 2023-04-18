package cn.itcast.user.service;

import cn.itcast.user.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public String getEnglish(String name){
        return studentMapper.getEnglishByName(name);
    }
}
