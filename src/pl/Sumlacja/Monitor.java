package pl.Sumlacja;

public class Monitor {
    private int width = 3840 ;
    private int heihgt = 1920;

    public void setLowResolution(){
        width = 800;
        heihgt = 600;

    }
    public void setHighResolution(){
        width = 3840;
        heihgt = 1920;
    }
    public String getResolution() {
        return width + "x" +heihgt;
    }
}
