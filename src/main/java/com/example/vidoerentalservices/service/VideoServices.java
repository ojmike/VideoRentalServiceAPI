package com.example.vidoerentalservices.service;

import com.example.vidoerentalservices.model.Video;
import org.springframework.stereotype.Service;

@Service
public interface VideoServices {
    Video video(Video video);
}
