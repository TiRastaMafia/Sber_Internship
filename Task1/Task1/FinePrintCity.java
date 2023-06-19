package Task1;

import java.util.List;

public class FinePrintCity {

    public static void finePrintCity(List<City> listCity) {
        for (City city : listCity) {
            // Новоалтайск;Алтайский край;Сибирский;70438;1736
            System.out.printf("%-25s %-40s %-20s %-9d %s \n", city.getName(), city.getRegion(),
                    city.getDistrict(),
                    city.getPopulation(), 
                    city.getFoundation());

        }

    }
}
