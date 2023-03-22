import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvm.radioservices.Radio;

public class AnotherRadioTest {

    @Test
    public void shouldSetValidWaveNearMin() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(1);

        int expected = 1;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNotValidWaveNearMin() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderValidWaveNearMin() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValidWaveNearMax() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(63);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderValidWaveNearMax() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(62);

        int expected = 62;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidWaveNearMax() {

        Radio radio = new Radio(63);
        radio.setCurrentWave(61);

        int expected = 61;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveInTheMiddle () {
        Radio radio = new Radio(63);
        radio.setCurrentWave(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextWaveInTheBeginning () {
        Radio radio = new Radio(63);
        radio.setCurrentWave(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextWaveInTheBorderOfBeginning () {
        Radio radio = new Radio(63);
        radio.setCurrentWave(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextWaveInTheEnd () {
        Radio radio = new Radio(63);
        radio.setCurrentWave(62);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextWaveInTheBorderOfEnd () {
        Radio radio = new Radio(63);
        radio.setCurrentWave(61);

        radio.next();

        int expected = 62;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevWaveInTheBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(0);

        radio.prev();

        int expected = 62;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevWaveInTheBorderOfBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(0);

        radio.prev();

        int expected = 62;
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
        Radio radio = new Radio(63);
        radio.setCurrentWave(62);

        radio.prev();

        int expected = 61;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevWaveInTheBorderOfEnd() {
        Radio radio = new Radio(63);
        radio.setCurrentWave(61);

        radio.prev();

        int expected = 60;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetValidVolumeLevelNearMin() {
        Radio radio = new Radio(63);
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
        Radio radio = new Radio(63);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetValidVolumeLevelNearMax() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetValidVolumeLevelBorderMax() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNotValidVolumeLevelNearMax() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeInTheBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeInTheBorderOfBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeInTheMiddle() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeInTheBorderOfEnd() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeInTheEnd() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeInTheBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeInThBorderOfeBeginning() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeInTheMiddle() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(6);

        radio.reduceVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeInTheBorderOfEnd() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(99);

        radio.reduceVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeInTheEnd() {
        Radio radio = new Radio(63);
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}

