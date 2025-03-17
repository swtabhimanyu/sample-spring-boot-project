package com.example.demo.repo;

import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class Repo {

    public User getUser(String username){
        if(username.equals("abhimanyu")){
            log.info("User Abhimanyu");
            return new User(1,"abhimanyu","a@123");
        }
        else{
            log.info("User rahul");
            return new User(1,"rahul","r@123");
        }
    }
}
