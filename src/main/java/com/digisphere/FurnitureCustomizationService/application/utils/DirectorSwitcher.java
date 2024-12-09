package com.digisphere.FurnitureCustomizationService.application.utils;

import com.digisphere.FurnitureCustomizationService.application.directors.*;

public class DirectorSwitcher {

    public static IDirector choice(String category) {
        IDirector director = null;
        switch (category.toLowerCase()) {
            case "table" -> director = new TableDirector();
            case "chair" -> director = new ChairDirector();
            case "cabinet" -> director = new CabinetDirector();
            case "bookcase" -> director = new BookCaseDirector();
        }

        return director;
    }
}
