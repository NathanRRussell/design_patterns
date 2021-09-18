package factory.HousePlan;

/**
 * A Log Cabin
 * @author Nathan Russell
 */
public class LogCabinPlan extends HousePlan {

    /**
     * Returns the number of rooms, number of windows, and square footage to the House plan respectively
     */
    public LogCabinPlan() {
        super(2,10,1800);
    }

    /**
     * Sets the materials used in a log cabin
     */
    protected void setMaterials() {
        this.materials.set(0,"Log Siding");
        this.materials.set(1,"Board and Batten Siding");
        this.materials.set(2,"White Pane");
    }
    
    /**
     * Sets the features in a log cabin
     */
    protected void setFeatures() {
        this.features.set(0,"Timbered Roof");
        this.features.set(1,"High Insulation");
        this.features.set(2,"Rustic Effect");

    }

    /**
     * Returns the description of the log cabin
     */
    public String toString() {
        String result = "";
        result += "Log Cabin \nSquare Feet: "+"1800"+"\nRooms: "+numRooms+"\nWindows: "+numWindows+"\n";
        result += "\nMaterials:";
        for(String material : materials) {
            result += "- "+material+"\n";
        }
        result += "\n- Log Siding";
        result += "\n- Board and Batten Siding";
        result += "\n- White Pane"+"\n";
        result += "\nFeatures:";
        for(String feature : features) {
            result += "- "+feature+"\n";
        }
        result += "\n- Timbered Roof";
        result += "\n- High Insulation";
        result += "\n- Rustic Effect";
        return result;
    }
    
}
