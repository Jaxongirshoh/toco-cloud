package dev.wisespirit.toco_cloud.domains;

import lombok.*;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
