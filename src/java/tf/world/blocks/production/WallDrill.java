package tf.world.blocks.production;

import mindustry.world.*;
import mindustry.gen.Building;

/** A more dynamic implementation of BeamDril and WallCrafter */
public class WallDrill extends Block {
    public WallDrill(String name) {
        super(name);
    }

    public class WallDrillBuild extends Building {
        public WallDrill block;
    }
}