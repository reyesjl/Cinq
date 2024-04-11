package dev.reyesjl.workout;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public record Workout(Integer id, String title, LocalDateTime startedOn, LocalDateTime endedOn, List<Set> sets) {
   
   public Workout(Integer id, String title, LocalDateTime startedOn, LocalDateTime endedOn, List<Set> sets) {
         if (!endedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Ended On must be after Started On");
         }
         this.id = id;
         this.title = title;
         this.startedOn = startedOn;
         this.endedOn = endedOn;
         this.sets = new ArrayList<>(sets); // Defensive copying to initialize the final field
    }

   public List<Set> filterSetsByMovement(MovementCategory category) {
        return sets.stream()
                   .filter(set -> set.movement().getCategory() == category)
                   .collect(Collectors.toList());
   }
}