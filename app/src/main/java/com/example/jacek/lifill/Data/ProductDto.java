package com.example.jacek.lifill.Data;

/**
 * Created by jacek on 24.03.18.
 */

public class ProductDto {
    private String name;
    private String photoUrl;
    private Long planedRefillDate;

    public ProductDto(String name, String photoUrl, Long planedRefillDate) {
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Long getPlanedRefillDate() {
        return planedRefillDate;
    }

    public void setPlanedRefillDate(Long planedRefillDate) {
        this.planedRefillDate = planedRefillDate;
    }
}
