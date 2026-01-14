package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hours;
    private int minutes;
    private int seconds;

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //GETTERS 

    public String info() {
        return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
    }
    
    public void tick() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public void add(Time time2){
        int totalSeconds = this.seconds + time2.seconds;
        this.seconds = totalSeconds % 60;

        int minuteCarry = totalSeconds / 60;
        int totalMinutes = this.minutes + time2.minutes + minuteCarry;
        this.minutes = totalMinutes % 60;

        int hourCarry = totalMinutes / 60;
        int totalHours = this.hours + time2.hours + hourCarry;
        this.hours = totalHours % 24;
       
    }
}

