package elevator.system;

import elevator.system.classes.Elevator;
import elevator.system.enums.Direction;
import elevator.system.exceptions.OverWeightException;
import elevator.system.ifaces.IElevatorSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElevatorSystem implements IElevatorSystem {




    int numberOfFloor;
    List<Elevator> elevatorsAvailable = new ArrayList<>();
    public ElevatorSystem(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public Elevator allocateElevator(Direction up) {

        //find minimum distance elevator, in which direction you are and if not fulled already and is Avaliable

        return elevatorsAvailable.get(new Random().nextInt(elevatorsAvailable.size()-1));
    }

    @Override
    public boolean getIn(Elevator elevator) throws OverWeightException {

        if(elevator.isOverWeight()) {
            throw new OverWeightException("overweightException");
        }
        elevator.evaluateWeight();

        return true;
    }

    @Override
    public boolean out(Elevator elevator) {
        elevator.evaluateWeight();
        return true;
    }
}
