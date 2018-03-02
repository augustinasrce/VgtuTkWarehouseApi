package tk.sandelisvgtu.vgtuwarehouseapi.model;

import java.util.Date;

public class Equipment {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private Date purchaseDate;

    public Equipment() {
    }

    public Equipment(String id, String name, String description, int quantity, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
