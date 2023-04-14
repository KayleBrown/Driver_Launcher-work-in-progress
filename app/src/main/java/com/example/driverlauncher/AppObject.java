package com.example.driverlauncher;

import android.graphics.drawable.Drawable;

public class AppObject {
    private String name, packageName;
    private Drawable image;

    public AppObject(String PackageName, String Name, Drawable image){
        this.name = name;
        this.packageName = packageName;
        this.image = image;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }
}
