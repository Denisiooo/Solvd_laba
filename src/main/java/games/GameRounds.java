package games;

import exceptions.TeamsNullException;

public interface GameRounds {
    void oneEightFinal() throws TeamsNullException;
    void oneForthFinal() throws TeamsNullException;
    void semiFinal() throws TeamsNullException;
}
