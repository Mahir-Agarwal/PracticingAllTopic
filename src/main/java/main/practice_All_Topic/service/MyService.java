package main.practice_All_Topic.service;

import main.practice_All_Topic.entity.User;
import main.practice_All_Topic.repo.MyRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private MyRepoInterface myRepo;


    public User saveUser(User user) {

       myRepo.save(user);
        return user;
    }

    public User findById(Long id) {

        return myRepo.findById(id).get();
    }

    public List<User> findAll() {
        return myRepo.findAll();
    }

    public User updateUser(User user , Long id ) {
        User user1 = myRepo.findById(id).get();
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        user1.setEmail(user.getEmail());
        return myRepo.save(user1);
    }

    public void deleteUser(Long id) {
        myRepo.deleteById(id);
    }
}
