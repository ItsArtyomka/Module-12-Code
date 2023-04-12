package Code.Module.Lists.PracticalExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"CommentedOutCode"})
public class Practical_Main {
    // Name Variables
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "GR86", false);
        Car car2 = new Car(TOYOTA, "GR Supra", false);
        Car car3 = new Car(TOYOTA, "GR Corolla", true);
        Car car4 = new Car(BMW, "X5", false);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(BMW, "320i", true);
        Car car7 = new Car(BMW, "E30 M3", false);
        Car car8 = new Car(KIA, "Stinger", true);
        Car car9 = new Car(KIA, "K5", false);
        Car car10 = new Car(KIA, "Forte", true);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

        // Not the right method to iterate through list.
        /* for (Car car : carList) {
            if (car.getBrand().equals(KIA)) {
                carList.remove(car);
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setOnSale(true);
            }
        }*/

        // The right way via using the Iterator:
        Iterator<Car> iterator =carList.iterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getBrand().equals(KIA)) {
                iterator.remove();
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setOnSale(true);
            }
        }

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
