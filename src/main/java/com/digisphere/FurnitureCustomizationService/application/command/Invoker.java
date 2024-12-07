package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;

import java.util.HashMap;
import java.util.Map;

public class Invoker implements IInvoker {
    private Map<String, ICommand> commands = new HashMap<> ();
    private final IDirectorsFacade directorsFacade;

    public Invoker(IDirectorsFacade directorsFacade) {
        this.directorsFacade = directorsFacade;
    }

    private void setCommands() {
        commands.put("table", new TableCommand(directorsFacade));
        commands.put("chair", new ChairCommand(directorsFacade));
    }

    @Override
    public String executeCommand(Map<String, String> params) {
        var command = commands.get(params.get("category").toLowerCase());
        command.setParams(params);
        return command.execute();
    }

}
