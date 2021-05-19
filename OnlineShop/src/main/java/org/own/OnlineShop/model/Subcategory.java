package org.own.OnlineShop.model;

import javax.persistence.*;


import java.util.List;

@Entity
@Table(name = "subcategory")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", nullable = false)
    private Category categorySubcategory;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @OneToMany(mappedBy = "subcategoryDevice", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Device> deviceSubcategory;

    public Subcategory() {
    }

    public List<Device> getDeviceSubcategory() {
        return deviceSubcategory;
    }

    public void setDeviceSubcategory(List<Device> deviceSubcategory) {
        this.deviceSubcategory = deviceSubcategory;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
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

    public Category getCategorySubcategory() {
        return categorySubcategory;
    }

    public void setCategorySubcategory(Category categorySubcategory) {
        this.categorySubcategory = categorySubcategory;
    }
}


