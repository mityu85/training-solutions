package statemachine.seatheater;

public enum SeatHeater {

    OFF {
        SeatHeater next() {
            return SeatHeater.THIRD;
        }
    },
    THIRD {
        SeatHeater next() {
            return SeatHeater.SECOND;
        }
    },
    SECOND {
        SeatHeater next() {
            return SeatHeater.FIRST;
        }
    },
    FIRST {
        SeatHeater next() {
            return SeatHeater.OFF;
        }
    };

    abstract SeatHeater next();
}
