package io.github.shirohoo.realworld.application.content;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @GetMapping("/api/tags")
    public ListOfTagsResponse getTags() {
        List<String> tags = tagService.getTags();
        return new ListOfTagsResponse(tags);
    }
}
