package com.teachmeskill.taskonlesson;

public class Office {

    private int rooms;
    private int floors;
    private int collaborators;
    private int developers;

    public Office(int rooms , int floors, int collaborators, int developers){
        this.rooms = rooms;
        this.floors = floors;
        this.collaborators = collaborators;
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Office{" +
                "rooms=" + rooms +
                ", floors=" + floors +
                ", collaborators=" + collaborators +
                ", developers=" + developers +
                '}';
    }
}
