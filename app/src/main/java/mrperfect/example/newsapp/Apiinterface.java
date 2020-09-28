package mrperfect.example.newsapp;

import mrperfect.example.newsapp.Model.Headlines;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface Apiinterface {

    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );
}
