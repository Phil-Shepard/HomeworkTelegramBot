package ru.shamonin;

import ru.shamonin.bots.BotVK;
import ru.shamonin.bots.DiscordBot;
import ru.shamonin.bots.TelegramBot;

public class Main {
    public static void main(String[] args) {
        BotVK botVK = new BotVK();
        botVK.start();

        DiscordBot botDiscord = new DiscordBot();
        botDiscord.start();

        TelegramBot botTelegram = new TelegramBot();
        botTelegram.start();
    }
}