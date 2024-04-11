package dev.reyesjl.workout;

public enum Movement {
    BENCH_PRESS(MovementCategory.UPPER_PUSH, "The bench press is a compound movement that primarily targets the chest, shoulders, and triceps."),
    SQUAT(MovementCategory.LOWER_PUSH, "The squat is a compound movement that primarily targets the quadriceps, hamstrings, and glutes."),
    DEADLIFT(MovementCategory.LOWER_PULL, "The deadlift is a compound movement that primarily targets the lower back, hamstrings, and glutes."),
    OVERHEAD_PRESS(MovementCategory.UPPER_PUSH, "The overhead press, also known as the shoulder press, primarily targets the shoulders and triceps."),
    PULL_UP(MovementCategory.UPPER_PULL, "The pull-up is an upper body pulling movement that primarily targets the back and biceps."),
    BOX_JUMP(MovementCategory.POWER, "The box jump is a plyometric exercise that develops explosive power and lower body strength."),
    EXTERNAL_SHOULDER_ROTATION(MovementCategory.RESILIENCE, "External shoulder rotation exercises strengthen the rotator cuff muscles and improve shoulder stability."),
    SINGLE_LEG_RDL(MovementCategory.LOWER_PULL, "The single-leg Romanian deadlift (RDL) is a unilateral exercise that targets the hamstrings, glutes, and lower back."),
    FRONT_SQUAT(MovementCategory.LOWER_PUSH, "The front squat is a squat variation that places more emphasis on the quadriceps and core."),
    DUMBELL_BENCH_PRESS(MovementCategory.UPPER_PUSH, "The dumbbell bench press is a variation of the bench press that involves using dumbbells instead of a barbell.");

    private final MovementCategory category;
    private final String description;

    Movement(MovementCategory category, String description) {
        this.category = category;
        this.description = description;
    }

    public MovementCategory getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}