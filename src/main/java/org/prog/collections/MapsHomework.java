package org.prog.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {


    public static void main(String[] args) {
        Map<CarOwner, List<Car>> ownerCarMap = new HashMap<>();

        CarOwner owner1 = createCarOwner("Olya", "Polykova", "123-456-7890");
        CarOwner owner2 = createCarOwner("Nika", "Tarasuik", "987-654-3210");
        CarOwner owner3 =createCarOwner("Dima", "Petrenko", "555-123-4567");

        Car car1 = new Car("Sedan", "red");
        Car car2 = new Car("Coupe", "blue");
        Car car3 = new Car("SUV", "green");

        registerCar(registry, owner1, car1);
        registerCar(registry, owner1, car2);
        registerCar(registry, owner2, car1);
        registerCar(registry, owner3, car3);

        showOwnerCars(registry);
        findSharedCars(registry);
    }

    public static CarOwner createCarOwner(String firstName, String lastName, String phoneNumber) {
        CarOwner owner = new CarOwner();
        owner.firstName = firstName;
        owner.lastName = lastName;
        owner.phoneNumber = phoneNumber;
        return owner;
    }

    private static void registerCar(Map<CarOwner, List<Car>> registry, CarOwner owner, Car car) {
        registry.computeIfAbsent(owner, o -> new ArrayList<>()).add(car);
    }

    private static void showOwnerCars(Map<CarOwner, List<Car>> registry) {
        System.out.println("List of owners and their cars:");
        for (Map.Entry<CarOwner, List<Car>> entry : registry.entrySet()) {
            CarOwner owner = entry.getKey();
            List<Car> cars = entry.getValue();
            System.out.println(owner + " owns the following cars: " + cars);
        }
    }

    private static void findSharedCars(Map<CarOwner, List<Car>> registry) {
        Map<Car, List<CarOwner>> carToOwnerMap = new HashMap<>();
        for (Map.Entry<CarOwner, List<Car>> entry : registry.entrySet()) {
            CarOwner owner = entry.getKey();
            List<Car> cars = entry.getValue();
            for (Car car : cars) {
                carToOwnerMap.computeIfAbsent(car, c -> new ArrayList<>()).add(owner);
            }
        }
        System.out.println("\nCars owned by multiple people:");
        for (Map.Entry<Car, List<CarOwner>> entry : carToOwnerMap.entrySet()) {
            Car car = entry.getKey();
            List<CarOwner> owners = entry.getValue();
            if (owners.size() > 1) {
                System.out.println(car + " is shared by these owners: " + owners);
            }
        }
    }
}