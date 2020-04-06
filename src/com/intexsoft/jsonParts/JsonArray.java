package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@NoArgsConstructor
public class JsonArray extends JsonPart{
    private ArrayList<JsonField> jsonArrayList = new ArrayList<>();
}
