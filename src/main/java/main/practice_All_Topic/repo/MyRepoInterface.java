package main.practice_All_Topic.repo;

import main.practice_All_Topic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MyRepoInterface extends JpaRepository<User,Long> {


}
