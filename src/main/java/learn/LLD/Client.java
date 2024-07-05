package learn.LLD;

public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        CommandForReceiver command = new CommandForReceiver(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();
    }
}
