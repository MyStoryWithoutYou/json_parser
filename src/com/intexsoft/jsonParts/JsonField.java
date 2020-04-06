package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class JsonField<V> {
    private String jsonKey;
    private V jsonValue;
    private ArrayList<JsonField> jsonFieldList = new ArrayList<>();

    public JsonField(String jsonKey, V jsonValue) {
        this.jsonKey = jsonKey.replace("\"", "").trim();
        this.jsonValue = jsonValue;
    }

    @Override
    public String toString() {
        return jsonKey + ": " +jsonValue;
    }
}
