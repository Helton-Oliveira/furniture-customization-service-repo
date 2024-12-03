package com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder;

import com.digisphere.FurnitureCustomizationService.application.chair.domain.Chair;

import java.util.Map;

public interface IChairDirector {
    Chair createChair(Map<String, String> data);
}
