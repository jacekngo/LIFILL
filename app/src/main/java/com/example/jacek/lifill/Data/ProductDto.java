package com.example.jacek.lifill.Data;

/**
 * Created by jacek on 24.03.18.
 */

public class ProductDto {
    private String name;
    private int photoUrl;
    private Long planedRefillDate;

    public ProductDto(String name, int photoUrl, Long planedRefillDate) {
        this.name = name;
        this.photoUrl = photoUrl;
        this.planedRefillDate = planedRefillDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(int photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Long getPlanedRefillDate() {
        return planedRefillDate;
    }

    public void setPlanedRefillDate(Long planedRefillDate) {
        this.planedRefillDate = planedRefillDate;
    }
}
