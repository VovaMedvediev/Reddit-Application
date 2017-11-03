package com.example.redditapp.Account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 03.11.2017.
 */

public class CheckLogin {

    @SerializedName("json")
    @Expose
    private Json json;

    public Json getJson() {
        return json;
    }

    public void setJson(Json json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "CheckLogin{" +
                "json=" + json +
                '}';
    }
}
