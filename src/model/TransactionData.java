package model;

public class TransactionData {
    private int rId;
    private int cId;
    private int quantity;
    private int amount;

    public TransactionData(int rId, int cId, int quantity, int amount) {
        this.rId = rId;
        this.cId = cId;
        this.quantity = quantity;
        this.amount = amount;
    }


    public int getRId() {
        return rId;
    }

    public int getCId() {
        return cId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }
}
