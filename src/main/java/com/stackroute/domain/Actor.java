package com.stackroute.domain;

public class Actor {

    private String actorName;
    private  String actorGender;
    private  int actorAge;

    public Actor() {
    }

    public Actor(String actorName, String actorGender, int actorAge) {
        this.actorName = actorName;
        this.actorGender = actorGender;
        this.actorAge = actorAge;
    }


/*
    public void setActorName(String actorName) { this.actorName = actorName; }
    public void setActorGender(String actorGender) { this.actorGender = actorGender; }
    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }
*/

    public String getActorName() { return actorName; }
    public String getActorGender() { return actorGender; }
    public int getActorAge() { return actorAge; }
}
