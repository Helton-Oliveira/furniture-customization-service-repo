package com.digisphere.FurnitureCustomizationService.application.useCase;

import java.util.Map;

 public interface IProcessOrder {
     String execute(Map<String, String> reqData);
}
