package services;

import models.Coordinates;
import ui.ProgramUI;

public class HumanMoveProvider implements MoveProvider {
    private final ProgramUI ui;

    public HumanMoveProvider(ProgramUI ui) {
        this.ui = ui;
    }

    @Override
    public Coordinates getMove(Game game, SessionManager session) {
        return ui.getMove(game, session);
    }
}