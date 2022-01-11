package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks if there is a city with the given name
     * if there is one it deletes it
     * otherwise it throws and exception
     * @param city
     *      This is a candidate city to delete
     */
    public void delete(City city){
        if(cities.size()<1 || !cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     @@ -33,4 +47,14 @@ public void add(City city) {
     return list;
     }

     /**
      * Returns the size of the cities list
      * @return
     *      Returns the size of cities list
     */
    public int Size() {
        List<City> list = cities;
        return list.size();
    }

}