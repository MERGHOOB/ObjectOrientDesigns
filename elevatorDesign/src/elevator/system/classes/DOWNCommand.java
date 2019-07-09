package elevator.system.classes;

import elevator.system.enums.Direction;
import elevator.system.ifaces.ICommand;
import elevator.system.ifaces.IElevatorSystem;

public class DOWNCommand implements ICommand {

    IElevatorSystem elevatorSystem;

    public DOWNCommand(IElevatorSystem elevatorSystem) {
        this.elevatorSystem = elevatorSystem;
    }

    @Override
    public void execute() {
        elevatorSystem.allocateElevator(Direction.DOWN);
    }
}
