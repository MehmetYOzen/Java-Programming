/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportPackage;

import java.util.List;

/**
 *
 * @author mehme
 */
public class MiniBusSimulator implements MiniSimulatable {
    
    private String results;
    
    
    public void runMiniBusSimulation(List<TransportVehicle> vList) {
        
        StringBuilder sb = new StringBuilder();
        int passTotal = 0;
        
        if(vList != null && !vList.isEmpty()){
            
            for(TransportVehicle v: vList){
                sb.append("***************************************\n");
                sb.append("Examining Vehicle: ").append(v.getCallSign()).append("\n");
                sb.append("Passenger Count: ").append(v.getPassengerCount()).append("\n");
                passTotal = passTotal + v.getPassengerCount();
            }
            sb.append("****** OVERALL RESULTS *******");
            sb.append("Total Passengers in all vehicles: ").append(passTotal);
            
        }
        // after we've run the simulatoin, dump our String train into 
        // the member variable which holds simulation results
        results = sb.toString();
        
    }

    public String getSimulationResults() {
        
        // ship to caller the results of the most recent simulation
        return results;
            
    }

    @Override
    public boolean ShouldStop(boolean passangersStation) {
        return false;
    }

    @Override
    public String GetStationName(String stationName) {
        return stationName;
    }
}
