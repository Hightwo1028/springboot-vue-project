package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // 允許的前端地址
public class StudentController {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @RequestMapping("/students")
    public String insert(@RequestBody Student student) {

        String sql = "INSERT INTO student(id, name) VALUES (:studentId, :studentName)";

        Map<String, Object> map = new HashMap<>();
        map.put("studentId", student.getId());
        map.put("studentName", student.getName());

        namedParameterJdbcTemplate.update(sql, map);



        return "執行 INSERT sql";
    }


//    @PostMapping("/students")
//    public String create(@RequestBody Student student) {
//        return "執行資料庫中的 Create 操作";
//    }
//
//    @GetMapping("/students/{studentId}")
//    public String read(@PathVariable Integer studentId) {
//        return "執行資料庫中的 Read 操作";
//    }
//
//    @PutMapping("/students/{studentId}")
//    public String update(@PathVariable Integer studentId, @RequestBody Student student) {
//        return "執行資料庫中的 Update 操作";
//    }
//
//    @DeleteMapping("/students/{studentId}")
//    public String delete(@PathVariable Integer studentId) {
//        return "執行資料庫中的 Delete 操作";
//    }
}
