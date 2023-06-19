package Task2;

import java.util.Comparator;

public class CityNextSort implements Comparable<CityNextSort>{
    private int Id;
    private String Name;
    private String Region;
    private String District;
    private int Population;
    private String Foundation;
    


    public int getId() {
        return Id;
    }
    

    public void setId(int id) {
        Id = id;
    }
        
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getFoundation() {
        return Foundation;
    }

    public void setFoundation(String data) {
        Foundation = data;
    }

    @Override
    public String toString(){
        // City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}
        return "\nCity={" + "name=" + "'" + getName() + "'" + ", " + "region=" + "'" + getRegion() + "'" + ", " 
        + "district=" + "'" + getDistrict() + "'" + ", " + "population=" + getPopulation() + ", "
        + "foundation=" + "'" + getFoundation() + "'" + "}";
    }


    @Override
    public int compareTo(CityNextSort o){
        return Comparator.comparing(CityNextSort::getDistrict)
                  .thenComparing(CityNextSort::getName)
                  .compare(this, o);
    }

}