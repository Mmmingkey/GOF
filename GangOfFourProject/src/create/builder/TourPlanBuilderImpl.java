package create.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlanBuilderImpl implements  TourPlanBuilder{
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans = new ArrayList<>();
    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlans(int day, String plan) {
        plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan build() {
        return new TourPlan(this.title, this.nights, this.days, this.startDate,
                this.whereToStay, this.plans);
    }
}
