package com.in28minutes.springboot.learnspringboot;

public class Course {
    long courseId;
    String courseName;
    String author;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public Course(long courseId, String courseName, String author) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }



}
