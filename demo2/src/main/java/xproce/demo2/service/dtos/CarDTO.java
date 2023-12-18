package xproce.demo2.service.dtos;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CarDTO {
    private String titre;
    private String model;
    private String color;
    private Float price;
}
