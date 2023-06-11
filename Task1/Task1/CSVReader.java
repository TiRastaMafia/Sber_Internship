package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class CSVReader {
 
    public static void main(String[] args) throws IOException {
        // открываем файл
        BufferedReader reader = new BufferedReader(new FileReader(
                "./Task1/Задача ВС Java Сбер.csv"));
 
        // считываем построчно
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<City> empList = new ArrayList<>();
 
        while ((line = reader.readLine()) != null) {
            City emp = new City();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                // City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}
                if (index == 0)
                    emp.setId(Integer.parseInt(data));
                else if (index == 1)
                    emp.setName(data);
                else if (index == 2)
                    emp.setRegion(data);
                else if (index == 3)
                    emp.setDistrict(data);
                else if (index == 4)
                    emp.setPopulation(Integer.parseInt(data));
                else if (index == 5)
                    emp.setFoundation(data);        
                else
                    System.out.println("Неверный формат данных" + data);
                index++;
            }
            index = 0;
            empList.add(emp);
        }
         
        //закрываем наш ридер
        reader.close();
         
        System.out.println(empList);
         
    }
 
}