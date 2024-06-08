package create.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder startDate(LocalDate startDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlans(int day, String plan);

    TourPlan build();
}
