package com.digisphere.FurnitureCustomizationService.application.bookcase.bookcaseBuilder;

import com.digisphere.FurnitureCustomizationService.application.bookcase.domain.BookCase;

import java.util.Map;

public interface IBookCaseDirector {
    BookCase createBookCase(Map<String, String> data);
}
