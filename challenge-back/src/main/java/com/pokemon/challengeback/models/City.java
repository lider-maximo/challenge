package com.pokemon.challengeback.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {

    String id;
    String name;
    CityTemperature cityTemperature;
}
