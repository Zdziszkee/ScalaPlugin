package me.zdziszkee.scalaplugin

import listeners.PlayerJoinListener

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ScalaPlugin extends JavaPlugin {
  val list: Seq[Int] = List(1, 3, 4)

  override def onEnable(): Unit = {
    Bukkit.getConsoleSender.sendMessage("ENABLED SCALA PLUGIN <-------------------")
    Bukkit.getConsoleSender.sendMessage("ENABLED SCALA PLUGIN <-------------------")
    Bukkit.getPluginManager.registerEvents(new PlayerJoinListener(), this)
    println(list)
  }

  override def onDisable(): Unit = super.onDisable()

}
