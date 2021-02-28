package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;

public class ExampleEvent implements Event<Integer> {

    private Integer integer;
    public ExampleEvent(Integer i){
        integer=i;
    }

    public Integer get(){
        return integer;
    }
}
