//import java.util.ArrayList;
public class Processor {
private double speedGHz;
private String model;


    public Processor(String model, double speedGHz){
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String processTask(String task){
        return "Processing " + task + " with " + this.model + " at " + this.speedGHz + " GHz";
    }

// basic setters and getters
    public double getSpeedGHz() {
        return this.speedGHz;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString(){
        return "Processor: " + this.model + ", " + this.speedGHz + " GHz";
    }
}