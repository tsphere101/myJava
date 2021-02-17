package myschool.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    /**
     * Student ID
     */
    private final int id;

    /**
     * Student's name
     */
    private String name = "";

    /**
     * Construct a student with default ID
     */
    public Student() /** Default constructor */
    {
        this.id = 0;
    }

    /**
     * Construct a student with specific id and name.
     * @param id the ID of the student
     * @param name the name of the student
     */
    public Student(int id, String name) /** Construct with defined id and name */
    {
        this.id = id;
        this.name = name;
    }

    /**
     * 
     * 
     * 
     * Accessors
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * Modifiers
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * Logging method
     */
    public void log() {
        /* TODO Print out the informations */
    }

}
