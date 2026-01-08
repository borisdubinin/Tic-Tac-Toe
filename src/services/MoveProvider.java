package services;

import models.Coordinates;

public interface MoveProvider {
    Coordinates getMove(Game game, SessionManager session);
}
