package ru.netology;

public class Radio {
    // вводим переменные текущей радиостанции и текущей громкости
    public int currentStation;
    public int currentVolume;

    // получаем информацию о текущей радиостанции
    public int getCurrentStation() {
        return currentStation;
    }

    // переключаем на следующую радиостанцию
    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    // переключаем на предыдущую радиостанцию
    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    // установливаем иную радиостанцию и проверяем на допустимость
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    // получаем информацию о текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // увеличиваем громкость на 1 пункт
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    // уменьшаем громкость на 1 пункт
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }
}