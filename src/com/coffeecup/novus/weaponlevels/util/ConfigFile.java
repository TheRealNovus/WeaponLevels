package com.coffeecup.novus.weaponlevels.util;

import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigFile extends YamlConfiguration
{
	private String name;
	
	public ConfigFile(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
