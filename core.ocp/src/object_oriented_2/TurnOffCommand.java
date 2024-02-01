package object_oriented_2;

/**
 * @author thanhch
 * <p>
 * Date: 06/02/2024
 * <p>
 * Class: TurnOffCommand
 */
public class TurnOffCommand implements ICommand{
    private Fan fan;

    public TurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}
