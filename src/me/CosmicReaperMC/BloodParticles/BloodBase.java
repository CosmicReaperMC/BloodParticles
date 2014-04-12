package me.CosmicReaperMC.BloodParticles;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Horse;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BloodBase extends JavaPlugin implements Listener{
	
	public static BloodBase plugin;
	
	@Override
	public void onEnable(){
		plugin = this;
		loadConfiguration();
		getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		getCommand("blood").setExecutor(new BloodCommand());
	}
	
	public void loadConfiguration() {
		String path = "Mobs";
		plugin.getConfig().addDefault(path + ".Human", 152);
		plugin.getConfig().addDefault(path + ".Blaze", 51);
		plugin.getConfig().addDefault(path + ".Enderman", 90);
		plugin.getConfig().addDefault(path + ".Squid", 8);
		plugin.getConfig().addDefault(path + ".Zombie", 152);
		plugin.getConfig().addDefault(path + ".Slime", 133);
		plugin.getConfig().addDefault(path + ".Spider", 133);
		plugin.getConfig().addDefault(path + ".Golem", 155);
		plugin.getConfig().addDefault(path + ".Cow", 152);
		plugin.getConfig().addDefault(path + ".Bat", 173);
		plugin.getConfig().addDefault(path + ".Chicken", 35);
		plugin.getConfig().addDefault(path + ".Ocelot", 41);
		plugin.getConfig().addDefault(path + ".Horse", 152);
		plugin.getConfig().addDefault(path + ".Sheep", 35);
		plugin.getConfig().addDefault(path + ".Pig", 152);
		plugin.getConfig().addDefault(path + ".Villager", 152);
		plugin.getConfig().addDefault(path + ".Wolf", 155);
		plugin.getConfig().addDefault(path + ".Creeper", 46);
		plugin.getConfig().addDefault(path + ".Ghast", 155);
		plugin.getConfig().addDefault(path + ".MagmaCube", 51);
		plugin.getConfig().addDefault(path + ".Skeleton", 173);
		plugin.getConfig().addDefault(path + ".Silverfish", 1);
		plugin.getConfig().addDefault(path + ".Witch", 112);
		plugin.getConfig().addDefault(path + ".EnderDragon", 119);
		plugin.getConfig().addDefault(path + ".Wither", 119);
		plugin.getConfig().options().copyDefaults(true);
		plugin.saveConfig();
	}
	
	@EventHandler
	public void HumanBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Player) {
	    	int blood = plugin.getConfig().getInt("Mobs.Human");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void BlazeBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Blaze) {
	    	int blood = plugin.getConfig().getInt("Mobs.Blaze");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void EndermanBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Enderman) {
	    	int blood = plugin.getConfig().getInt("Mobs.Enderman");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SquidBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Squid) {
	    	int blood = plugin.getConfig().getInt("Mobs.Squid");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void ZombieBlood(EntityDamageByEntityEvent e){
		if (e.getEntity() instanceof Zombie) {
			int blood = plugin.getConfig().getInt("Mobs.Zombie");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SlimeBlood(EntityDamageByEntityEvent e){
		if (e.getEntity() instanceof Slime) {
			int blood = plugin.getConfig().getInt("Mobs.Slime");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SpiderBlood(EntityDamageByEntityEvent e){
		if (e.getEntity() instanceof Spider) {
			int blood = plugin.getConfig().getInt("Mobs.Spider");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void GolemBlood(EntityDamageByEntityEvent e){
		if (e.getEntity() instanceof Golem) {
			int blood = plugin.getConfig().getInt("Mobs.Golem");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void CowBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Cow) {
	    	int blood = plugin.getConfig().getInt("Mobs.Cow");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void BatBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Bat) {
	    	int blood = plugin.getConfig().getInt("Mobs.Bat");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void ChickenBlood(EntityDamageByEntityEvent e){
		if (e.getEntity() instanceof Chicken) {
			int blood = plugin.getConfig().getInt("Mobs.Chicken");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void OcelotBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Ocelot) {
	    	int blood = plugin.getConfig().getInt("Mobs.Ocelot");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void HorseBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Horse) {
	    	int blood = plugin.getConfig().getInt("Mobs.Horse");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SheepBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Sheep) {
	    	int blood = plugin.getConfig().getInt("Mobs.Sheep");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void PigBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Pig) {
	    	int blood = plugin.getConfig().getInt("Mobs.Pig");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void VillagerBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Villager) {
	    	int blood = plugin.getConfig().getInt("Mobs.Villager");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void WolfBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Wolf) {
	    	int blood = plugin.getConfig().getInt("Mobs.Wolf");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void CreeperBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Creeper) {
	    	int blood = plugin.getConfig().getInt("Mobs.Creeper");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void GhastBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Ghast) {
	    	int blood = plugin.getConfig().getInt("Mobs.Ghast");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void MagmaCubeBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof MagmaCube) {
	    	int blood = plugin.getConfig().getInt("Mobs.MagmaCube");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SkeletonBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Skeleton) {
	    	int blood = plugin.getConfig().getInt("Mobs.Skeleton");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void SilverfishBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Silverfish) {
	    	int blood = plugin.getConfig().getInt("Mobs.Silverfish");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void WitchBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Witch) {
	    	int blood = plugin.getConfig().getInt("Mobs.Witch");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void EnderDragonBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof EnderDragon) {
	    	int blood = plugin.getConfig().getInt("Mobs.EnderDragon");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}

	@EventHandler
	public void WitherBlood(EntityDamageByEntityEvent e){
	    if (e.getEntity() instanceof Wither) {
	    	int blood = plugin.getConfig().getInt("Mobs.Wither");
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, blood);
	    }
	}
}