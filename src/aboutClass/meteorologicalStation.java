package aboutClass;

    public abstract class meteorologicalStation {

        private String name;
        public abstract double getHumidity();
        public abstract String getTemp();
        meteorologicalStation(String name) {

            this.name=name;
        }
        public String getName(){ return name;}

    } //meteorologicalStation


