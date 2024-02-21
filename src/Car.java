public class Car {
    public Car(){}
    public Car(String manufacturer, String type, Engine engine){
        this.manufacturer = manufacturer;
        this.type = type;
        this.engine = engine;
    }
    private String manufacturer;
    private String type;
    private Engine engine;

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
