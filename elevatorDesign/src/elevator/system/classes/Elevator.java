package elevator.system.classes;

import elevator.system.enums.ElevatorState;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    ElevatorState elevatorState;


    int currentFloorNumber;
    List<Integer> stops = new ArrayList<>();


    public Elevator(ElevatorState elevatorState, int currentFloorNumber) {
        this.elevatorState = elevatorState;
        this.currentFloorNumber = currentFloorNumber;
    }


    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public int getCurrentFloorNumber() {
        return currentFloorNumber;
    }

    public void setCurrentFloorNumber(int currentFloorNumber) {
        this.currentFloorNumber = currentFloorNumber;
    }


    public boolean isOverWeight() {
        return false;
    }

    public void evaluateWeight() {

    }
}
