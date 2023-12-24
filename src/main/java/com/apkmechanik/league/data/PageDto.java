package com.apkmechanik.league.data;

import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */
@Data
public class PageDto {
    private Long id;
    @Size(min = 1000, message = "page too small")
    private String textContent;

}
