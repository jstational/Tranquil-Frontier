package tf.world.blocks.distribution;

import mindustry.world.blocks.distribution.*;
import mindustry.type.*;

/** Duct that only allows allowedItems to pass */
public class FilterDuct extends Duct {
    public ItemSeq allowedItems;

    public FilterDuct(String name) {
        super(name);
    }
    public class FilterDuctBuild extends DuctBuild {
        public FilterDuct block;
    }
}