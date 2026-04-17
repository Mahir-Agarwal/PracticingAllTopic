package main.practice_All_Topic.controller;

import main.practice_All_Topic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import main.practice_All_Topic.service.MyService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
    MyService myService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){

        return  myService.saveUser(user);
    }

    @GetMapping("/finduser/{id}")
    public User findUserById(@PathVariable("id") Long id){

        return myService.findById(id);
    }

    @GetMapping("/findall")
    public List<User> findAll(){
        return myService.findAll();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") long id  , @RequestBody User user){
        return myService.updateUser(user ,id);
    }

    @DeleteMapping("/del/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        myService.deleteUser(id);
    }


}
