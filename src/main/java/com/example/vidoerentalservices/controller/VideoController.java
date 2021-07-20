package com.example.vidoerentalservices.controller;

import com.example.vidoerentalservices.model.Video;
import com.example.vidoerentalservices.service.VideoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideoController {



    @PostMapping("/video")
    public ResponseEntity<?> video(@RequestBody Video video){

return  new ResponseEntity<>(HttpStatus.OK);
    }
}
