# BataTime
A simple Android Timer library

### Getting started
A library should be small, right?!!! :)

Copy the two java files in the Library dir and paste them in your project package and you are good to go

### How to use 
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
