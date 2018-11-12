package aboutClass;

import java.util.ArrayList;

public class main{

    public static void main(String[] args){

    ArrayList<meteorologicalStation> MeteorologicalS = new ArrayList<meteorologicalStation>();
    meteorologicalStation meteorologicalS = new ThermometerHAMA(32,42,42) ;
    MeteorologicalS.add(meteorologicalS);
    MeteorologicalS.add(new ThermometerOregon(245,334,3));
    printMeteorologicalStation(MeteorologicalS);

    }

    public static void printMeteorologicalStation(ArrayList<meteorologicalStation> meteorologicalS)
    {
        for(meteorologicalStation MeteorologicalS : meteorologicalS)
        {
            System.out.println("Name: " + MeteorologicalS.getName());
            System.out.println("Temp: " + MeteorologicalS.getTemp() + " градусы");
            System.out.println("Humidity: " + MeteorologicalS.getHumidity());
        }
    }
}

