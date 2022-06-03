package com.krishna.nlp2;

import com.krishna.nlp2.restobject.Videos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VideoLinkController {
@GetMapping("/videos")
    public Videos getVideos(){
    return null;
}
}
