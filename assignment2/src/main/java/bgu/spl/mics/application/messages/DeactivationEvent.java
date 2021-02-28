package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;
import bgu.spl.mics.application.passiveObjects.Diary;

public class DeactivationEvent implements Event<Boolean> {

    public static void stampFinishDeactivate(){
        Diary.getInstance().setR2D2Deactivate(System.currentTimeMillis());
    }

}
