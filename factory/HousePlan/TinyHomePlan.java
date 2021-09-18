package factory.HousePlan;

/**
 * A Tiny House
 * @author Nathan Russell
 */
public class TinyHomePlan extends HousePlan {

    /**
     * Returns the number of rooms, number of windows, and square footage to the House plan respectively
     */
    public TinyHomePlan() {
        super(1,5,200);
    }

    /**
     * Sets the materials used in a tiny house
     */
    protected void setMaterials() {
        this.materials.set(0,"Lumber");
        this.materials.set(1,"Insulation");
        this.materials.set(2,"Metal Roofing");
        this.materials.set(3,"Hardware");
    }
    
    /**
     * Sets the features in a tiny house
     */
    protected void setFeatures() {
        this.features.set(0,"Natural Light");
        this.features.set(1,"Creative Storage");
        this.features.set(2,"Multipurpose Areas");
        this.features.set(3,"Multi-use Applications");
    }

    /**
     * Returns the description of the tiny house
     */
    public String toString() {
        String result = "";
        result += "\nTiny House \nSquare Feet: "+"200"+"\nRooms: "+numRooms+"\nWindows: "+numWindows+"\n";
        result += "\nMaterials:";
        for(String material : materials) {
            result += "- "+material+"\n";
        }
        result += "\n- Lumber";
        result += "\n- Insulation";
        result += "\n- Metal Roofing";
        result += "\n- Hardware"+"\n";
        result += "\nFeatures:";
        for(String feature : features) {
            result += "- "+feature+"\n";
        }
        result += "\n- Natural Light";
        result += "\n- Creative Storage";
        result += "\n- Multipurpose Areas";
        result += "\n- Multi-use Applications";
        return result;
    }
    
}
