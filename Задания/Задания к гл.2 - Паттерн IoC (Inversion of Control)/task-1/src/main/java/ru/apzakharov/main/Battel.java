package ru.apzakharov.main;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Battel {

    private String date;
    private String winner;
    private String place;
}
