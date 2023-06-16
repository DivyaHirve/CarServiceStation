import java.util.ArrayList;

public class Invoice {

    CarService carService;
    ArrayList<String> serviceCodes;

    Invoice(CarService carService, ArrayList<String> serviceCodes) {
        this.carService = carService;
        this.serviceCodes = serviceCodes;
    }



    private int calculate() {
        int total = 0;
        if ( carService instanceof Hatchback ) {
            for (String code : serviceCodes) {
                total += carService.getServicePrices().get(code).price;
            }
        }
        else if ( carService instanceof Sedan ) {
            for (String code : serviceCodes) {
                total += carService.getServicePrices().get(code).price;
            }
        }
        else if (carService instanceof SUV ) {
            for (String code : serviceCodes) {
                total += carService.getServicePrices().get(code).price;
            }
        }
        return total;
    }
}
