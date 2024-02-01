package example.Tema3.BirdLoops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);


        System.out.println(Arrays.toString(birdCount.getLastWeek()));


        System.out.println(birdCount.getToday());


        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday());


        System.out.println(birdCount.hasDayWithoutBirds());


        System.out.println(birdCount.getCountForFirstDays(4));


        System.out.println(birdCount.getBusyDays());
    }
}

