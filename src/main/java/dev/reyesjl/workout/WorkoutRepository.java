package dev.reyesjl.workout;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class WorkoutRepository {
    private List<Workout> workouts = new ArrayList<>();
   
    List<Workout> findAll() {
        return workouts;
    }

    @PostConstruct
    private void init() {
        // Create sets for Bench Press
        List<Set> benchPressSets = new ArrayList<>();
        int benchPressWeight = 135; // Starting weight for Bench Press
        for (int i = 0; i < 5; i++) {
            benchPressSets.add(new Set(Movement.BENCH_PRESS, 5, benchPressWeight));
            benchPressWeight += 10; // Increase weight by 10 pounds for each set
        }

        // Create sets for Squat
        List<Set> squatSets = new ArrayList<>();
        int squatWeight = 185; // Starting weight for Squat
        for (int i = 0; i < 5; i++) {
            squatSets.add(new Set(Movement.SQUAT, 5, squatWeight));
            squatWeight += 25; // Increase weight by 10 pounds for each set
        }

        // Combine all sets into one list here, then add it below:
        List<Set> combinedSets = new ArrayList<>(benchPressSets);
        combinedSets.addAll(squatSets);

        // Create a workout containing Bench Press and Squat sets
        Workout workout = new Workout(
                1, // Workout ID
                "Crusaders Monday", // Title
                LocalDateTime.now(), // Started On
                LocalDateTime.now().plusHours(1), // Ended On
                combinedSets // List of combined sets
        );

        // Add the workout to the workouts list
        workouts.add(workout);
    }
}
