/**
 * Created by abuzer.alaca on 09/10/2021
 **/

package com.chess.engine.player;

public enum MoveStatus {
    DONE {
        @Override
        public boolean isDone() {
            return true;
        }
    },
    CHECK {
        @Override
        public boolean isDone() {
            return false;
        }
    };

    public abstract boolean isDone();

}
