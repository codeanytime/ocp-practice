package object_oriented_2;

/**
 * @author thanhch
 * <p>
 * Date: 06/02/2024
 * <p>
 * Class: Remote
 */
public class Remote {
    private ICommand turnOnCommand;
    private ICommand turnOffCommand;

    public Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void TurnOnButtonClick()
    {
        turnOnCommand.execute();
    }

    public void TurnOffButtonClick()
    {
        turnOffCommand.execute();
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        TurnOnCommand turnOnCommand = new TurnOnCommand(fan);
        TurnOffCommand turnOffCommand = new TurnOffCommand(fan);

        Remote remote = new Remote(turnOnCommand, turnOffCommand);
        remote.turnOnCommand.execute();
        remote.turnOffCommand.execute();
    }
}
