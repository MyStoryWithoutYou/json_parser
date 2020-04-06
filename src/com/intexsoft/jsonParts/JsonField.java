package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@NoArgsConstructor
public class JsonField<V> extends JsonPart{
    private String jsonKey;
    private V jsonValue;
    private ArrayList<JsonPart> jsonPartsList = new ArrayList<>();

    public JsonField(String jsonKey, V jsonValue) {
        this.jsonKey = jsonKey.replace("\"", "").trim();
        this.jsonValue = jsonValue;
    }
}
