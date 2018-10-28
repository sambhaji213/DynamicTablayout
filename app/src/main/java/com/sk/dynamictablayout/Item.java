package com.sk.dynamictablayout;

import java.io.Serializable;

/**
 * Created by Sambhaji Karad on 07/10/18.
 */
public class Item implements Serializable{

    private String category;
    private String picture;
    private String content;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
