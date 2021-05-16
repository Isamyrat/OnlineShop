package org.own.OnlineShop.model;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rating")
    private Byte ratings;

    @Column(name = "review")
    private String review;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User userRating;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", nullable = false)
    private Device deviceRating;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pick_up_point_id", nullable = false)
    private PickUpPoint pickUpPointRating;

    public Rating() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getRatings() {
        return ratings;
    }

    public void setRatings(Byte ratings) {
        this.ratings = ratings;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public User getUserRating() {
        return userRating;
    }

    public void setUserRating(User userRating) {
        this.userRating = userRating;
    }

    public Device getDeviceRating() {
        return deviceRating;
    }

    public void setDeviceRating(Device deviceRating) {
        this.deviceRating = deviceRating;
    }

    public PickUpPoint getPickUpPointRating() {
        return pickUpPointRating;
    }

    public void setPickUpPointRating(PickUpPoint pickUpPointRating) {
        this.pickUpPointRating = pickUpPointRating;
    }
}
