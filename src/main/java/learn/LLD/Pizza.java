package learn.LLD;

public abstract class Pizza {
    abstract void prepare();
    void pack(){
        System.out.println("packing pizza");
    }
    void parcel(){
        System.out.println("parcel ready :)");
    }
}
