package model;

public class RationCard {
    private int rationUid;
    private String familyHead;
    private String address;
    private String phoneNumber;
    private int balance;
    private String cardType;

    public RationCard(int rationUid, String familyHead, String address, String phoneNumber, int balance, String cardType) {
        this.rationUid = rationUid;
        this.familyHead = familyHead;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.cardType = cardType;
    }


    public void setRationUid(int rationUid) {
        this.rationUid = rationUid;
    }

    public void setFamilyHead(String familyHead) {
        this.familyHead = familyHead;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }


    public int getRationUid() {
        return rationUid;
    }

    public String getFamilyHead() {
        return familyHead;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCardType() {
        return cardType;
    }
}
