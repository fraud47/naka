package com.apkmechanik.league.data;

import com.apkmechanik.league.models.Book;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

@Data
public class ChapterDto {
    private Long id;
    @Size(min = 2 , message = "title are too small")
    private String title;

    private List<PageDto> pages;

}
