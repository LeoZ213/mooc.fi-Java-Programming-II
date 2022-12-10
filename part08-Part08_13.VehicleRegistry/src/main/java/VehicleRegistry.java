/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry() {  
        this.hashmap = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.hashmap.get(licensePlate) == null) {
            this.hashmap.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    public String get(LicensePlate licensePlate) {
        return this.hashmap.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) {
        if (this.hashmap.containsKey(licensePlate)) {
            this.hashmap.remove(licensePlate);
            return true;
            
        } else {
            return false;
        }
    }
    public void printLicensePlates() {
        for (LicensePlate k :  this.hashmap.keySet()) {
            System.out.println(k);
        }
    }
    public void printOwners() {
        ArrayList<String> Owners = new ArrayList<>();
        for (String owner : this.hashmap.values()) {
            if (Owners.contains(owner)) {
                continue;
            } else {
                System.out.println(owner);
                Owners.add(owner);
            }
        }
    }
}

