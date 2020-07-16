package com.minecolonies.api.advancements.colony_population;

import com.minecolonies.api.util.constant.Constants;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.util.ResourceLocation;

public class ColonyPopulationCriterionInstance extends CriterionInstance
{
    private int populationCount;

    public ColonyPopulationCriterionInstance(final int populationCount)
    {
        super(new ResourceLocation(Constants.MOD_ID, Constants.CRITERION_COLONY_POPULATION), EntityPredicate.AndPredicate.ANY_AND);

        this.populationCount = populationCount;
    }

    public boolean test(final int populationCount)
    {
        //Less than sign used just in case a previous population increase was missed.
        return this.populationCount <= populationCount;
    }
}
