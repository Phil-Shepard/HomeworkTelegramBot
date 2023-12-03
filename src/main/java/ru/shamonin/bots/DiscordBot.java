package ru.shamonin.bots;

import ru.shamonin.Bot;
import ru.shamonin.Logic;

/**
 * Бот Дискорда
 */
public class DiscordBot implements Bot {

    Logic logic;

    public void start() {

    }

    @Override
    public void sendMessage(String message) {

    }


    public String handleMessage(String message) {
        return logic.handleMessage(message);
    }
}
