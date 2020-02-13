package com.example.architectureexample.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private  int id;

    private  int priority;
    private  String title;
    private  String description;

    public Note(int priority, String title, String description) {
        this.priority = priority;
        this.title = title;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public void setId(int id) {
        this.id = id;
    }
}
