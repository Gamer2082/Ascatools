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

public class survivantToolsListener implements Listener {
    @EventHandler
    public void onSurInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack it = e.getItem();
        Action ac = e.getAction();
        if (it == null)return;

        if (it.getType() == Material.NETHER_STAR && it.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Giver LV1 --- SURVIVANT")){
           if (ac == Action.LEFT_CLICK_AIR || ac == Action.LEFT_CLICK_BLOCK){
               player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
               player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
               player.sendTitle(ChatColor.LIGHT_PURPLE + "Giver lv1","");

               //A0001
               ItemStack item1 = new ItemStack(Material.STONE_SWORD);
               ItemMeta itemMeta1 = item1.getItemMeta();
               itemMeta1.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Dague du survivant");
               itemMeta1.setLore(Arrays.asList("Ancien dag des heros", "Cette lame est emoussee"));
               itemMeta1.addEnchant(Enchantment.DURABILITY, 1, true);
               item1.setItemMeta(itemMeta1);

               player.getInventory().addItem(item1);

               //A0002
               ItemStack item2 = new ItemStack(Material.WOODEN_HOE);
               ItemMeta itemMeta2 = item2.getItemMeta();
               itemMeta2.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Hoe LV1");
               itemMeta2.setLore(Arrays.asList("Incassable cette Hoe", "Peut etre echangee"));
               itemMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
               itemMeta2.addEnchant(Enchantment.DIG_SPEED, 1, true);
               itemMeta2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
               itemMeta2.setUnbreakable(true);
               item2.setItemMeta(itemMeta2);

               player.getInventory().addItem(item2);


               //A0003
               ItemStack item3 = new ItemStack(Material.WOODEN_SHOVEL);
               ItemMeta itemMeta3 = item3.getItemMeta();
               itemMeta3.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Pelle LV1");
               itemMeta3.setLore(Arrays.asList("Incassable cette pelle", "Peut etre echangee"));
               itemMeta3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
               itemMeta3.addEnchant(Enchantment.DIG_SPEED, 1, true);
               itemMeta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
               itemMeta3.setUnbreakable(true);
               item3.setItemMeta(itemMeta3);

               player.getInventory().addItem(item3);

               //A0004
               ItemStack item4 = new ItemStack(Material.WOODEN_PICKAXE);
               ItemMeta itemMeta4 = item4.getItemMeta();
               itemMeta4.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Pioche LV1");
               itemMeta4.setLore(Arrays.asList("Incassable cette pioche", "Peut etre echangee"));
               itemMeta4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
               itemMeta4.setUnbreakable(true);
               itemMeta4.addEnchant(Enchantment.DIG_SPEED, 1, true);
               itemMeta4.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
               item4.setItemMeta(itemMeta4);

               player.getInventory().addItem(item4);

               //A0005
               ItemStack item5 = new ItemStack(Material.WOODEN_AXE);
               ItemMeta itemMeta5 = item5.getItemMeta();
               itemMeta5.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Hache LV1");
               itemMeta5.setLore(Arrays.asList("Incassable cette hache", "Peut etre echangee"));
               itemMeta5.setUnbreakable(true);
               itemMeta5.addEnchant(Enchantment.DIG_SPEED, 1, true);
               itemMeta5.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
               item5.setItemMeta(itemMeta5);

               player.getInventory().addItem(item5);

               //A0006
               ItemStack item6 = new ItemStack(Material.LEATHER_HELMET);
               ItemMeta itemMeta6 = item6.getItemMeta();
               itemMeta6.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Casque du survivant");
               itemMeta6.setLore(Arrays.asList("Pas du tout solide"));
               itemMeta6.addEnchant(Enchantment.DURABILITY, 1, true);
               item6.setItemMeta(itemMeta6);

               player.getInventory().addItem(item6);

               //A0007
               ItemStack item7 = new ItemStack(Material.LEATHER_CHESTPLATE);
               ItemMeta itemMeta7 = item7.getItemMeta();
               itemMeta7.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Chemise du survivant");
               itemMeta7.setLore(Arrays.asList("Chemise sale", "Cette chemise fait vomir"));
               itemMeta7.addEnchant(Enchantment.DURABILITY, 1, true);
               item7.setItemMeta(itemMeta7);

               player.getInventory().addItem(item7);

               //A0008
               ItemStack item8 = new ItemStack(Material.LEATHER_LEGGINGS);
               ItemMeta itemMeta8 = item8.getItemMeta();
               itemMeta8.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Cullot de survie");
               itemMeta8.setLore(Arrays.asList("Culotte de wish", "Cette culotte me rappelle un heros"));
               itemMeta8.addEnchant(Enchantment.DURABILITY, 1, true);
               item8.setItemMeta(itemMeta8);

               player.getInventory().addItem(item8);

               //A0009
               ItemStack item9 = new ItemStack(Material.LEATHER_BOOTS);
               ItemMeta itemMeta9 = item9.getItemMeta();
               itemMeta9.setDisplayName(org.bukkit.ChatColor.LIGHT_PURPLE + "Botte du survivant");
               itemMeta9.setLore(Arrays.asList("Botte tropicale", "Cette botte est sale"));
               itemMeta9.addEnchant(Enchantment.DURABILITY, 1, true);
               item9.setItemMeta(itemMeta9);

               player.getInventory().addItem(item9);




           }
        }


    }
}
