package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ApiController {

    // 简单的用户类定义（内部类）
    static class User {
        private Long id;
        private String name;
        private String email;
        
        public User() {}
        
        public User(Long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
        
        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot!");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("status", "success");
        response.put("version", "1.0");
        return response;
    }

    @GetMapping("/status")
    public Map<String, Object> status() {
        Map<String, Object> response = new HashMap<>();
        response.put("application", "Spring Boot Demo Application");
        response.put("status", "RUNNING");
        response.put("environment", "Kubernetes");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("health", "OK");
        return response;
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Spring Boot Demo");
        response.put("description", "A simple Spring Boot application for demonstration");
        response.put("technology", "Spring Boot, Java, Kubernetes");
        response.put("author", "Your Name");
        response.put("created", "2025");
        return response;
    }
    // 用户相关端点
    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "张三", "zhangsan@example.com"));
        users.add(new User(2L, "李四", "lisi@example.com"));
        users.add(new User(3L, "王五", "wangwu@example.com"));
        return users;
    }
    
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        // 模拟保存用户，这里只是返回接收到的用户数据
        user.setId(100L); // 模拟生成ID
        return user;
    }

    // 新增计算端点
    @GetMapping("/calculate/{a}/{b}")
    public Map<String, Object> calculate(
        @PathVariable int a, 
        @PathVariable int b) {
        
        Map<String, Object> result = new HashMap<>();
        result.put("addition", a + b);
        result.put("subtraction", a - b);
        result.put("multiplication", a * b);
        result.put("timestamp", LocalDateTime.now().toString());
        
        return result;
    }

    // 简单的数学运算
    @GetMapping("/math/square/{number}")
    public Map<String, Object> square(@PathVariable int number) {
        Map<String, Object> result = new HashMap<>();
        result.put("number", number);
        result.put("square", number * number);
        result.put("squareRoot", Math.sqrt(number));
        result.put("timestamp", LocalDateTime.now().toString());
        return result;
    }    
}