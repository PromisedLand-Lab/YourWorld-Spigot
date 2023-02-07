package top.promisedland.Listener;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import top.promisedland.CustomItem.Dextromethorphan;

import java.util.HashMap;

public class PlayerActionListener {
    HashMap<Player, Integer> MedicinesNum = new HashMap<Player, Integer>();
    public void MedicinesNumChecker(Plugin Plugin){
        new BukkitRunnable(){

            @Override
            public void run() {

            }
        }.runTaskTimer(Plugin,0L,10L);
    }
    public void onRightClick(PlayerInteractEvent p){
        if (p.getItem().equals(Dextromethorphan.getDextromethorphan())) {
            if (p.getAction().equals(Action.RIGHT_CLICK_AIR) || p.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                Player player = p.getPlayer();
                if (MedicinesNum.containsKey(player)){
                    MedicinesNum.put(player, MedicinesNum.get(player) + 1);
                }else {
                    MedicinesNum.put(player,1);
                }
            }
        }
    }
}
