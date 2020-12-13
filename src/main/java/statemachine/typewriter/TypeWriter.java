package statemachine.typewriter;

public enum TypeWriter {

    SMALL_CAPS {
        @Override
        TypeWriter next() {
            return TypeWriter.BIG_CAPS;
        }
    },
    BIG_CAPS {
        @Override
        TypeWriter next() {
            return TypeWriter.SMALL_CAPS;
        }
    };

    abstract TypeWriter next();
}
