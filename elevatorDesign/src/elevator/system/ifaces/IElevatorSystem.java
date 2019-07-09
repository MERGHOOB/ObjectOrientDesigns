package elevator.system.ifaces;

import elevator.system.classes.Elevator;
import elevator.system.enums.Direction;

public interface IElevatorSystem {

    Elevator allocateElevator(Direction direction);




}
