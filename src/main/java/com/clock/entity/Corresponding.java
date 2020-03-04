package com.clock.entity;

public class Corresponding {
    private Integer id;

    private String clockname;

    private String tablename;

    private Integer clockednumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClockname() {
        return clockname;
    }

    public void setClockname(String clockname) {
        this.clockname = clockname;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Integer getClockednumber() {
        return clockednumber;
    }

    public void setClockednumber(Integer clockednumber) {
        this.clockednumber = clockednumber;
    }
}