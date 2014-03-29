package me.CosmicReaperMC.BloodParticles;

import me.CosmicReaperMC.BloodParticles.listeners.AdvertJoin;
import me.CosmicReaperMC.BloodParticles.listeners.ReaperJoin;

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
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BloodBase extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getPluginManager().registerEvents(new AdvertJoin(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ReaperJoin(), this);
	}
	
	@EventHandler
	public void HumanBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Player) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void BlazeBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Blaze) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 51);
	    }
	}

	@EventHandler
	public void EndermanBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Enderman) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 90);
	    }
	}

	@EventHandler
	public void SquidBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Squid) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 8);
	    }
	}

	@EventHandler
	public void ZombieBlood(EntityDamageEvent e){
		if (e.getEntity() instanceof Zombie) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void SlimeBlood(EntityDamageEvent e){
		if (e.getEntity() instanceof Slime) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 133);
	    }
	}

	@EventHandler
	public void SpiderBlood(EntityDamageEvent e){
		if (e.getEntity() instanceof Spider) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 133);
	    }
	}

	@EventHandler
	public void GolemBlood(EntityDamageEvent e){
		if (e.getEntity() instanceof Golem) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 155);
	    }
	}

	@EventHandler
	public void CowBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Cow) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void BatBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Bat) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 173);
	    }
	}

	@EventHandler
	public void ChickenBlood(EntityDamageEvent e){
		if (e.getEntity() instanceof Chicken) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 35);
	    }
	}

	@EventHandler
	public void OcelotBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Ocelot) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 41);
	    }
	}

	@EventHandler
	public void HorseBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Horse) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void SheepBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Sheep) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 35);
	    }
	}

	@EventHandler
	public void PigBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Pig) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void VillagerBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Villager) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
	    }
	}

	@EventHandler
	public void WolfBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Wolf) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 155);
	    }
	}

	@EventHandler
	public void CreeperBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Creeper) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 46);
	    }
	}

	@EventHandler
	public void GhastBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Ghast) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 155);
	    }
	}

	@EventHandler
	public void MagmaCubeBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof MagmaCube) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 51);
	    }
	}

	@EventHandler
	public void SkeletonBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Skeleton) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 173);
	    }
	}

	@EventHandler
	public void SilverfishBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Silverfish) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 1);
	    }
	}

	@EventHandler
	public void WitchBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Witch) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 112);
	    }
	}

	@EventHandler
	public void EnderDragonBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof EnderDragon) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 119);
	    }
	}

	@EventHandler
	public void WitherBlood(EntityDamageEvent e){
	    if (e.getEntity() instanceof Wither) {
		e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0, 1, 0), Effect.STEP_SOUND, 119);
	    }
	}
}