package com.example.redditapp;

import com.example.redditapp.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Вовасик on 09.10.2017.
 */

public interface FeedAPI {

    String BASE_URL = "https://www.reddit.com/r/";

        @GET("{feed_name}/.rss")
        Call<Feed> getFeed(@Path("feed_name") String feed_name);

}
