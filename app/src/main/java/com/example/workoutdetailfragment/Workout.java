package com.example.workoutdetailfragment;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups" + "\n10 1-legged squat\n15 Pull ups"),
            new Workout("Core Agony", " 100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100Squats"),
            new Workout("Cardio Blast", "30 minutes of running at a moderate pace" + "\n10 minutes of jumping jacks\n5 minutes of burpees"),
            new Workout("Strength Training", "5 sets of 10 repetitions of bench press" + "\n5 sets of 10 repetitions of squats\n5 sets of 10 repetitions of deadlifts")

    };
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

private Workout(String name, String description) {
    this.name = name;
    this.description = description;
}
}
