package com.example.project;

import com.example.project.classes.PostJson;
import com.example.project.domain.Message;
import com.example.project.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private MessageRepo messageRepo;

    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<PostJson> add(@RequestBody PostJson postJson) {

        Message message = new Message(postJson.getName(), postJson.getPassword());
        messageRepo.save(message);

        List<Message> messageList = messageRepo.findByName("roman");

        return new ResponseEntity<PostJson>(HttpStatus.OK);
    }

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ResponseEntity<PostJson> info(@RequestBody PostJson postJson) {


        return new ResponseEntity<PostJson>(HttpStatus.OK);
    }









}

