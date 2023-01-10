package com.example.practiceround;

import java.util.Date;

public class Hart {
    private int id;
    private String go_hart;
    private String ge_hart;
    private String ba_hart;
    private String scene;
    private Date deleted;

    public Hart(int id, String go_hart, String ge_hart, String ba_hart, Date deleted) {
        this.id = id;
        this.go_hart = go_hart;
        this.ge_hart = ge_hart;
        this.ba_hart = ba_hart;
        this.deleted = deleted;
    }

    public Hart(int id, String go_hart, String ge_hart, String ba_hart) {
        this.id = id;
        this.go_hart = go_hart;
        this.ge_hart = ge_hart;
        this.ba_hart = ba_hart;
        deleted = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGo_hart() {
        return go_hart;
    }

    public void setGo_hart(String go_hart) {
        this.go_hart = go_hart;
    }

    public String getGe_hart() {
        return ge_hart;
    }

    public void setGe_hart(String ge_hart) {
        this.ge_hart = ge_hart;
    }

    public String getBa_hart() {
        return ba_hart;
    }

    public void setBa_hart(String ba_hart) {
        this.ba_hart = ba_hart;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}
