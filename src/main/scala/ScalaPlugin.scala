package me.zdziszkee.scalaplugin

import me.zdziszkee.scalaplugin.listeners.PlayerJoinListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ScalaPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    Bukkit.getConsoleSender.sendMessage("ENABLED SCALA PLUGIN <-------------------")
    Bukkit.getConsoleSender.sendMessage("ENABLED SCALA PLUGIN <-------------------")
    Bukkit.getPluginManager.registerEvents(new PlayerJoinListener(), this)
  }

  override def onDisable(): Unit = super.onDisable()

}
