package elevator;

import elevator.system.ElevatorSystem;
import elevator.system.classes.UPCommand;
import elevator.system.ifaces.ICommand;

public class User {

    ICommand command;
    public User() {

    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }

    public static void main(String[] args) {


        User user = new User();
        user.setCommand(new UPCommand(new ElevatorSystem(15)));

        user.buttonPressed();





    }



}
