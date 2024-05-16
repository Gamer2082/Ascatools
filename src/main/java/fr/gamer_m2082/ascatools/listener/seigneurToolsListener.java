package fr.gamer_m2082.ascatools.listener;

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

public class seigneurToolsListener implements Listener {
    @EventHandler
    public void onSurInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack it = e.getItem();
        Action ac = e.getAction();
        if (it == null)return;

        if (it.getType() == Material.NETHER_STAR && it.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Giver LV3 --- SEIGNEUR")){
            if (ac == Action.LEFT_CLICK_AIR || ac == Action.LEFT_CLICK_BLOCK){
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Giver lv3","");

                //A0001
                ItemStack item1 = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta itemMeta1 = item1.getItemMeta();
                itemMeta1.setDisplayName(ChatColor.GREEN + "Lame du conquerant");
                itemMeta1.setLore(Arrays.asList("Lame tueuse de dragon"));
                itemMeta1.addEnchant(Enchantment.DURABILITY, 3, true);
                itemMeta1.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
                itemMeta1.addEnchant(Enchantment.KNOCKBACK,1,true);
                itemMeta1.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
                item1.setItemMeta(itemMeta1);

                player.getInventory().addItem(item1);

                //A0002
                ItemStack item2 = new ItemStack(Material.DIAMOND_HOE);
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(ChatColor.GREEN + "Hoe LV3");
                itemMeta2.setLore(Arrays.asList("Incassable cette Hoe", "Peut etre echangee"));
                itemMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta2.addEnchant(Enchantment.DIG_SPEED, 3, true);
                itemMeta2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
                itemMeta2.setUnbreakable(true);
                item2.setItemMeta(itemMeta2);

                player.getInventory().addItem(item2);


                //A0003
                ItemStack item3 = new ItemStack(Material.DIAMOND_SHOVEL);
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(ChatColor.GREEN + "Pelle LV3");
                itemMeta3.setLore(Arrays.asList("Incassable cette pelle", "Peut etre echangee"));
                itemMeta3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta3.addEnchant(Enchantment.DIG_SPEED, 3, true);
                itemMeta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
                itemMeta3.setUnbreakable(true);
                item3.setItemMeta(itemMeta3);

                player.getInventory().addItem(item3);

                //A0004
                ItemStack item4 = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta itemMeta4 = item4.getItemMeta();
                itemMeta4.setDisplayName(ChatColor.GREEN + "Pioche LV3");
                itemMeta4.setLore(Arrays.asList("Incassable cette pioche", "Peut etre echangee"));
                itemMeta4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta4.setUnbreakable(true);
                itemMeta4.addEnchant(Enchantment.DIG_SPEED, 3, true);
                itemMeta4.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
                item4.setItemMeta(itemMeta4);

                player.getInventory().addItem(item4);

                //A0005
                ItemStack item5 = new ItemStack(Material.DIAMOND_AXE);
                ItemMeta itemMeta5 = item5.getItemMeta();
                itemMeta5.setDisplayName(ChatColor.GREEN + "Hache LV3");
                itemMeta5.setLore(Arrays.asList("Incassable cette hache", "Peut etre echangee"));
                itemMeta5.setUnbreakable(true);
                itemMeta5.addEnchant(Enchantment.DIG_SPEED, 3, true);
                itemMeta5.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
                item5.setItemMeta(itemMeta5);

                player.getInventory().addItem(item5);

                //A0006
                ItemStack item6 = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta itemMeta6 = item6.getItemMeta();
                itemMeta6.setDisplayName(ChatColor.GREEN + "couronne des roi");
                itemMeta6.setLore(Arrays.asList("Porter par le roi Artur"));
                itemMeta6.addEnchant(Enchantment.DURABILITY, 3, true);
                itemMeta6.addEnchant(Enchantment.THORNS, 1, true);
                item6.setItemMeta(itemMeta6);

                player.getInventory().addItem(item6);

                //A0007
                ItemStack item7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta itemMeta7 = item7.getItemMeta();
                itemMeta7.setDisplayName(ChatColor.GREEN + "Cape des roi");
                itemMeta7.setLore(Arrays.asList("Cape des plus grand roi"));
                itemMeta7.addEnchant(Enchantment.DURABILITY, 3, true);
                itemMeta7.addEnchant(Enchantment.THORNS, 1, true);
                item7.setItemMeta(itemMeta7);

                player.getInventory().addItem(item7);

                //A0008
                ItemStack item8 = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemMeta itemMeta8 = item8.getItemMeta();
                itemMeta8.setDisplayName(ChatColor.GREEN + "Cuissard");
                itemMeta8.setLore(Arrays.asList("ce cuissard fut porter","pendant la conquete de la chine"));
                itemMeta8.addEnchant(Enchantment.DURABILITY, 3, true);
                itemMeta8.addEnchant(Enchantment.THORNS, 1, true);
                item8.setItemMeta(itemMeta8);

                player.getInventory().addItem(item8);

                //A0009
                ItemStack item9 = new ItemStack(Material.DIAMOND_BOOTS);
                ItemMeta itemMeta9 = item9.getItemMeta();
                itemMeta9.setDisplayName(ChatColor.GREEN + "Botte de louis 14");
                itemMeta9.setLore(Arrays.asList("Botte du roi Louis 14"));
                itemMeta9.addEnchant(Enchantment.DURABILITY, 3, true);
                itemMeta9.addEnchant(Enchantment.THORNS, 1, true);
                item9.setItemMeta(itemMeta9);

                player.getInventory().addItem(item9);




            }
        }


    }
}
