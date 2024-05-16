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

public class debugExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) return false;

        Player player = (Player) commandSender;

        // Ascatools.E0000.giveStart(player);
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Giver LV0 --- Dev debuger");
        itemMeta.setLore(Arrays.asList("$4Click Droit", "Pour obtenir les items"));
        itemMeta.addEnchant(Enchantment.LUCK, 10, true);
        item.setItemMeta(itemMeta);
        player.getInventory().addItem(item);
        return true;
    }
}
