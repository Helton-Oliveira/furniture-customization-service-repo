package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.command.commands.*;
import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.HashMap;
import java.util.Map;

public class Invoker implements IInvoker {
    private final Map<String, AbstractCommand> commands = new HashMap<> ();

    public Invoker(IProcessOrder processOrder, Map<String, String> params) {
        this.setCommands(processOrder, params);
    }

    private void setCommands(IProcessOrder processOrder, Map<String, String> params) {
        commands.put("table", new TableCommand(processOrder, params));
        commands.put("chair", new ChairCommand(processOrder, params));
        commands.put("cabinet", new CabinetCommand(processOrder, params));
        commands.put("bookCase", new BookCaseCommand(processOrder, params));
    }

    @Override
    public String executeCommand(String keyCommand) {
        return commands.get(keyCommand).execute();
    }

}
