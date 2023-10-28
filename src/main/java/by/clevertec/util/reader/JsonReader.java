package by.clevertec.util.reader;

import by.clevertec.exception.IOFileException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class JsonReader implements Reader {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public <T> List<T> getModelData(String fileName, TypeReference<List<T>> typeReference) {
        try {
            return newMapper().readValue(new File(fileName), typeReference);

        } catch (IOException e) {
            throw new IOFileException(e.getMessage());
        }
    }

    private static ObjectMapper newMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setDateFormat(DATE_FORMAT);
        mapper.setLocale(Locale.ENGLISH);
        mapper.registerModule(new JavaTimeModule());

        return mapper;
    }
}
