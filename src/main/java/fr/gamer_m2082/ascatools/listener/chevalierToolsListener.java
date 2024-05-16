package fr.gamer_m2082.ascatools.listener;

import org.bukkit.ChatColor;
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

public class chevalierToolsListener implements Listener {
    @EventHandler
    public void onSurInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack it = e.getItem();
        Action ac = e.getAction();
        if (it == null)return;

        if (it.getType() == Material.NETHER_STAR && it.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Giver LV2 --- CHEVALIER")){
            if (ac == Action.LEFT_CLICK_AIR || ac == Action.LEFT_CLICK_BLOCK){
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
                player.sendTitle(ChatColor.RED + "Giver lv2","");


                //B0001
                ItemStack item1 = new ItemStack(Material.IRON_SWORD);
                ItemMeta itemMeta1 = item1.getItemMeta();
                itemMeta1.setDisplayName(ChatColor.RED  + "Lame sacree");
                itemMeta1.setLore(Arrays.asList("Lame de temps Ancient", "Cette lame tranche beaucoup"));
                itemMeta1.addEnchant(Enchantment.DURABILITY, 2, true);
                itemMeta1.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
                item1.setItemMeta(itemMeta1);

                player.getInventory().addItem(item1);

                //B0002
                ItemStack item2 = new ItemStack(Material.STONE_HOE);
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(ChatColor.RED + "Hoe LV2");
                itemMeta2.setLore(Arrays.asList("Incassable cette Hoe", "Peut etre echangee"));
                itemMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta2.addEnchant(Enchantment.DIG_SPEED, 2, true);
                itemMeta2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
                itemMeta2.setUnbreakable(true);
                item2.setItemMeta(itemMeta2);

                player.getInventory().addItem(item2);


                //B0003
                ItemStack item3 = new ItemStack(Material.STONE_SHOVEL);
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(ChatColor.RED + "Pelle LV2");
                itemMeta3.setLore(Arrays.asList("Incassable cette pelle", "Peut etre echangee"));
                itemMeta3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta3.addEnchant(Enchantment.DIG_SPEED, 2, true);
                itemMeta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
                itemMeta3.setUnbreakable(true);
                item3.setItemMeta(itemMeta3);

                player.getInventory().addItem(item3);

                //B0004
                ItemStack item4 = new ItemStack(Material.IRON_PICKAXE);
                ItemMeta itemMeta4 = item4.getItemMeta();
                itemMeta4.setDisplayName(ChatColor.RED + "Pioche LV2");
                itemMeta4.setLore(Arrays.asList("Incassable cette pioche", "Peut etre echangee"));
                itemMeta4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES); // Facultatif : pour masquer les attributs de l'item
                itemMeta4.setUnbreakable(true);
                itemMeta4.addEnchant(Enchantment.DIG_SPEED, 2, true);
                itemMeta4.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
                item4.setItemMeta(itemMeta4);

                player.getInventory().addItem(item4);

                //B0005
                ItemStack item5 = new ItemStack(Material.STONE_AXE);
                ItemMeta itemMeta5 = item5.getItemMeta();
                itemMeta5.setDisplayName(ChatColor.RED + "Hache LV2");
                itemMeta5.setLore(Arrays.asList("Incassable cette hache", "Peut etre echangee"));
                itemMeta5.setUnbreakable(true);
                itemMeta5.addEnchant(Enchantment.DIG_SPEED, 2, true);
                itemMeta5.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
                item5.setItemMeta(itemMeta5);

                player.getInventory().addItem(item5);

                //B0006
                ItemStack item6 = new ItemStack(Material.IRON_HELMET);
                ItemMeta itemMeta6 = item6.getItemMeta();
                itemMeta6.setDisplayName(ChatColor.RED + "Casque des heros");
                itemMeta6.setLore(Arrays.asList("Casque des plut grand chevalier"));
                itemMeta6.addEnchant(Enchantment.DURABILITY, 2, true);
                itemMeta6.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
                item6.setItemMeta(itemMeta6);

                player.getInventory().addItem(item6);

                //B0007
                ItemStack item7 = new ItemStack(Material.IRON_CHESTPLATE);
                ItemMeta itemMeta7 = item7.getItemMeta();
                itemMeta7.setDisplayName(ChatColor.RED + "Plastron des heros");
                itemMeta7.setLore(Arrays.asList("Plastron du roi Arture", "Cet plastron fut connus","comme plastron royal"));
                itemMeta7.addEnchant(Enchantment.DURABILITY, 2, true);
                itemMeta7.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
                item7.setItemMeta(itemMeta7);

                player.getInventory().addItem(item7);

                //B0008
                ItemStack item8 = new ItemStack(Material.IRON_LEGGINGS);
                ItemMeta itemMeta8 = item8.getItemMeta();
                itemMeta8.setDisplayName(ChatColor.RED + "culote de superman");
                itemMeta8.setLore(Arrays.asList("Une copie tres rare"));
                itemMeta8.addEnchant(Enchantment.DURABILITY, 2, true);
                itemMeta8.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
                item8.setItemMeta(itemMeta8);

                player.getInventory().addItem(item8);

                //B0009
                ItemStack item9 = new ItemStack(Material.IRON_BOOTS);
                ItemMeta itemMeta9 = item9.getItemMeta();
                itemMeta9.setDisplayName(ChatColor.RED + "Botte de merlin");
                itemMeta9.setLore(Arrays.asList("Botte d'enchanteur", "Cette botte appartenais a merlin"));
                itemMeta9.addEnchant(Enchantment.DURABILITY, 2, true);
                itemMeta9.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
                item9.setItemMeta(itemMeta9);

                player.getInventory().addItem(item9);




            }
        }


    }
}
