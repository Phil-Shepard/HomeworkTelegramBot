package ru.shamonin.bots;

import ru.shamonin.Bot;

public class DiscordBot extends Bot {
    @Override
    public String handleMessage(String message) {
        return "Ваше сообщение: " + message;
    }
}
