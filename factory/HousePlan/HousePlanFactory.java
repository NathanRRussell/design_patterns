package factory.HousePlan;

/**
 * House Plan Factory
 * @author Nathan Russell
 */
public class HousePlanFactory {
    
    /**
     * Selects the desired house plan by the user
     * @param type The type of house plan
     * @return Returns the desired house plan
     */
    public static HousePlan createHousePlan(String type) {
        HousePlan housePlan = null;

        if(type.equals("log cabin")) {
            housePlan = new LogCabinPlan();
        }
        else if(type.equals("Tiny Home")) {
            housePlan = new TinyHomePlan();
        }
        else if(type.equals("contemporary home")) {
            housePlan = new ContemporaryPlan();
        }

        return housePlan;
    }
}
