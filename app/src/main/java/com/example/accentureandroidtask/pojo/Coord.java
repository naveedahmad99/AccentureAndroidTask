
package com.example.accentureandroidtask.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Coord implements Serializable
{

    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("lat")
    @Expose
    private Double lat;
    private final static long serialVersionUID = -6233592083053581520L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coord() {
    }

    /**
     * 
     * @param lon
     * @param lat
     */
    public Coord(Double lon, Double lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("lon", lon).append("lat", lat).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(lon).append(lat).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Coord) == false) {
//            return false;
//        }
//        Coord rhs = ((Coord) other);
//        return new EqualsBuilder().append(lon, rhs.lon).append(lat, rhs.lat).isEquals();
//    }

}
