package com.tvh.test.driver;

public class StopWatch {

    

    private long startTime;

    private long stopTime;

    private boolean running = false;



    public void start() {

        this.startTime = System.currentTimeMillis();

        this.running = true;

    }



    public void stop() {

        this.stopTime = System.currentTimeMillis();

        this.running = false;

    }

    

    /**

     * @return Elapsed time in seconds

     */

    public long getElapsedTimeSecs() {

        long elapsed;

        if (running) {

            elapsed = ((System.currentTimeMillis() - startTime) / 1000);

        } else {

            elapsed = ((stopTime - startTime) / 1000);

        }

        return elapsed;

    }

}

