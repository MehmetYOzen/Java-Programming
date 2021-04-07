/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportPackage;
/**
 *
 * @author mehmet
 */
public class MiniBus extends TransportVehicle {
    
    private int passangerSeets;
    private int passengers;
    private double vehicleSpeed;
    
    
    // Passangers
    public int totalSeets(){
        return passangerSeets;
    }
    
    public int getPassangerCount(){
        return passengers;
    }
    
    public void setPassangerCount(int count){
        passangerSeets = count;
    }
    
    public int emptySeets(){
        return passangerSeets - passengers;
    }
    
    // Speed
    public double getSpeed(){
        return vehicleSpeed;
    }
    
    public void setSpeed(double speed){
        vehicleSpeed = speed;
    }
    
}
