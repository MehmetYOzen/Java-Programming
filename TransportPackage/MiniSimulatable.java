/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportPackage;

/**
 *
 * @author mehme
 */
public interface MiniSimulatable {
    
    public boolean ShouldStop(boolean passangersStation);
    
    public String GetStationName(String stationName);
}
