package com.digisphere.FurnitureCustomizationService.application.command;

import java.util.Map;

public interface IInvoker {
    String executeCommand(Map<String, String> params);
}
