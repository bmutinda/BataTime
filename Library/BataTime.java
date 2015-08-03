package com.bmutinda.libs.batatime;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Mutinda Boniface on 5/15/2015.
 */
public class BataTime {
    // Total Time the timer should take in milliseconds
    public int time = 0;
    // The tick interval
    public int tick = 500;

    private Timer timer;
    private TickTimerTask timerTask;
    public BataTimeCallback callback;

    // Time elapsed since the timer started
    private int elapsed = 0;

    public BataTime(int time) {
        this.create(time, this.tick);
    }

    public BataTime(int time, int tick) {
        this.create(time, tick);
    }

    private void create(int time, int tick) {
        this.time = time;
        this.tick = tick;
        timerTask = new TickTimerTask();
    }

    public void start( BataTimeCallback timerCallback ){
        this.stop();

        timer = new Timer();
        timer.schedule(timerTask, 0, this.tick );
        this.callback = timerCallback;
    }

    public void stop() {
        if (timer != null) {
            timer.cancel();
        }
    }

    class TickTimerTask extends TimerTask {

        @Override
        public void run() {
            if( elapsed>= time ){
                stop( );
                if( callback!=null ){
                    callback.onComplete();
                }
            }else{
                if( callback!=null ){
                    callback.onUpdate(elapsed);
                }
                elapsed+=tick;
            }
        }
    }
}
