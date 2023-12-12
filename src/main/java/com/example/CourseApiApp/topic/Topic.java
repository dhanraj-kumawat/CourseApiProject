package com.example.CourseApiApp.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    @Id
    private String id; //model class
    private String courseName;
    private String courseDescription;

    public Topic(){

    }
    // param constructor


    public Topic(String id, String courseName, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    //getters setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }



}
