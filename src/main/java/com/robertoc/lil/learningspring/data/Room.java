package com.robertoc.lil.learningspring.data;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long room_id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String room_number;
    @Column(name="BED_INFO")
    private String bed_info;

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long id) {
        this.room_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getBed_info() {
        return bed_info;
    }

    public void setBed_info(String bed_info) {
        this.bed_info = bed_info;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + room_id +
                ", name='" + name + '\'' +
                ", room_number='" + room_number + '\'' +
                ", bed_info='" + bed_info + '\'' +
                '}';
    }
}
