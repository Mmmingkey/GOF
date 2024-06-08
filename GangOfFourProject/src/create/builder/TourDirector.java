package create.builder;

import java.time.LocalDate;

public class TourDirector {

    private final TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan cancunTrip(){
        return this.builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlans(0, "체크인하고 짐풀기")
                .addPlans(0, "저녁식사")
                .build();
    }

    public TourPlan longBeachTrip(){
        return this.builder.title("룸비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .build();
    }
}
