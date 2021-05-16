package org.own.OnlineShop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;


    @Column(name = "img")
    private String img;

    @OneToMany(mappedBy = "brandCategory", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Category> categoryBrand;

    @OneToMany(mappedBy = "brandDevice", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Device> deviceBrand;

    public Brand() {
    }

    public List<Device> getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(List<Device> deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Category> getCategoryBrand() {
        return categoryBrand;
    }

    public void setCategoryBrand(List<Category> categoryBrand) {
        this.categoryBrand = categoryBrand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}