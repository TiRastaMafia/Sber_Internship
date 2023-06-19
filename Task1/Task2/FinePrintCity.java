package Task2;

import java.util.List;

public class FinePrintCity {

    public static void finePrintCity(List<CityNextSort> listCity) {
        for (CityNextSort cityNextSort : listCity) {
            // Новоалтайск;Алтайский край;Сибирский;70438;1736
            System.out.printf("%-25s %-40s %-20s %-9d %s \n", cityNextSort.getName(), cityNextSort.getRegion(),
                    cityNextSort.getDistrict(),
                    cityNextSort.getPopulation(), 
                    cityNextSort.getFoundation());

        }

    }
}
