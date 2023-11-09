package ru.shamonin;

public interface Bot {
    /**
     *
     * Запуск бота
     */
    public void start();

    /**
     *
     * Отправка сообщения
     */
    public void sendMessage(String message);
}
