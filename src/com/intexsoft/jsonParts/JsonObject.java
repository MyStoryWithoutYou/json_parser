package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@NoArgsConstructor
public class JsonObject extends JsonPart{
    private ArrayList<JsonField> jsonObjectList = new ArrayList<>();
}
