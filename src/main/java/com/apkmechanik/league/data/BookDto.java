package com.apkmechanik.league.data;

import com.apkmechanik.league.models.Chapter;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

@Data
public class BookDto {
private Long id;
@Size(min = 2,message = "title is too small.")
private String title;
private String isbn;
private List<ChapterDto> chapters;
}
