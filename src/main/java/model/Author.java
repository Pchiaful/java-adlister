package model;

import java.io.Serializable;

public class Author implements Serializable {

    private int id;
    private String first_name;
    private String last_name;
    private long primary_key;

    public Author() {
    }

    public Author(int id, String first_name, String last_name, long primary_key) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.primary_key = primary_key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long getPrimary_key() {
        return primary_key;
    }

    public void setPrimary_key(long primary_key) {
        this.primary_key = primary_key;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", primary_key=" + primary_key +
                '}';
    }
}
