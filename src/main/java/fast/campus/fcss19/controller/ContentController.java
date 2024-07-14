package fast.campus.fcss19.controller;

import fast.campus.fcss19.domain.Content;
import fast.campus.fcss19.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;

    @GetMapping("/api/v1/contents")
    public List<Content> getContents() {
        List<Content> allContents = new ArrayList<>();
        allContents.add(new Content("최강야구", "danny.kim"));
        allContents.add(new Content("오펜하이머", "danny.kim"));
        allContents.add(new Content("돌풍", "danny.kim"));
        allContents.add(new Content("나는솔로", "danny.kim"));
        allContents.add(new Content("눈물의여왕", "steve.kim"));
        allContents.add(new Content("태어난 김에 세계일주", "steve.kim"));
        allContents.add(new Content("이태원 클라쓰", "steve.kim"));
        return contentService.searchContents(allContents);
    }

    @GetMapping("/api/v2/contents")
    public List<Content> getContentsV2() {
        return contentService.searchContentsV2();
    }
}
