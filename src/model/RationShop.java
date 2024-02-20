package model;

public class RationShop {
    private int cId;
    private String category;
    private int quantity;

    public RationShop(int cId, String category, int quantity) {
        this.cId = cId;
        this.category = category;
        this.quantity = quantity;
    }

    public void setCId(int cId) {
        this.cId = cId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getCId() {
        return cId;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }
}
