package top.promisedland.Listener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.promisedland.CustomItem.Dextromethorphan;
public class CommandListener implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (label.equalsIgnoreCase("yourworld")) {
                if (args.length == 0) {

                    sender.sendMessage("§9++===============++");
                    sender.sendMessage("§a/ohshit toggle 开/关拉屎功能");
                    sender.sendMessage("§a/ohshit reload 重载配置文件");
                    sender.sendMessage("§9++===============++");
                    return true;
                }
            }
            if (args[0].equalsIgnoreCase("item")) {
                switch(args[1]){
                    case "":
                        sender.sendMessage("参数不能为空");
                        return true;
                    case "item":
                        ((Player) sender).getInventory().addItem(Dextromethorphan.getDextromethorphan());
                        return true;
                }
                sender.sendMessage("参数不能为空");
                return true;
            }
        }else {
            sender.sendMessage("您必须是玩家才能执行这条指令");
            return true;
        }
        return false;
    }
}
