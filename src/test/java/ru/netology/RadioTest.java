package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // тест получение информации о текущей радиостанции
    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.currentStation = 1;
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // тест переключение на следующую радиостанцию
    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio();
        radio.currentStation = 8;
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation2() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // тест переключение на предыдущую радиостанцию
    @Test
    public void shouldPrevStation1() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation2() {
        Radio radio = new Radio();
        radio.currentStation = 1;
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // тест установление иной радиостанции и проверка на допустимость
    @Test
    public void shouldSetDefinedStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefinedStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefinedStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefinedStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefinedStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefinedStation6() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // тест получение информации о текущей громкости
    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тест увеличение громкости на 1 пункт
    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.currentVolume = 99;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тест уменьшение громкости на 1 пункт
    @Test
    public void shouldDecreaseVolume1() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}