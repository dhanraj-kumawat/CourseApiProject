package com.example.CourseApiApp.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{ // model class(Topic) and primaray key (id) datatype
}
