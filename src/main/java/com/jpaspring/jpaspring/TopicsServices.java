package com.jpaspring.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicsServices {

    @Autowired
    private TopicRepository topicRepository;

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public Optional<Topic> getTopic(int id) {
        return topicRepository.findById(id);
    }

    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public void updateTopic(int id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);
    }
}
