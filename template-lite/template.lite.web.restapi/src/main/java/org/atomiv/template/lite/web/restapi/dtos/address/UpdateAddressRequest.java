package org.atomiv.template.lite.web.restapi.dtos.address;

import lombok.Data;

@Data
public class UpdateAddressRequest {
    private Long id;
    private String city;
}