package ro.sci.asset.model;

import java.sql.Date;

/**
 * Asset history. This class will be used in order to be able to track an assets history throughout it's life span.
 */
public class AssetHistory {

    private int assetId;
    private String assetName;
    private String servigeTag;
    private Date assetHistoryAdd;
    private String description;

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getServigeTag() {
        return servigeTag;
    }

    public void setServigeTag(String servigeTag) {
        this.servigeTag = servigeTag;
    }

    public Date getAssetHistoryAdd() {
        return assetHistoryAdd;
    }

    public void setAssetHistoryAdd(Date assetHistoryAdd) {
        this.assetHistoryAdd = assetHistoryAdd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
