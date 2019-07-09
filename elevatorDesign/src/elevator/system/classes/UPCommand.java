package elevator.system.classes;

import elevator.system.ElevatorSystem;
import elevator.system.enums.Direction;
import elevator.system.enums.ElevatorState;
import elevator.system.ifaces.ICommand;
import elevator.system.ifaces.IElevatorSystem;

public class UPCommand implements ICommand {

    IElevatorSystem elevatorSystem;

    public UPCommand(IElevatorSystem elevatorSystem) {
        this.elevatorSystem = elevatorSystem;
    }

    @Override
    public void execute() {
        elevatorSystem.allocateElevator(Direction.UP);
    }
}
