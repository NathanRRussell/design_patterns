package factory.HousePlan;
import java.util.*;

/**
 * A House Plan
 * @author Nathan Russell
 */
abstract class HousePlan {

    protected ArrayList<String> materials = new ArrayList<String>();
    protected ArrayList<String> features = new ArrayList<String>();
    public int numRooms;
    public int numWindows;
    public int squareFeet;

    /**
     * Initializes a house
     * @param numRooms The number of rooms in a house
     * @param numWindows The number of windows in a house
     * @param sqaureFeet The square footage of a house
     */
    public HousePlan(int numRooms, int numWindows, int sqaureFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    abstract void setMaterials();

    abstract void setFeatures();

    /**
     * Gets the materials of a house
     * @return returns the materials
     */
    public ArrayList<String> getMaterials() {
        return materials;
    }

    /**
     * Gets the features of a house
     * @return returns the features
     */
    public ArrayList<String> getFeatures() {
        return features;
    }

    /**
     * Gets the number of rooms in a house
     * @return returns the number of rooms
     */
    public int getNumRooms() {
        return numRooms;
    }

    /**
     * Gets the number of windows in a house
     * @return returns the number of windows
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * Gets the square footage in a house
     * @return returns the square footage
     */
    public int getSquareFeet() {
        return squareFeet;
    }

    /**
     * Prints a discription of the house
     */
    public String toString() {
        String result = "";
        result += "Type \nSquare Feet: "+"1800"+"\nRooms: "+numRooms+"\nWindows: "+numWindows;
        result += "\nMaterials:";
        for(String material : materials) {
            result += "- "+material+"\n";
        }
        for(String feature : features) {
            result += "- "+feature+"\n";
        }
        return result;
    }
}
