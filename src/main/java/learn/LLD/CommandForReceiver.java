package learn.LLD;

public class CommandForReceiver implements Command{
    private final Receiver receiver;

    public CommandForReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("inside command execution");
        receiver.action();
    }
}
