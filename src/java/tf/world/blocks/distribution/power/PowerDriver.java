package tf.world.blocks.distribution.power;

import mindustry.world.Block;
import mindustry.gen.Building;

public class PowerDriver extends Block {
    public PowerDriver(String name) {
        super(name);
    }

    public class PowerDriverBuild extends Building {
        public PowerDriver block;
    }
}