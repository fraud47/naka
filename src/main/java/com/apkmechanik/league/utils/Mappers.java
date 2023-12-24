package com.apkmechanik.league.utils;

import com.apkmechanik.league.data.BookDto;
import com.apkmechanik.league.data.ChapterDto;
import com.apkmechanik.league.data.PageDto;
import com.apkmechanik.league.models.Book;
import com.apkmechanik.league.models.Chapter;
import com.apkmechanik.league.models.Page;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

public class Mappers {
    public static Book mapToBook(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(book.getTitle());
        book.setIsbn(bookDto.getIsbn());
        List<Chapter> chapters = bookDto.getChapters().stream()
                .map(chapterDto -> ChapterMapper.mapToChapter(chapterDto))
                .collect(Collectors.toList());
        book.setChapters(chapters);
        return book;
    }

    public class ChapterMapper {
        public static Chapter mapToChapter(ChapterDto chapterDto) {
            Chapter chapter = new Chapter();
            chapter.setId(chapterDto.getId());
            chapter.setTitle(chapterDto.getTitle());

            // If you have a list of pages in the ChapterDto, you can map them here.
            // Assuming ChapterDto has a List<PageDto> pages field.
            List<Page> pages = chapterDto.getPages().stream()
                    .map(pageDto -> PageMapper.mapToPage(pageDto))
                    .collect(Collectors.toList());
            chapter.setPages(pages);

            return chapter;
        }
        public class PageMapper {
            public static Page mapToPage(PageDto pageDto) {
                Page page = new Page();
                page.setId(pageDto.getId());
                page.setTextContent(pageDto.getTextContent());
                // Add any additional mappings if needed
                return page;
            }
        }

    }




}
