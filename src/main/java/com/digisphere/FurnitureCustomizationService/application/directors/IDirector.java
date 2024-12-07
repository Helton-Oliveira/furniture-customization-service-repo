package com.digisphere.FurnitureCustomizationService.application.directors;

import java.util.Map;

public interface IDirector {
    <T> T create(Map<String, String> data);
}
