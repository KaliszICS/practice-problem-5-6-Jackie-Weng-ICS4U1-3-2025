public class Display {
private String resolution;
private double sizeInches;

private boolean isOn;


    public Display(double sizeInches, String resolution){
        this.sizeInches = sizeInches;
        this.isOn = false;
        this.resolution = resolution;
        
    }

    public String turnOff(){
        isOn = false;
        return "Display turned off.";
        }



    public String turnOn(){
        isOn = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
        
    }
// basic setters and getters. 
    public String getResolution() {
        return this.resolution;
    }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public boolean isOn(){
        return this.isOn;
    }

    

    @Override
    public String toString(){
        return "Display: " + this.sizeInches + "inches, "+ this.resolution;
    }    
}