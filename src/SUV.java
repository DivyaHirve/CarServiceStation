import java.util.HashMap;

public class SUV implements CarService{
    private HashMap<String, Pair> map = new HashMap<>();



    @Override
    public HashMap<String, Pair> getServicePrices() {
        map.put("BS01", new Pair("Basic Servicing", 5000));
        map.put("EF01",new Pair("Engine Fixing", 10000));
        map.put("CF01",new Pair("Clutch Fixing",6000));
        map.put("BF01",new Pair("Brake Fixing", 2500));
        map.put("GF01",new Pair("Gear Fixing",8000));
        return map;
    }

    @Override
    public int basicService() {
        return map.get("BS01").price;
    }

    @Override
    public int engineFixing() {
        return map.get("EF01").price;
    }

    @Override
    public int clutchFixing() {
        return map.get("CF01").price;
    }

    @Override
    public int brakeFixing() {
        return map.get("BF01").price;
    }

    @Override
    public int gearFixing() {
        return map.get("GF01").price;
    }
}
