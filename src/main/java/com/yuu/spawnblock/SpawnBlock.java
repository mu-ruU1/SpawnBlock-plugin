package com.yuu.spawnblock;

import com.yuu.spawnblock.command.JumpSpawnBlock;
import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import javax.swing.text.html.parser.Entity;

public final class SpawnBlock extends JavaPlugin implements @NotNull Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.RED + "SpawnBlock" + ChatColor.WHITE + "プラグインが起動しました");

        getCommand("spawnblock").setExecutor(new JumpSpawnBlock());

        getServer().getPluginManager().registerEvents(this,this);

    }

    @EventHandler
    public void JumpSpawnBlock(PlayerStatisticIncrementEvent event){
        if (event.getStatistic() == Statistic.JUMP){

            //final String lacate = event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(),);
            //world.getBlockAt(locate).setType(Material.GRASS_BLOCK)

            event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.MINECART_TNT);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
