package com.intexsoft.jsonParts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class JsonField<V> {
    private String jsonKey;
    private V jsonValue;
}
