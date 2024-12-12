package com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability;

import java.util.List;
import java.util.Map;

public interface IRequestHandler {
    void valid(Map<String, String> params, List<String> keys);
}
