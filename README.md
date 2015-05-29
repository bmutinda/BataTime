# BataTime
A simple Android Timer library

### Getting started
A library should be small, right?!!! :)

Copy the two java files in the Library dir and paste them in your project package and you are good to go

### How to use 
You can do this in two ways:

##### 1: Without tick timer - uses default tick time ``` 500 miliseconds ``` 
```java
int timeMiliseconds = 2000;
new BataTime(timeMiliseconds).start( new BataTimeCallback() {
    @Override
    public void onUpdate(int elapsed) {
        Log.e( TAG, "On update called...time elapsed = "+elapsed );
    }

    @Override
    public void onComplete() {
        Log.e( TAG, "On complete called..." );
    }
});
```

##### 2: With tick timer 
```java
int timeMiliseconds = 2000; // in milliseconds = 2seconds 
int tickTime = 1000; // in milliseconds - 1 second - we trigger onUpdate in intervals of this time 
new BataTime(timeMiliseconds, tickTime).start( new BataTimeCallback() {
    @Override
    public void onUpdate(int elapsed) {
        Log.e( TAG, "On update called...time elapsed = "+elapsed );
    }

    @Override
    public void onComplete() {
        Log.e( TAG, "On complete called..." );
    }
});
```


### Projects using this library
1: Jifunze Android app - <a target='_blank' href='https://play.google.com/store/apps/details?id=com.jifunzeapp.android'>App on Google Play</a>

2: Kamba Music - <a target='_blank' href='https://play.google.com/store/apps/details?id=com.kambamusic.app'>App on Google Play</a>
