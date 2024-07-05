package learn.LLD;

public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void invoke(){
        System.out.println("inside invoke method");
        command.execute();
    }
}
