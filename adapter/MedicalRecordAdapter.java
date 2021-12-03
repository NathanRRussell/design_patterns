package adapter;

import java.util.Date;
import java.util.ArrayList;

/**
 * Medical Record Adapter
 * @author Nathan Russell
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    /**
     * Initializes the Medical Record Adapter
     * @param record a patients record
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * Gets the first name of a patient
     * @return returns the first name of a patient
     */
    public String getFirstName() {
        return record.getName();
    }

    /**
     * Get the last name of a patient
     * @return returns the last name of a patient
     */
    public String getLastName() {
        return record.getName();
    }

    /**
     * Get a patients birthday
     * @return returns the patients birthday
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * Gets the gender of the patient
     * @return returns the patients gender
     */
    public Gender getGender() {
        return record.getGender();
    }

    /**
     * Adds a visit to the patients record
     * @param date the date the patient visited
     * @param well that patients health status
     * @param description a desciption of the patients visit
     */
    public void addVisit(Date date, boolean well, String description) {
        date = Visit.getDate();
        well = Visit.isWell();
        description = Visit.getDescription();
    }

    /**
     * Gets the patients visit history
     * @return returns the visit history of the patient
     */
    public ArrayList<Visit> getVisitHistory() {
        return record.getHistory();
    }

    public String toString() {
        String result = getFirstName();
        result += getBirthday();
        result += getGender();
        result += getVisitHistory();
        return result;
    }
    
}
