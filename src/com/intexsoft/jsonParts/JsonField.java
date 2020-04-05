package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class JsonField<V> extends JsonPart{
    private String jsonKey;
    private V jsonValue;

    public JsonField(String jsonKey, V jsonValue) {
        this.jsonKey = jsonKey.replace("\"", "").trim();
        this.jsonValue = jsonValue;
    }
}
