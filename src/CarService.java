import java.util.HashMap;

public interface CarService {
    HashMap<String, Pair> map = new HashMap<>();

    public HashMap<String, Pair> getServicePrices();


    public int basicService();

    public int engineFixing();

    public int clutchFixing();

    public int brakeFixing();

    public int gearFixing();
}
