package profit.webclientdemo.service;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Post {
    Integer userId;
    Integer id;
    String title;
    String body;
}