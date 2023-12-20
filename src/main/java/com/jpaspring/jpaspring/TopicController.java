package com.jpaspring.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicsServices topicsServices;

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return topicsServices.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable int id) {

        return topicsServices.getTopic(id);
    }

    @PostMapping("/topics/add")
    public void addTopic(@RequestBody Topic topic) {
        topicsServices.addTopic(topic);
    }

    @PutMapping("/topics/update/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id) {

        topicsServices.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/delete/{id}")
    public void deleteTopic(@PathVariable int id) {
        topicsServices.deleteTopic(id);
    }
}
