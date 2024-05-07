package profit.webclientdemo.service;

import reactor.core.publisher.Mono;

public interface ContentService {
    public Mono<Post> getPost(int id);
}
