package ru.netology;

public class Radio {
    // вводим переменные
    private int quantityStations = 10; // количество радиостанций
    private int firstStation = 0; // первая радиостанция
    private int lastStation = quantityStations - 1; // последняя радиостанция
    private int currentStation;
    private int minVolume = 0; // минимальная громкость
    private int maxVolume = 100; // максимальная громкость
    private int currentVolume;

    // геттеры
    public int getQuantityStations() {
        return quantityStations;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // сеттеры
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    // конструктор установки количества радиостанций по желанию
    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
        this.lastStation = quantityStations - 1;
    }

    // конструктор установки количества радиостанций по умолчанию
    public Radio() {
        this.quantityStations = quantityStations;
    }

    // переключаем на следующую радиостанцию
    public void nextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = firstStation;
        }
    }

    // переключаем на предыдущую радиостанцию
    public void prevStation() {
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    // увеличиваем громкость на 1 пункт
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    // уменьшаем громкость на 1 пункт
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }
}