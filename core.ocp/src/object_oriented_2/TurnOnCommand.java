package object_oriented_2;

/**
 * @author thanhch
 * <p>
 * Date: 06/02/2024
 * <p>
 * Class: TurnOnCommand
 */
public class TurnOnCommand implements ICommand{
    private Fan fan;

    public TurnOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}
