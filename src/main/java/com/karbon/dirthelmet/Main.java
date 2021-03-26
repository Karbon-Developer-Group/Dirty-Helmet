package com.karbon.dirthelmet;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = helmet.getItemMeta();
        meta.setCustomModelData(1);
        meta.setDisplayName("土のヘルメット");
        helmet.setItemMeta(meta);
        ShapedRecipe dirt_helmet = new ShapedRecipe(helmet);
        dirt_helmet.shape("***","*%*","%%%");
        dirt_helmet.setIngredient('*', Material.DIRT, 1);
        dirt_helmet.setIngredient('%', Material.AIR);
        getServer().addRecipe(dirt_helmet);

        ItemStack helmet2 = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta2 = helmet.getItemMeta();
        meta2.setCustomModelData(1);
        meta2.setDisplayName("土のヘルメット");
        ShapedRecipe dirt_helmet2 = new ShapedRecipe(helmet2);
        helmet.setItemMeta(meta2);
        dirt_helmet2.shape("%%%","***","*%*");
        dirt_helmet2.setIngredient('*', Material.DIRT, 1);
        dirt_helmet2.setIngredient('%', Material.AIR);
        getServer().addRecipe(dirt_helmet2);
    }

    @Override
    public void onDisable() {
    }
}
