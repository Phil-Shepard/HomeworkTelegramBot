package ru.shamonin.bots;


import ru.shamonin.Bot;

public class TelegramBot extends Bot {


    @Override
    public String handleMessage(String message) {
        return "Ваше сообщение: " + message;
    }
}
