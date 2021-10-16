
package com.moringaschool.myresturant.model;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Business {

    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("review_count")
    @Expose
    private Integer reviewCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("transactions")
    @Expose
    private List<String> transactions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Business() {
    }

    /**
     * 
     * @param distance
     * @param rating
     * @param coordinates
     * @param transactions
     * @param url
     * @param isClosed
     * @param phone
     * @param reviewCount
     * @param price
     * @param imageUrl
     * @param name
     * @param alias
     * @param location
     * @param id
     * @param categories
     */
    public Business(Double rating, String price, String phone, String id, String alias, Boolean isClosed, List<Category> categories, Integer reviewCount, String name, String url, Coordinates coordinates, String imageUrl, Location location, Double distance, List<String> transactions) {
        super();
        this.rating = rating;
        this.price = price;
        this.phone = phone;
        this.id = id;
        this.alias = alias;
        this.isClosed = isClosed;
        this.categories = categories;
        this.reviewCount = reviewCount;
        this.name = name;
        this.url = url;
        this.coordinates = coordinates;
        this.imageUrl = imageUrl;
        this.location = location;
        this.distance = distance;
        this.transactions = transactions;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.distance == null)? 0 :this.distance.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        result = ((result* 31)+((this.transactions == null)? 0 :this.transactions.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.isClosed == null)? 0 :this.isClosed.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.reviewCount == null)? 0 :this.reviewCount.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Business) == false) {
            return false;
        }
        Business rhs = ((Business) other);
        return ((((((((((((((((this.distance == rhs.distance)||((this.distance!= null)&&this.distance.equals(rhs.distance)))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.coordinates == rhs.coordinates)||((this.coordinates!= null)&&this.coordinates.equals(rhs.coordinates))))&&((this.transactions == rhs.transactions)||((this.transactions!= null)&&this.transactions.equals(rhs.transactions))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.isClosed == rhs.isClosed)||((this.isClosed!= null)&&this.isClosed.equals(rhs.isClosed))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.reviewCount == rhs.reviewCount)||((this.reviewCount!= null)&&this.reviewCount.equals(rhs.reviewCount))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))));
    }

}
