package com.example.CourseApiApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;

    // map
    @RequestMapping("/topics") //by default get method
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/{id}") //{} variable part in uri // now id should be passed in function use pathvariable for this
    // eg: localhost:8081/topics/102
    public Topic getTopic( @PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public String addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
        return "Topic Added Sucessfully";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
        return  "topic updated Sucessfully";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public String deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
        return "Topic deleted sucessfully";
    }
}
