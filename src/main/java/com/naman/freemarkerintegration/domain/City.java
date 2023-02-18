package com.naman.freemarkerintegration.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class City {
    private long id;
    private String name;
    private long population;
}
