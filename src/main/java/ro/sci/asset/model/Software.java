package ro.sci.asset.model;

import ro.sci.asset.model.util.Category;

import java.sql.Date;

/**
 * Software entity. This class will be used in order to track the different software each asset has.
 */
public class Software {

    private int softwareId;
    private int assetID;
    private String assetName;
    private String softwareName;
    private String softwareSerial;
    private Date softwareAddDate;
    private String description;
    private Category category;

    public int getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(int softwareId) {
        this.softwareId = softwareId;
    }

    public int getAssetID() {
        return assetID;
    }

    public void setAssetID(int assetID) {
        this.assetID = assetID;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareSerial() {
        return softwareSerial;
    }

    public void setSoftwareSerial(String softwareSerial) {
        this.softwareSerial = softwareSerial;
    }

    public Date getSoftwareAddDate() {
        return softwareAddDate;
    }

    public void setSoftwareAddDate(Date softwareAddDate) {
        this.softwareAddDate = softwareAddDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
