/*
 * Copyright (c) 2018, Cameron <https://github.com/noremac201>
 * Copyright (c) 2018, Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.experiencedrop;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("xpdrop")
public interface XpDropConfig extends Config
{
	@ConfigItem(
		keyName = "moveableDrops",
		name = "Moveable XP Drops",
		description = "Configures whether the XP Drops can be moved with Alt",
		position = 0
	)
	default boolean moveableDrops()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hideSkillIcons",
		name = "Hide skill icons",
		description = "Configure if XP drops will show their respective skill icons",
		position = 1
	)
	default boolean hideSkillIcons()
	{
		return false;
	}

	@ConfigItem(
		keyName = "recolorDrops",
		name = "Recolor XP Drops",
		description = "Recolor XP drops if you have boosting prayers active",
		position = 2
	)
	default boolean recolorDrops()
	{
		return true;
	}

	@ConfigItem(
		keyName = "meleePrayerColor",
		name = "Melee Prayer Color",
		description = "XP drop color when a melee prayer is active",
		position = 3
	)
	default Color getMeleePrayerColor()
	{
		return new Color(0x15, 0x80, 0xAD);
	}

	@ConfigItem(
		keyName = "rangePrayerColor",
		name = "Range Prayer Color",
		description = "XP drop color when a range prayer is active",
		position = 4
	)
	default Color getRangePrayerColor()
	{
		return new Color(0x15, 0x80, 0xAD);
	}

	@ConfigItem(
		keyName = "magePrayerColor",
		name = "Mage Prayer Color",
		description = "XP drop color when a mage prayer is active",
		position = 5
	)
	default Color getMagePrayerColor()
	{
		return new Color(0x15, 0x80, 0xAD);
	}
}
