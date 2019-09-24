package com.stackroute.domain;

public class Movie {
  Actor actor;



    public Movie(Actor actor) {
        this.actor = actor; }


//   /*   public void setActorInfo(Actor actorInfo) {
//        this.actorInfo = actorInfo;
//    }*/

    public void displayMovieInfo(){
        System.out.println("Actor Name = " + actor.getActorName() + " ,Actor gender = " + actor.getActorGender()
         + " ,Actor Age = " + actor.getActorAge());
    }
}
