package bgu.spl.mics.application.messages;

import bgu.spl.mics.Broadcast;

public class ExampleBroadcast implements Broadcast {
    private Integer integer;
    public ExampleBroadcast(Integer i){
        integer=i;
    }
    public Integer get(){
        return integer;
    }
}
