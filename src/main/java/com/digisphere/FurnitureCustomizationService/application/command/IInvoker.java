package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;

import java.util.Map;

public interface IInvoker {
    void setParams(Map<String, String> params, IDirectorsFacade directorsFacade);
    String executeCommand();
}
