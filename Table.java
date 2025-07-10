package com.app.routinemanagementsystem;

public class Table {
    private int sl;
    private int id;
    private String name;
    private String Varsity_name;


    public Table(int sl, int id, String name, String varsity_name) {
        this.sl = sl;
        this.id = id;
        this.name = name;
        Varsity_name = varsity_name;
    }

    public int getSl() {
        return sl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVarsity_name() {
        return Varsity_name;
    }
}
