package pl.sda.java.designPatterns.creational.factoryMethod;

public class PlanFactory {

    public static AbstractPlan getPlan(PlanType planType) {

        AbstractPlan abstractPlan = switch (planType) {
            case DOMESTIC -> new DomesticPlan();
            case COMMERCIAL -> new CommercialPlan();
            default -> null;
        };
        return abstractPlan;
    }

}