package rahulstech.javafx.covid19analysis.http;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

    private final DateTimeFormatter formatter;

    public LocalDateTimeAdapter(String pattern) {
        if (null == pattern || "".equals(pattern)) {
            throw new IllegalArgumentException("pattern must not be empty");
        }
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {}

    @Override
    public LocalDateTime read(JsonReader in) throws IOException {
        return LocalDateTime.parse(in.nextString(),formatter);
    }
}
