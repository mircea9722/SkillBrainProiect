package example.Tema3.WarriorsAndWizards;
class Wizard extends Fighter {
    private boolean spellPrepared;

    @Override
    int damagePoints(Fighter opponent) {
        if (spellPrepared) {
            return 12; // Deal 12 damage if the spell is prepared
        } else {
            return 3;  // Deal 3 damage if the spell is not prepared
        }
    }

    void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    int demgePoint(Fighter opponent) {
        return 0;
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared; // Wizard is vulnerable if the spell is not prepared
    }
}


