package elevator.system.ifaces;

import elevator.system.classes.Elevator;
import elevator.system.enums.Direction;
import elevator.system.exceptions.OverWeightException;

public interface IElevatorSystem {

    Elevator allocateElevator(Direction direction);

    boolean getIn(Elevator elevator) throws OverWeightException;

    boolean out(Elevator elevator);




}
