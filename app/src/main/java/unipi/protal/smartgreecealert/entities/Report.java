package unipi.protal.smartgreecealert.entities;

import java.io.Serializable;

public class Report implements Serializable {


    private ReportType type;
    private Double latitude ;
    private Double longitude;
    private Long date;
    private String photo;
    private Boolean canceled;

    public Report() {
    }

    public Report(ReportType type, Long date){
        this.type = type;
        this.date = date;
    }

    public Report(ReportType type, Double latitude, Double longitude, Long date, Boolean canceled) {
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.canceled = canceled;
    }

    //Constructor Overload
    public Report(ReportType type, Double latitude, Double longitude, Long date, String photo, Boolean canceled) {
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.photo = photo;
        this.canceled = canceled;
    }

    public ReportType getType() {
        return type;
    }

    public void setType(ReportType type) {
        this.type = type;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }
}

