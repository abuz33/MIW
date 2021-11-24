package model;

import java.util.Map;

public class User {
    public int rank;
    public int progress;

    public User() {
        rank = -8;
        progress = 0;
    }

    public void incProgress(int progRank) {
        if (progRank < -8 || progRank > 8 || progRank == 0) throw new IllegalArgumentException("cannot calculate");
        int rankDifference = progRank - this.rank;
        int incProg;
        if ((progRank > 0 && this.rank < 0)) rankDifference--;
        if ((this.rank > 0 && progRank < 0)) rankDifference++;
        if (rankDifference >= -1) {
            if (rankDifference == -1) {
                incProg = 1;
            } else if (rankDifference == 0) {
                incProg = 3;
            } else {
                incProg = (int) (Math.pow(rankDifference, 2) * 10);
            }
            System.out.printf("Current Rank : %3s\t Progress: %3s\tRank : %3s\tProblem Progress: %3s\n", this.rank, this.progress, progRank, incProg);
            this.progress += incProg;
            checkProgress();
        }
    }

    private void checkProgress() {
        if (this.progress >= 100) {
            int rankInc = this.progress / 100;
            if (this.rank == -1) {
                this.rank++;
            }
            this.rank += rankInc;

            if (this.rank == 0) this.rank++;
            this.progress = this.progress % 100;
        }

        if (this.rank == 8) {
            this.progress = 0;
        }
    }
}
