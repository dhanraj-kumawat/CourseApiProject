package com.example.CourseApiApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    // array.asList is immutable make arraylist for mutable list
    @Autowired
    TopicRepository topicRepository;  // database using darby and jpa

    // singleton topics list as simple db
//        private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("101", "Java-8" , " core java and java 8 features"),
//                new Topic("102", "DSA", "Complete Data Structure and algorithms"),
//                new Topic("103", "cloud", "Amazon web services, cloud security")
//        ));

    public List<Topic> getTopics() {
// getting from singleton topics
//        return topics;

        // getting from db
        // new local var. topics
        List<Topic> topics = new ArrayList<>();
       topicRepository.findAll().forEach(topics::add);
       return topics;
   }


   public  Topic getTopic(String id){

//        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();

       // from db using jpa
       Topic tempTopic = new Topic();
       tempTopic = topicRepository.findById(id).stream().findFirst().get();
       return tempTopic;
   }

   public void addTopic(Topic topic){
//        topics.add(topic);
//        return;

       // store in db
       topicRepository.save(topic);
   }

   public void updateTopic(String id, Topic topic){
        // access datat from db
//       for(int i = 0; i<topics.size(); i++){
//           Topic tempTopic = topics.get(i);
//           if(tempTopic.getId().equals(id)){
//               topics.set(i, topic); //replace item in the list
//               return;
//           }
//       }
       // from db
      topicRepository.save(topic); // because id is primary key
   }

   public void deleteTopic(String id){
        // from singleton list of objects
//        for(int i = 0; i<topics.size(); i++){
//            Topic tempTopic = topics.get(i);
//            if(tempTopic.getId().equals(id)){
//                topics.remove(i);
//                return;
//            }
//        }

       // from db
       topicRepository.deleteById(id); // id is primary key so unique
   }
}
