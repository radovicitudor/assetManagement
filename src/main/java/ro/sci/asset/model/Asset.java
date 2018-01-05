package ro.sci.asset.model;
import ro.sci.asset.model.util.Category;
import ro.sci.asset.model.util.Status;

import java.sql.Date;

/**
 * Asset entity. This class will be used in order to track an asset
 */
public class Asset {
    private int asestId;
    private  Date dateOfAdd;
    private String assetName;
    private String serviceTag;
    private Status status;
    private Category category;
    private String description;

    public int getAsestId() {
        return asestId;
    }

    public void setAsestId(int asestId) {
        this.asestId = asestId;
    }

    public Date getDateOfAdd() {
        return dateOfAdd;
    }

    public void setDateOfAdd(Date dateOfAdd) {
        this.dateOfAdd = dateOfAdd;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}