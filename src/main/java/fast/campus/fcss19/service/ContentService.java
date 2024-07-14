package fast.campus.fcss19.service;

import fast.campus.fcss19.domain.Content;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {
    @PreFilter("filterObject.owner == authentication.name")
    public List<Content> searchContents(List<Content> contents) {
        return contents;
    }

    @PostFilter("filterObject.owner == authentication.name")
    public List<Content> searchContentsV2() {
        List<Content> allContents = new ArrayList<>();
        allContents.add(new Content("최강야구", "danny.kim"));
        allContents.add(new Content("오펜하이머", "danny.kim"));
        allContents.add(new Content("돌풍", "danny.kim"));
        allContents.add(new Content("나는솔로", "danny.kim"));
        allContents.add(new Content("눈물의여왕", "steve.kim"));
        allContents.add(new Content("태어난 김에 세계일주", "steve.kim"));
        allContents.add(new Content("이태원 클라쓰", "steve.kim"));
        return allContents;
    }
}
