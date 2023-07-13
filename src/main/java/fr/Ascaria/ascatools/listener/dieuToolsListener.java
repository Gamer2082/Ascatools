package fr.Ascaria.ascatools.listener;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class dieuToolsListener implements Listener {
    @EventHandler
    public void onSurInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack it = e.getItem();
        Action ac = e.getAction();
        if (it == null)return;

        if (it.getType() == Material.NETHER_STAR && it.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Giver LV4 --- DIEU")){
            if (ac == Action.LEFT_CLICK_AIR || ac == Action.LEFT_CLICK_BLOCK){
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
                player.sendTitle(ChatColor.YELLOW + "Giver lv4","");

                //A0001
                ItemStack item1 = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta itemMeta1 = item1.getItemMeta();
                itemMeta1.setDisplayName(ChatColor.YELLOW + "Lame divine");
                itemMeta1.setLore(Arrays.asList("Lame tueuse de demon"));
                itemMeta1.addEnchant(Enchantment.DURABILITY, 4, true);
                itemMeta1.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                itemMeta1.addEnchant(Enchantment.KNOCKBACK,2,true);
                itemMeta1.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
                item1.setItemMeta(itemMeta1);

                player.getInventory().addItem(item1);

                //A0002
                ItemStack item2 = new ItemStack(Material.DIAMOND_HOE);
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(ChatColor.YELLOW + "Hoe LV4");
                itemMeta2.setLore(Arrays.asList("Incassable cette Hoe", "Peut etre echangee"));
                itemMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta2.addEnchant(Enchantment.DIG_SPEED, 4, true);
                itemMeta2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4, true);
                itemMeta2.setUnbreakable(true);
                item2.setItemMeta(itemMeta2);

                player.getInventory().addItem(item2);


                //A0003
                ItemStack item3 = new ItemStack(Material.DIAMOND_SHOVEL);
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(ChatColor.YELLOW + "Pelle LV4");
                itemMeta3.setLore(Arrays.asList("Incassable cette pelle", "Peut etre echangee"));
                itemMeta3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta3.addEnchant(Enchantment.DIG_SPEED, 4, true);
                itemMeta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4, true);
                itemMeta3.setUnbreakable(true);
                item3.setItemMeta(itemMeta3);

                player.getInventory().addItem(item3);

                //A0004
                ItemStack item4 = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta itemMeta4 = item4.getItemMeta();
                itemMeta4.setDisplayName(ChatColor.YELLOW + "Pioche LV4");
                itemMeta4.setLore(Arrays.asList("Incassable cette pioche", "Peut etre echangee"));
                itemMeta4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta4.setUnbreakable(true);
                itemMeta4.addEnchant(Enchantment.DIG_SPEED, 4, true);
                itemMeta4.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4, true);
                item4.setItemMeta(itemMeta4);

                player.getInventory().addItem(item4);

                //A0005
                ItemStack item5 = new ItemStack(Material.DIAMOND_AXE);
                ItemMeta itemMeta5 = item5.getItemMeta();
                itemMeta5.setDisplayName(ChatColor.YELLOW + "Hache LV4");
                itemMeta5.setLore(Arrays.asList("Incassable cette hache", "Peut etre echangee"));
                itemMeta5.setUnbreakable(true);
                itemMeta5.addEnchant(Enchantment.DIG_SPEED, 4, true);
                itemMeta5.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4, true);
                item5.setItemMeta(itemMeta5);

                player.getInventory().addItem(item5);

                //A0006
                ItemStack item6 = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta itemMeta6 = item6.getItemMeta();
                itemMeta6.setDisplayName(ChatColor.YELLOW + "couronne de petale");
                itemMeta6.setLore(Arrays.asList("Cree par Apollon"));
                itemMeta6.addEnchant(Enchantment.DURABILITY, 4, true);
                itemMeta6.addEnchant(Enchantment.THORNS, 2, true);
                item6.setItemMeta(itemMeta6);

                player.getInventory().addItem(item6);

                //A0007
                ItemStack item7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta itemMeta7 = item7.getItemMeta();
                itemMeta7.setDisplayName(ChatColor.YELLOW + "Cape de Zeuse");
                itemMeta7.setLore(Arrays.asList("Cape du plus grand dieu"));
                itemMeta7.addEnchant(Enchantment.DURABILITY, 4, true);
                itemMeta7.addEnchant(Enchantment.THORNS, 2, true);
                item7.setItemMeta(itemMeta7);

                player.getInventory().addItem(item7);

                //A0008
                ItemStack item8 = new ItemStack(Material.NETHERITE_LEGGINGS);
                ItemMeta itemMeta8 = item8.getItemMeta();
                itemMeta8.setDisplayName(ChatColor.YELLOW + "Cullot de Zeuse");
                itemMeta8.setLore(Arrays.asList("cette cullote fut porter par Zeuse"));
                itemMeta8.addEnchant(Enchantment.DURABILITY, 4, true);
                itemMeta8.addEnchant(Enchantment.THORNS, 2, true);
                item8.setItemMeta(itemMeta8);

                player.getInventory().addItem(item8);

                //A0009
                ItemStack item9 = new ItemStack(Material.DIAMOND_BOOTS);
                ItemMeta itemMeta9 = item9.getItemMeta();
                itemMeta9.setDisplayName(ChatColor.YELLOW + "Talaria");
                itemMeta9.setLore(Arrays.asList("Botte du messager des dieu"));
                itemMeta9.addEnchant(Enchantment.DURABILITY, 4, true);
                itemMeta9.addEnchant(Enchantment.THORNS, 2, true);
                item9.setItemMeta(itemMeta9);

                player.getInventory().addItem(item9);

            }
        }

    }
}
