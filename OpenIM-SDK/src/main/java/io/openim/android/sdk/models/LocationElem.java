package io.openim.android.sdk.models;

public class LocationElem {
    /**
     * Location description
     */
    private String description;
    /**
     * Longitude
     */
    private double longitude;
    /**
     * Latitude
     */
    private double latitude;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
