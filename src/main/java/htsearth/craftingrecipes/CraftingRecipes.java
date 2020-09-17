package htsearth.craftingrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftingRecipes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    	ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT);
    	
    	NamespacedKey netheriteKey = new NamespacedKey(this, "netherite_ingot");
    	
    	ShapedRecipe netheriteRecipe = new ShapedRecipe(netheriteKey, netherite);
    	netheriteRecipe.shape("DOD", "DED", "DOD");
    	netheriteRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
    	netheriteRecipe.setIngredient('O', Material.OBSIDIAN);
    	netheriteRecipe.setIngredient('E', Material.EMERALD_BLOCK);
    	
    	Bukkit.addRecipe(netheriteRecipe);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
