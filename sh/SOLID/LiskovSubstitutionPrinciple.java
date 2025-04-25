package src.sh.SOLID;

public class LiskovSubstitutionPrinciple {

    class Bird {
        void fly() { }
    }

    class Ostrich extends Bird {
        // Không bay được, nhưng lại override fly() → vi phạm LSP
    }
}
