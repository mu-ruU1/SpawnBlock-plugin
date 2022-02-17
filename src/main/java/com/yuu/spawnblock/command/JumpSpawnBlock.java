package com.yuu.spawnblock.command;

import com.destroystokyo.paper.event.entity.PreCreatureSpawnEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

import static org.bukkit.Bukkit.getServer;

public class JumpSpawnBlock implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage(ChatColor.GREEN + "ジャンプをするとブロックが出現します");

        return true;
    }

}
