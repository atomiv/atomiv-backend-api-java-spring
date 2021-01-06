package org.atomiv.template.lite.web.restapi.dtos.product;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateProductResponse {

    private Long id;

    private String name;

    LocalDateTime lastModified = LocalDateTime.now();
}
