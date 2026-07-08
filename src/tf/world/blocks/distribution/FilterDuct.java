package tf.world.blocks.distribution;

import mindustry.world.blocks.distribution.*;
import mindustry.gen.Building;
import mindustry.type.*;

public class FilterDuct extends Duct {
    public ItemSeq AllowedItems;

    public FilterDuct(String name) {
        super(name);
    }
    public class FilterDuctBuild extends DuctBuild {}
}