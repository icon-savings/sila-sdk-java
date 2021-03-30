package com.silamoney.clientrefactored.domain;

import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Change {
    
    private String attribute;
    @SerializedName("old_value")
    private String oldValue;
    @SerializedName("new_value")
    private String newValue;

}
