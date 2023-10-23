package satisfyu.nethervinery.compat.rei.press;


import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.world.item.Items;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.vinery.registry.ObjectRegistry;

import java.util.Collections;
import java.util.List;

public class WinePressDisplay implements Display {

    public static final CategoryIdentifier<WinePressDisplay> WINE_PRESS_DISPLAY = CategoryIdentifier.of(NetherVinery.MODID, "apple_press_display");


    @Override
    public List<EntryIngredient> getInputEntries() {
        return Collections.singletonList(EntryIngredients.of(Items.APPLE));
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return Collections.singletonList(EntryIngredients.of(ObjectRegistry.APPLE_MASH.get()));
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return WINE_PRESS_DISPLAY;
    }


}
