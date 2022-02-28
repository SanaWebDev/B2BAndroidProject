package com.codeseven.pos.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;


@Entity
public class CatalogItem implements Parcelable {

    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "itemSku")
    private String itemSku;

    @ColumnInfo(name = "itemName")
    private String itemName;

    @ColumnInfo(name = "itemMinimalPrice")
    private String itemMinimalPrice;

    @ColumnInfo(name = "itemRegularPrice")
    private String itemRegularPrice;

    @ColumnInfo(name = "itemImage")
    private String itemImage;

    @ColumnInfo(name = "itemDescription")
    private String itemDescription;

    @ColumnInfo(name = "itemQuantity")
    private String itemQuantity;

    @ColumnInfo(name = "itemUid")
    private String itemUid;

    public CatalogItem(String itemSku, String itemName, String itemMinimalPrice, String itemImage, String description) {
        this.itemSku = itemSku;
        this.itemName = itemName;
        this.itemMinimalPrice = itemMinimalPrice;
        this.itemImage = itemImage;
        this.itemDescription = description;
    }
    public CatalogItem(String itemSku, String itemName, String itemPrice, String itemRegularPrice, String itemImage, String quantity, String uid) {
        this.itemSku = itemSku;
        this.itemName = itemName;
        this.itemMinimalPrice = itemPrice;
        this.itemRegularPrice = itemRegularPrice;
        this.itemImage = itemImage;
        this.itemQuantity = quantity;
        this.itemUid = uid;
    }

    public CatalogItem(String itemSku, String itemName, String itemMinimalPrice, String itemRegularPrice, String itemImage, String itemDescription, String itemQuantity, String itemUid) {
        this.itemSku = itemSku;
        this.itemName = itemName;
        this.itemMinimalPrice = itemMinimalPrice;
        this.itemRegularPrice = itemRegularPrice;
        this.itemImage = itemImage;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemUid = itemUid;
    }

    protected CatalogItem(Parcel in) {
        itemSku = in.readString();
        itemName = in.readString();
        itemMinimalPrice = in.readString();
        itemImage = in.readString();
        itemDescription = in.readString();
    }

    public static final Creator<CatalogItem> CREATOR = new Creator<CatalogItem>() {
        @Override
        public CatalogItem createFromParcel(Parcel in) {
            return new CatalogItem(in);
        }

        @Override
        public CatalogItem[] newArray(int size) {
            return new CatalogItem[size];
        }
    };

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemMinimalPrice() {
        return itemMinimalPrice;
    }

    public void setItemMinimalPrice(String itemMinimalPrice) {
        this.itemMinimalPrice = itemMinimalPrice;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemUid() {
        return itemUid;
    }

    public void setItemUid(String itemUid) {
        this.itemUid = itemUid;
    }

    public String getItemRegularPrice() {
        return itemRegularPrice;
    }

    public void setItemRegularPrice(String itemRegularPrice) {
        this.itemRegularPrice = itemRegularPrice;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(itemSku);
        parcel.writeString(itemName);
        parcel.writeString(itemMinimalPrice);
        parcel.writeString(itemImage);
        parcel.writeString(itemDescription);
    }
}
