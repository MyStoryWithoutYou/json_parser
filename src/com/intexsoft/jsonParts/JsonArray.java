package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
public class JsonArray extends JsonPart{
    private ArrayList<JsonField> jsonArrayList = new ArrayList<>();
}
