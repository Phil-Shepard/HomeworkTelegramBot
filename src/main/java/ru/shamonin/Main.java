package ru.shamonin;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.shamonin.bot.TelegramBot;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBot = new TelegramBotsApi(DefaultBotSession.class);
        telegramBot.registerBot(new TelegramBot());
    }
}