package rahulstech.javafx.covid19analysis.http;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends TypeAdapter<LocalDate> {

    private final DateTimeFormatter formatter;

    public LocalDateAdapter(String pattern) {
        if (null == pattern || "".equals(pattern)) {
            throw new IllegalArgumentException("pattern must not be empty");
        }
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public void write(JsonWriter out, LocalDate value) throws IOException {}

    @Override
    public LocalDate read(JsonReader in) throws IOException {
        return LocalDate.parse(in.nextString(),formatter);
    }
}
