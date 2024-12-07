package com.digisphere.FurnitureCustomizationService.application.facadePattern;

import java.util.List;
import java.util.Map;

 public interface IProcessOrder {
     void validateFields(List<String> fields, Map<String, String> reqData);
     String process(Map<String, String> reqData);
}
