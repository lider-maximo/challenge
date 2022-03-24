package com.pokemon.challengeback.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Id;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PokemonType {

    String id;
    String designation;

}
