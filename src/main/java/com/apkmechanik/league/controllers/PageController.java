package com.apkmechanik.league.controllers;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

@RestController
@RequestMapping("/api/books/{bookId}/chapters/{chapterId}/pages")
public class PageController {
    // Define endpoints to retrieve page text content
//    @GetMapping("/{pageId}/content")
//    public ResponseEntity<String> getPageContent(@PathVariable Long bookId, @PathVariable Long chapterId, @PathVariable Long pageId) {
//        // Retrieve and return the text content of the specified page
//    }
}