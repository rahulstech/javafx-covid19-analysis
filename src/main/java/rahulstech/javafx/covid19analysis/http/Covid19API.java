package rahulstech.javafx.covid19analysis.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Covid19API {

    private static String apiKey = null;

    public static WorldData fetchCountryWiseWorldData() {
        OkHttpClient client = new OkHttpClient();
        Request request = newRequest(getAPIKey(),"api");
        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class,new LocalDateTimeAdapter("yyyy-MM-dd HH:mm:ss"))
                    .create();
            return gson.fromJson(response.body().charStream(), WorldData.class);
        }
        catch (IOException e) {
            throw new APIException("exception occurred during fetch country wise world data", e);
        }
    }

    public static IndiaTimeline fetchIndiaTimelineData() {
        OkHttpClient client = new OkHttpClient();
        Request request = newRequest(getAPIKey(),"api_india_timeline");
        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDate.class,new LocalDateAdapter("yyyy-MM-dd"))
                    .create();
            return gson.fromJson(response.body().charStream(), IndiaTimeline.class);
        }
        catch (IOException e) {
            throw new APIException("exception occurred during fetch india timeline data", e);
        }
    }

    public static IndiaStateWiseData fetchIndiaStateWiseData() {
        OkHttpClient client = new OkHttpClient();
        Request request = newRequest(getAPIKey(),"api_india");
        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class,new LocalDateAdapter("dd/MM/yyyy HH:mm:ss"))
                    .create();
            return gson.fromJson(response.body().charStream(), IndiaStateWiseData.class);
        }
        catch (IOException e) {
            throw new APIException("exception occurred during fetch india state wise data", e);
        }
    }

    private static Request newRequest(String apiKey, String path) {
        return new Request.Builder()
                .url("https://corona-virus-world-and-india-data.p.rapidapi.com/"+path)
                .get()
                .addHeader("x-rapidapi-key", apiKey)
                .addHeader("x-rapidapi-host", "corona-virus-world-and-india-data.p.rapidapi.com")
                .build();
    }

    private static String getAPIKey() {
        if (null == apiKey) {
            try (BufferedReader reader = new BufferedReader( new FileReader("/apikey.txt"))) {
                apiKey = reader.readLine();
            }
            catch (IOException e) {
                throw new APIException("unable to read api key from file", e);
            }
        }
        return apiKey;
    }
}
