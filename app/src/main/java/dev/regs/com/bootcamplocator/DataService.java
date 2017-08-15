package dev.regs.com.bootcamplocator;

import java.util.ArrayList;

/**
 * Created by cicct on 8/15/2017.
 */

public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<LocationModel> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<LocationModel> list = new ArrayList<>();
        list.add(new LocationModel(10.290160f, 123.861698f,"USJ-R","Basak Pardo","img"));
        list.add(new LocationModel(10.292699f, 123.860876f,"Sr. San Isidro Chapel","Lungsod Cebu City","img"));
        list.add(new LocationModel(10.288698f, 123.859626f,"Barangay Quiot Hall","Quiot Pardo","img"));
        return list;
    }
}
