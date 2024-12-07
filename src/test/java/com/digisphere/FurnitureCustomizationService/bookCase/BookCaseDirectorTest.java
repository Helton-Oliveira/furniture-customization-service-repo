/*package com.digisphere.FurnitureCustomizationService.bookCase;

import com.digisphere.FurnitureCustomizationService.application.directors.BookCaseDirector;
import com.digisphere.FurnitureCustomizationService.application.bookcase.domain.BookCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class BookCaseDirectorTest {

    @Test
    @DisplayName("deve criasr uma estante")
    void createBookCase() {
        Map<String, String> data = new HashMap<>();
        data.put("creatorsId", UUID.randomUUID().toString());
        data.put("material", "Wood");
        data.put("numberOfShelves", "5");
        data.put("heightBetweenShelves", "30cm");
        data.put("mouthingSystem", "Wall-Mounted");
        data.put("width", "100cm");
        data.put("height", "200cm");
        data.put("depth", "40cm");
        data.put("externalFinish", "Glossy");
        data.put("weightSupportedPerShelf", "20kg");
        data.put("style", "Modern");


        var bookCaseDirector = new BookCaseDirector();
        BookCase bookCase = bookCaseDirector.createBookCase(data);

        assertThat(bookCase.getId()).isNotNull();
    }
}*/
