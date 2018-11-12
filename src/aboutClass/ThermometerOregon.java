package aboutClass;

public class ThermometerOregon extends meteorologicalStation{

    private double SteamMass, AirVolume;
    private double H,HN;

    public double getH() {
        return H;
    }
    public double getHN() {
        return HN;
    }
    public double getSteamMass() {
        return SteamMass;
    }
    public double getAirVolume() {
        return AirVolume;
    }

    public ThermometerOregon(double SteamMass, double AirVolume, double HN){
        super("ТермометрОрегон.");
        this.HN=HN;
        this.SteamMass=SteamMass;
        this.AirVolume=AirVolume;
    }
    @Override
    public double getHumidity(){
        H=SteamMass/AirVolume;
        return ((H*100)/HN);
    }
    @Override
    public  String getTemp()
    {
        if(HN>4.84) return "+";
        else if (HN<4.84) return "-";
        else return "0";
    }





}
