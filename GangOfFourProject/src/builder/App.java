package builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new TourPlanBuilderImpl());

        System.out.println(director.longBeachTrip());
        System.out.println(director.cancunTrip());

    }
}
