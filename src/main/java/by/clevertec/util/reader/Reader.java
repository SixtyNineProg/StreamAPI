package by.clevertec.util.reader;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public interface Reader {

    <T> List<T> getModelData(String fileName, TypeReference<List<T>> typeReference);
}
