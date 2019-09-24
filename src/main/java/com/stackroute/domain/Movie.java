package com.stackroute.domain;

public class Movie {
  Actor actorInfo;


    public void setActorInfo(Actor actorInfo) {
        this.actorInfo = actorInfo;
    }

    public void displayMovieInfo(){
        System.out.println("actorName = " + actorInfo.getActorName()+" "+ "actorGender = " + actorInfo.getActorGender() +" "
               + "actorAge = " + actorInfo.getActorAge());
    }
}
