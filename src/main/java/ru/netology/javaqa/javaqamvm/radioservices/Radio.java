package ru.netology.javaqa.javaqamvm.radioservices;

public class Radio {
    private int currentWave;

    private int currentVolume;

    private int maxWave = 9;

    private int maxLevelVolume = 10;

    public Radio() {

    }

    public Radio(int waveCount) {
        maxWave = waveCount - 1;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }

        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void next() {
        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = maxWave;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
        if (newCurrentVolume > maxLevelVolume) {
            newCurrentVolume = maxLevelVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxLevelVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

