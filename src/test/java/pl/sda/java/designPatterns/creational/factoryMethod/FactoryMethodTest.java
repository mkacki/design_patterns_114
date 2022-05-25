package pl.sda.java.designPatterns.creational.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void shouldCreateDomesticPlan() {
        AbstractPlan plan = PlanFactory.getPlan(PlanType.DOMESTIC);

        double bill = plan.calculateBill(1);

        assertEquals(3.7, bill);
    }

    @Test
    void shouldCreateCommercialPlan() {
        AbstractPlan plan = PlanFactory.getPlan(PlanType.COMMERCIAL);

        double bill = plan.calculateBill(1);

        assertEquals(4.7, bill);
    }
}