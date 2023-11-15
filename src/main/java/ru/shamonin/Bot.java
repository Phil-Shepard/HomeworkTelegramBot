package ru.shamonin;

/**
 * интерфейс бота
 */
public interface Bot extends Logic{

    /**
     *
     * Отправка сообщения
     */
    public void sendMessage(String message);
}
