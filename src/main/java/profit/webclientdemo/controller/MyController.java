package profit.webclientdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import profit.webclientdemo.service.ContentService;
import profit.webclientdemo.service.Post;
import reactor.core.publisher.Mono;

@RestController
public class MyController {

    private final ContentService contentService;

    MyController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/posts/{id}")
    public Mono<Post> getPost(@PathVariable int id) {
        return contentService.getPost(id);
    }
}