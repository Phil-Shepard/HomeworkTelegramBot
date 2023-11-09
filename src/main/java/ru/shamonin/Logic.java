package ru.shamonin;

public class Logic {
    /**
     *
     * Обработка сообщения
     */
    public String handleMessage(String message){
        return "ваше сообщение" + message;
    }

    /**
     *
     * Запуск бота
     */
    public void startBot(Bot bot){
        bot.start();
    }
}
