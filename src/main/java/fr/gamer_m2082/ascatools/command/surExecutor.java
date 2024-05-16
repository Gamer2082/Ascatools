package fr.gamer_m2082.ascatools.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class surExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player))return false;
        Player player = (Player) sender;

        // Ascatools.A0000.giveStart(player);
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Giver LV1 --- SURVIVANT");
        itemMeta.setLore(Arrays.asList("Click Droit", "Pour obtenir les items"));
        itemMeta.addEnchant(Enchantment.LUCK, 1, true);
        item.setItemMeta(itemMeta);
        player.getInventory().addItem(item);
        return true;
    }

}
