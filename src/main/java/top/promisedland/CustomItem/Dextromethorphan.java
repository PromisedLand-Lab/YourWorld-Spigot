package top.promisedland.CustomItem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Dextromethorphan {

    public static ItemStack getDextromethorphan(){
        ItemStack i =new ItemStack(Material.PUMPKIN_SEEDS);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName("右美沙芬");
        i.setItemMeta(im);
        return i;
    }


}
