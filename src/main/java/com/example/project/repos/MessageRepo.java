package com.example.project.repos;

import com.example.project.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository <Message, Long> {

    List<Message> findByName(String name);
    List<Message> findByPassword(String password);
    List<Message> findByToken(String token);
}
