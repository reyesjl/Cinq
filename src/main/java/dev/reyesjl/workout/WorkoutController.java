package dev.reyesjl.workout;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private final WorkoutRepository workoutRepository; 
    
    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @GetMapping("/api/workouts")
    List<Workout> findAll() {
        return workoutRepository.findAll();
    }

}
