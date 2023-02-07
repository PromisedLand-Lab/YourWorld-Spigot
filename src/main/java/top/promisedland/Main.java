package top.promisedland;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;
import top.promisedland.CustomItem.Dextromethorphan;
import top.promisedland.Listener.CommandListener;



public class Main extends JavaPlugin {
    public static Main INSTANCE;
    PluginLogger log;
    @Override
    public void onLoad() {
        INSTANCE = this;
        log = new PluginLogger(this);
    }

    @Override
    public void onEnable() {
        log.info("开启");
        Bukkit.getPluginCommand("yourworld").setExecutor(new CommandListener());
    }

    @Override
    public void onDisable() {
        log.info("关闭");
    }
}