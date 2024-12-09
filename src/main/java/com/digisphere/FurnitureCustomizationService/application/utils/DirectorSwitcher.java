package com.digisphere.FurnitureCustomizationService.application.utils;

import com.digisphere.FurnitureCustomizationService.application.directors.ChairDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.TableDirector;

public class DirectorSwitcher {

    public static IDirector choice(String category) {
        IDirector director = null;
        switch (category.toLowerCase()) {
            case "table" -> director = new TableDirector();
            case "chair" -> director = new ChairDirector();
        }

        return director;
    }
}
