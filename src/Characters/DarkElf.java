package Characters;

import java.util.ArrayList;

public class DarkElf extends CharacterType {

    public DarkElf(String name) {
        super(name);
        this.type = "Dark Elf";

        this.strength = 10;
        this.intelligence = 22;
        this.wisdom = 15;
        this.dexterity = 23;
        this.constitution = 0;

        this.spells = new ArrayList<>();
        this.spells.add("frost");
        this.spells.add("flame");

        this.inventory = new ArrayList<>();
        this.inventory.add("Staff of Lightning");
        this.inventory.add("Robes of Minor Healing");
    }
    /* DESCRIPTION: Elves are a slender race, with both genders
    standing around five feet tall and weighing around 130
    pounds. Most have dark hair, with little or no body or
    facial hair. Their skin is pale, and they have pointed ears
    and delicate features. Elves are lithe and graceful. They
    have keen eyesight and hearing. Elves are typically
    inquisitive, passionate, self-assured, and sometimes
    haughty. Their typical lifespan is a dozen centuries or
    more.

    RESTRICTIONS: Elves may become Clerics, Fighters, MagicUsers
    or Thieves; they are also allowed to combine the
    classes of Fighter and Magic-User, and of Magic-User and
    Thief (see Combination Classes, below). They are
    required to have a minimum Intelligence of 9. Due to their
    generally delicate nature, they may not have a
    Constitution higher than 17. Elves never roll larger than
    six-sided dice (d6) for hit points.

    SPECIAL ABILITIES: All Elves have Darkvision with a 60'
    range. They are able to find secret doors more often than
    normal (1-2 on 1d6 rather than the usual 1 on 1d6). An
    Elf is so observant that one has a 1 on 1d6 chance to find
    a secret door with a cursory look. Elves are immune to
    the paralyzing attack of ghouls. Also, they are less likely to
    be surprised in combat, reducing the chance of surprise by
    1 in 1d6.

    SAVING THROWS: Elves save at +1 vs. Paralysis or Petrify,
    and +2 vs. Magic Wands and Spells.*/
}
