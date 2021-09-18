package factory.HousePlan;

/**
 * A Contemporary House
 * @author Nathan Russell
 */
public class ContemporaryPlan extends HousePlan {

    /**
     * Returns the number of rooms, number of windows, and square footage to the House plan respectively
     */
    public ContemporaryPlan() {
        super(5,40,3000);
    }

    /**
     * Sets the materials used in a contemporary house
     */
    protected void setMaterials() {
        this.materials.set(0,"Ceramics");
        this.materials.set(1,"High-Strength Alloys");
        this.materials.set(2,"Composites");
    }
    
    /**
     * Sets the features in a contemporary house
     */
    protected void setFeatures() {
        this.features.set(0,"Oversized Windows");
        this.features.set(1,"Unconventional Roofs");
        this.features.set(2,"Minimalism");
        this.features.set(3,"Open Floor Plan");
    }

    /**
     * Returns the description of the tiny house
     */
    public String toString() {
        String result = "";
        result += "\nContemporary Home \nSquare Feet: "+"3000"+"\nRooms: "+numRooms+"\nWindows: "+numWindows+"\n";
        result += "\nMaterials:";
        for(String material : materials) {
            result += "- "+material+"\n";
        }
        result += "\n- Ceramics";
        result += "\n- High-Strength Alloys";
        result += "\n- Composites"+"\n";
        result += "\nFeatures:";
        for(String feature : features) {
            result += "- "+feature+"\n";
        }
        result += "\n- Oversized Windows";
        result += "\n- Unconventional Roofs";
        result += "\n- Minimalism";
        result += "\n- Open Floor Plan";
        return result;
    }
}
