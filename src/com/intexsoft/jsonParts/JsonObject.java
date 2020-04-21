package com.intexsoft.jsonParts;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
public class JsonObject {
    private ArrayList<JsonField> jsonObjectList = new ArrayList<>();
}
