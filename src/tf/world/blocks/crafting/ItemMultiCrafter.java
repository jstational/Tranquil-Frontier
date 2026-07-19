package tf.world.blocks.crafting;

import mindustry.world.blocks.production.*;

public class ItemMultiCrafter extends GenericCrafter {
    public ItemMultiCrafter(String name) {
        super(name);
    }

    public class ItemMultiCrafterBuild extends GenericCrafterBuild {
        public ItemMultiCrafter block;
    }
}