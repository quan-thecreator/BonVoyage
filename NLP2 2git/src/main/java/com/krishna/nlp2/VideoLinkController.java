package com.krishna.nlp2;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.ResourceId;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Thumbnail;
import com.krishna.nlp2.restobject.Videos;
import com.krishna.nlp2.utilsClases.YoutubeInterfacer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController

public class VideoLinkController {
@GetMapping("/videos")
    public Videos getVideos(@RequestParam(name = "topic", defaultValue = "mars")String topic){
    List<SearchResult> searchResuls = YoutubeInterfacer.getVideos(topic);

    Iterator<SearchResult> iteratorSearchResults = searchResuls.iterator();
    int counter =0;
    String[] hopeFullyLinks = new String[2];
    while (iteratorSearchResults.hasNext()) {
        if(counter==hopeFullyLinks.length)break;
        SearchResult singleVideo = iteratorSearchResults.next();
        ResourceId rId = singleVideo.getId();

        // Double checks the kind is video.
        if (rId.getKind().equals("youtube#video")) {
            Thumbnail thumbnail = (Thumbnail) singleVideo.getSnippet().getThumbnails().get("default");
            hopeFullyLinks[counter] = singleVideo.getSnippet().getTitle();

            counter++;
        }
    }

    return new Videos(hopeFullyLinks);
}
}
