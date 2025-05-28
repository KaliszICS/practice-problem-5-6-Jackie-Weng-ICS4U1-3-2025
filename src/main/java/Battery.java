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

public void charge(){
    isCharged = true;
}


public int getCapacityMAh(){
    return this.capacityMAh;
}

@Override
public String toString(){
    return "Battery: " + this.capacityMAh +  "mAh, Charged: " + this.isCharged;
}
}