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

public class dieuExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))return false;
        Player player = (Player) sender;


        // Ascatools.A0000.giveStart(player);
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "Giver LV4 --- DIEU");
        itemMeta.setLore(Arrays.asList("Click Droit", "Pour obtenir les items"));
        itemMeta.addEnchant(Enchantment.LUCK, 4, true);
        item.setItemMeta(itemMeta);
        player.getInventory().addItem(item);
        return true;
    }
}
