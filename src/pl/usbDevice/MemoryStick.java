package pl.usbDevice;

import java.sql.SQLOutput;

public class MemoryStick implements USBDevice{
    private String name;
     private boolean ejected =false;

    public MemoryStick (String name){
        this.name =  name;

    }
    @Override
    public boolean connect() {
        System.out.println("Memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {

        if(!ejected){
            System.out.println("pleas eject Memory STICK ");
            return false;
        }else{
            System.out.println("Memory stick disconnected");
            return true;
        }
    }
    public void eject(){
        System.out.println("Ejecting  Memory");
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
