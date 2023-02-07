package top.promisedland;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
public class Config {
    public static File PlayerMedicinesNumFile = new File("plugins/YourWorld/PlayerData/medicinesnum.yml");

    public static FileConfiguration PlayerMedicinesNum;

    public static void LoadPlayerMedicinesNumData() {
        PlayerMedicinesNum = (FileConfiguration)YamlConfiguration.loadConfiguration(PlayerMedicinesNumFile);
        PlayerMedicinesNum.options().copyDefaults(true);
    }


    public static void SavePlayerMedicinesNumData() {
        try {
            PlayerMedicinesNum.save(PlayerMedicinesNumFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
