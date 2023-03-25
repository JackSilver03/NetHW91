package ru.netology.javaqa.javaqamvm.radioservices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetValidWaveNearMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);

        int expected = 1;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNotValidWaveNearMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderValidWaveNearMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValidWaveNearMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderValidWaveNearMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidWaveNearMax() {

        Radio radio = new Radio();
        radio.setCurrentWave(8);

        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveInTheBeginning() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveInTheEnd() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveInTheBeginning() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveInTheEnd() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeLevelNearMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeLevelBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValidVolumeLevelNearMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeLevelNearMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeLevelBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValidVolumeLevelNearMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeInTheBeginning() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeInTheEnd() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolumeInTheBeginning() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolumeInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.reduceVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolumeInTheEnd() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}

