package com.wordweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by:
 */
public class County extends DataSupport {
    private int id;

    private String counttyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCounttyName() {
        return counttyName;
    }

    public void setCounttyName(String counttyName) {
        this.counttyName = counttyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
