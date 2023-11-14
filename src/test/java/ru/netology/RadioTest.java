package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test // инициализаторы полей, установленные по умолчанию
    public void shouldInitFields() {
        Assertions.assertEquals(10, radio.getQuantityStations()); // количество радиостанций по умолчанию
        Assertions.assertEquals(0, radio.getFirstStation());
        Assertions.assertEquals(9, radio.getLastStation());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test // получение информации о текущей радиостанции
    public void shouldCurrentStation() {
        radio.setCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test // переключение на следующую радиостанцию, если текущая 8
    public void shouldNextStation1() {
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test // переключение на следующую радиостанцию, если текущая 9
    public void shouldNextStation2() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test // переключение на предыдущую радиостанцию, если текущая 0
    public void shouldPrevStation1() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test // переключение на предыдущую радиостанцию, если текущая 1
    public void shouldPrevStation2() {
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на -1 и проверка на допустимость
    public void shouldSetDefinedStation1() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на 0 и проверка на допустимость
    public void shouldSetDefinedStation2() {
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на 1 и проверка на допустимость
    public void shouldSetDefinedStation3() {
        radio.setCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на 8 и проверка на допустимость
    public void shouldSetDefinedStation4() {
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на 9 и проверка на допустимость
    public void shouldSetDefinedStation5() {
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test // установление текущей радиостанции на 10 и проверка на допустимость
    public void shouldSetDefinedStation6() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test // получение информации о текущей громкости
    public void shouldCurrentVolume() {
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test // увеличение громкости на 1 пункт, если текущая 99
    public void shouldIncreaseVolume1() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test // увеличение громкости на 1 пункт, если текущая 100 (максимальная)
    public void shouldIncreaseVolume2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test // уменьшение громкости на 1 пункт, если текущая 1
    public void shouldDecreaseVolume1() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test // уменьшение громкости на 1 пункт, если текущая 0 (минимальная)
    public void shouldDecreaseVolume2() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test // установка количества радиостанций по желанию
    public void shouldConstructorWithArgument() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getQuantityStations());
        Assertions.assertEquals(19, radio.getLastStation());
    }
}