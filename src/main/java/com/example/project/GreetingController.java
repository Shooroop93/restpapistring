package com.example.project;

import com.example.project.classes.PostJson;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @RequestMapping(value = "/")
    public ResponseEntity<PostJson> get() {
        PostJson postJson = new PostJson();
        postJson.setName("Roman");
        postJson.setPassword("qwerty");

        return new ResponseEntity<PostJson>(postJson, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<PostJson> update(@RequestBody PostJson postJson) {

       /*
       Сюда прописать логику для добавления в бд данных
        */

        return new ResponseEntity<PostJson>(HttpStatus.OK);
    }





}

