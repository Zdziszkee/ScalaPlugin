package me.zdziszkee.scalaplugin
package listeners

import org.bukkit.event.player.{AsyncPlayerPreLoginEvent, PlayerJoinEvent}
import org.bukkit.event.{EventHandler, Listener}

class PlayerJoinListener extends Listener {

  @EventHandler
  def onPlayerJoin(event: PlayerJoinEvent): Unit = {
    val player = event.getPlayer
    player.sendMessage("hello")
  }
}
