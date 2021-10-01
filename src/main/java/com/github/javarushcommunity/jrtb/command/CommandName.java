package com.github.javarushcommunity.jrtb.command;

/**
 * Enumeration for {@link Command}'s.
 */
public enum CommandName {

    START ("/start"),
    STOP ("/stop"),
    NO ("/no"),
    STAT ("/stat"),
    ADD_GROUP_SUB("/addgroupsub"),
    LIST_GROUP_SUB("/listgroupsub"),
    DELETE_GROUP_SUB("/deletegroupsub"),
    HELP ("/help"),
    ADMIN_HELP("/ahelp");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}