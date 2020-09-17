package htsearth.craftingrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftingRecipes extends JavaPlugin {

	NamespacedKey cryingObsidianKey = new NamespacedKey(this, "crying_obsidian");
	NamespacedKey netheriteKey = new NamespacedKey(this, "netherite_ingot");

    @Override
    public void onEnable() {
        // Plugin startup logic
    	ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT);
    	
    	
    	ShapedRecipe netheriteRecipe = new ShapedRecipe(netheriteKey, netherite);
    	netheriteRecipe.shape("DOD", "DGD", "DOD");
    	netheriteRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
    	netheriteRecipe.setIngredient('O', Material.OBSIDIAN);
    	netheriteRecipe.setIngredient('G', Material.GOLD_BLOCK);
    	
    	Bukkit.addRecipe(netheriteRecipe);
    	
    	ItemStack cryingObsidian = new ItemStack(Material.CRYING_OBSIDIAN);
    	
    	
    	ShapedRecipe cryingObsidianRecipe = new ShapedRecipe(cryingObsidianKey, cryingObsidian);
    	cryingObsidianRecipe.shape("OLO");
    	cryingObsidianRecipe.setIngredient('O', Material.OBSIDIAN);
    	cryingObsidianRecipe.setIngredient('L', Material.LAPIS_LAZULI);

    	Bukkit.addRecipe(cryingObsidianRecipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    	Bukkit.removeRecipe(cryingObsidianKey);
    	Bukkit.removeRecipe(netheriteKey);

    }
}
