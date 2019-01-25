package com.stackroute.didemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private int id;
    private String title;
    @Autowired
    private Actor actor;

    public Movie() {
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Movie(int id, String title, Actor actor) {
        this.id = id;
        this.title = title;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", actor=" + actor +
                '}';
    }
}
