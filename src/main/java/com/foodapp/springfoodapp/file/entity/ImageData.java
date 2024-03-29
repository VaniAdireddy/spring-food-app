package com.foodapp.springfoodapp.file.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
@Data
@Entity
public class ImageData {
    @Id@GeneratedValue
    private long id;
    private String name;
    private String type;
    @Lob
    @Column(name = "imagedata",length = 1000)
    private byte[] imageData;

}
