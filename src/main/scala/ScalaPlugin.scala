package me.zdziszkee.scalaplugin

import com.zaxxer.hikari.HikariDataSource
import org.bukkit.block.Biome
import org.bukkit.generator.{BiomeProvider, ChunkGenerator, WorldInfo}
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitScheduler
import org.bukkit.{Bukkit, Location, Material, World, WorldCreator}

import java.util.{Collections, Random}
import javax.sql.DataSource
import scala.util.Using

open class ScalaPlugin() extends JavaPlugin {

  val source: HikariDataSource = HikariDataSource()
  source.setJdbcUrl("jdbc:postgresql://localhost/postgres")
  source.setUsername("postgres")
  source.setPassword("postgres")

  override def onEnable(): Unit = {
    val item = ItemStack(Material.BOW)
    val map = item.serialize()
    Using(source.getConnection) { source =>
      Using(source.prepareStatement("CREATE TABLE IF NOT EXISTS Users(id BIGINT,balance BIGINT)"))
    }
  }

  override def onDisable(): Unit = {}

}
