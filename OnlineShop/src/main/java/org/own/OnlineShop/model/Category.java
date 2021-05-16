package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id", nullable = false)
    private TypeOfDevice typeCategory;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brandCategory;

    @OneToMany(mappedBy = "categorySubcategory", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Subcategory> subcategoryCategory;

    @OneToOne(mappedBy = "categoryAds")
    private Ads adsCategory;

    @OneToMany(mappedBy = "categoryDevice", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Device> deviceCategory;

    public Category() {
    }

    public List<Device> getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(List<Device> deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public Ads getAdsCategory() {
        return adsCategory;
    }

    public void setAdsCategory(Ads adsCategory) {
        this.adsCategory = adsCategory;
    }

    public List<Subcategory> getSubcategoryCategory() {
        return subcategoryCategory;
    }

    public void setSubcategoryCategory(List<Subcategory> subcategoryCategory) {
        this.subcategoryCategory = subcategoryCategory;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfDevice getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(TypeOfDevice typeCategory) {
        this.typeCategory = typeCategory;
    }

    public Brand getBrandCategory() {
        return brandCategory;
    }

    public void setBrandCategory(Brand brandCategory) {
        this.brandCategory = brandCategory;
    }
}
