package com.digisphere.FurnitureCustomizationService.application.command;

import java.util.Map;

public interface ICommand {
    void setParams(Map<String, String> params);
    String execute();
}
