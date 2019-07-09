package elevator.system.enums;

public enum ElevatorState {

    STANDBY(Direction.NA),
    UP(Direction.UP),
    DOWN(Direction.DOWN),
    NOT_AVAILABLE(Direction.NA)
    ;

    private final Direction direction ;

    ElevatorState(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
