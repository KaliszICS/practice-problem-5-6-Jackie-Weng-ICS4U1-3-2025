public class Battery {

private int capacityMAh;
private boolean isCharged; // checks if charged. either true or false


public Battery(int capacityMAh){
    this.capacityMAh = capacityMAh;
    this.isCharged = false;
}

public boolean isCharged(){
    return this.isCharged;
}
// checks if it is charged
public void charge(){
    isCharged = true;
}

// gets the Capacity, in MAh.
public int getCapacityMAh(){
    return this.capacityMAh;
}
// retuerns battery charge.
@Override
public String toString(){
    return "Battery: " + this.capacityMAh +  "mAh, Charged: " + this.isCharged;
}
}