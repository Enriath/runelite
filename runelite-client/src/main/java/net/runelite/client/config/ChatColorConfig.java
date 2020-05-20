/*
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
package net.runelite.client.config;

import java.awt.Color;
import net.runelite.client.ui.JagexColors;

@ConfigGroup("textrecolor")
public interface ChatColorConfig extends Config
{
	@ConfigSection(
		position = 1,
		name = "Opaque",
		description = "The options that control the colours for the Opaque Chatbox",
		closedByDefault = true
	)
	String opaqueSection = "opaqueSection";

	@ConfigSection(
		position = 2,
		name = "Transparent",
		description = "The options that control the colours for the Transparent Chatbox",
		closedByDefault = true
	)
	String transparentSection = "transparentSection";

	@ConfigItem(
		position = 31,
		keyName = "opaquePublicChat",
		name = "Public chat",
		description = "Color of Public chat",
		section = opaqueSection
	)
	Color opaquePublicChat();

	@ConfigItem(
		position = 32,
		keyName = "opaquePublicChatHighlight",
		name = "Public chat highlight",
		description = "Color of highlights in Public chat",
		section = opaqueSection
	)
	default Color opaquePublicChatHighlight()
	{
		return Color.decode("#000000");
	}

	@ConfigItem(
		position = 33,
		keyName = "opaquePrivateMessageSent",
		name = "Sent private messages",
		description = "Color of Private messages you've sent",
		section = opaqueSection
	)
	Color opaquePrivateMessageSent();

	@ConfigItem(
		position = 34,
		keyName = "opaquePrivateMessageSentHighlight",
		name = "Sent private messages highlight",
		description = "Color of highlights in Private messages you've sent",
		section = opaqueSection
	)
	default Color opaquePrivateMessageSentHighlight()
	{
		return Color.decode("#002783");
	}

	@ConfigItem(
		position = 35,
		keyName = "opaquePrivateMessageReceived",
		name = "Received private messages",
		description = "Color of Private messages you've received",
		section = opaqueSection
	)
	Color opaquePrivateMessageReceived();

	@ConfigItem(
		position = 36,
		keyName = "opaquePrivateMessageReceivedHighlight",
		name = "Received private messages highlight",
		description = "Color of highlights in Private messages you've received",
		section = opaqueSection
	)
	default Color opaquePrivateMessageReceivedHighlight()
	{
		return Color.decode("#002783");
	}

	@ConfigItem(
		position = 37,
		keyName = "opaqueClanChatInfo",
		name = "Clan chat info",
		description = "Clan Chat Information (eg. when joining a channel)",
		section = opaqueSection
	)
	default Color opaqueClanChatInfo()
	{
		return JagexColors.CHAT_GAME_EXAMINE_TEXT_OPAQUE_BACKGROUND;
	}

	@ConfigItem(
		position = 38,
		keyName = "opaqueClanChatInfoHighlight",
		name = "Clan chat info highlight",
		description = "Clan Chat Information highlight (used for the Raids plugin)",
		section = opaqueSection
	)
	default Color opaqueClanChatInfoHighlight()
	{
		return Color.RED;
	}

	@ConfigItem(
		position = 39,
		keyName = "opaqueClanChatMessage",
		name = "Clan chat message",
		description = "Color of Clan Chat Messages",
		section = opaqueSection
	)
	Color opaqueClanChatMessage();

	@ConfigItem(
		position = 40,
		keyName = "opaqueClanChatMessageHighlight",
		name = "Clan chat message highlight",
		description = "Color of highlights in Clan Chat Messages",
		section = opaqueSection
	)
	default Color opaqueClanChatMessageHighlight()
	{
		return Color.decode("#000000");
	}

	@ConfigItem(
		position = 41,
		keyName = "opaqueAutochatMessage",
		name = "Autochat",
		description = "Color of Autochat messages",
		section = opaqueSection
	)
	Color opaqueAutochatMessage();

	@ConfigItem(
		position = 42,
		keyName = "opaqueAutochatMessageHighlight",
		name = "Autochat highlight",
		description = "Color of highlights in Autochat messages",
		section = opaqueSection
	)
	Color opaqueAutochatMessageHighlight();

	@ConfigItem(
		position = 43,
		keyName = "opaqueTradeChatMessage",
		name = "Trade chat",
		description = "Color of Trade Chat Messages",
		section = opaqueSection
	)
	Color opaqueTradeChatMessage();

	@ConfigItem(
		position = 44,
		keyName = "opaqueTradeChatMessageHighlight",
		name = "Trade chat highlight",
		description = "Color of highlights in Trade Chat Messages",
		section = opaqueSection
	)
	Color opaqueTradeChatMessageHighlight();

	@ConfigItem(
		position = 45,
		keyName = "opaqueServerMessage",
		name = "Server message",
		description = "Color of Server Messages (eg. 'Welcome to RuneScape')",
		section = opaqueSection
	)
	Color opaqueServerMessage();

	@ConfigItem(
		position = 46,
		keyName = "opaqueServerMessageHighlight",
		name = "Server message highlight",
		description = "Color of highlights in Server Messages",
		section = opaqueSection
	)
	Color opaqueServerMessageHighlight();

	@ConfigItem(
		position = 47,
		keyName = "opaqueGameMessage",
		name = "Game message",
		description = "Color of Game Messages",
		section = opaqueSection
	)
	Color opaqueGameMessage();

	@ConfigItem(
		position = 48,
		keyName = "opaqueGameMessageHighlight",
		name = "Game message highlight",
		description = "Color of highlights in Game Messages",
		section = opaqueSection
	)
	default Color opaqueGameMessageHighlight()
	{
		return Color.decode("#EF1020");
	}

	@ConfigItem(
		position = 49,
		keyName = "opaqueExamine",
		name = "Examine",
		description = "Color of Examine Text",
		section = opaqueSection
	)
	Color opaqueExamine();

	@ConfigItem(
		position = 50,
		keyName = "opaqueExamineHighlight",
		name = "Examine highlight",
		description = "Color of highlights in Examine Text",
		section = opaqueSection
	)
	default Color opaqueExamineHighlight()
	{
		return Color.decode("#0000FF");
	}

	@ConfigItem(
		position = 51,
		keyName = "opaqueFiltered",
		name = "Filtered",
		description = "Color of Filtered Text (messages that aren't shown when Game messages are filtered)",
		section = opaqueSection
	)
	Color opaqueFiltered();

	@ConfigItem(
		position = 52,
		keyName = "opaqueFilteredHighlight",
		name = "Filtered highlight",
		description = "Color of highlights in Filtered Text",
		section = opaqueSection
	)
	Color opaqueFilteredHighlight();

	@ConfigItem(
		position = 53,
		keyName = "opaqueUsername",
		name = "Usernames",
		description = "Color of Usernames",
		section = opaqueSection
	)
	Color opaqueUsername();

	@ConfigItem(
		position = 54,
		keyName = "opaquePrivateUsernames",
		name = "Private chat usernames",
		description = "Color of Usernames in Private Chat",
		section = opaqueSection
	)
	Color opaquePrivateUsernames();

	@ConfigItem(
		position = 55,
		keyName = "opaqueClanChannelName",
		name = "Clan channel name",
		description = "Color of Clan Channel Name",
		section = opaqueSection
	)
	Color opaqueClanChannelName();

	@ConfigItem(
		position = 56,
		keyName = "opaqueClanUsernames",
		name = "Clan usernames",
		description = "Color of Usernames in Clan Chat",
		section = opaqueSection
	)
	Color opaqueClanUsernames();

	@ConfigItem(
		position = 57,
		keyName = "opaquePublicFriendUsernames",
		name = "Public friend usernames",
		description = "Color of Friend Usernames in Public Chat",
		section = opaqueSection
	)
	Color opaquePublicFriendUsernames();

	@ConfigItem(
		position = 61,
		keyName = "transparentPublicChat",
		name = "Public chat (transparent)",
		description = "Color of Public chat (transparent)",
		section = transparentSection
	)
	Color transparentPublicChat();

	@ConfigItem(
		position = 62,
		keyName = "transparentPublicChatHighlight",
		name = "Public chat highlight (transparent)",
		description = "Color of highlights in Public chat (transparent)",
		section = transparentSection
	)
	default Color transparentPublicChatHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 63,
		keyName = "transparentPrivateMessageSent",
		name = "Sent private messages (transparent)",
		description = "Color of Private messages you've sent (transparent)",
		section = transparentSection
	)
	Color transparentPrivateMessageSent();

	@ConfigItem(
		position = 64,
		keyName = "transparentPrivateMessageSentHighlight",
		name = "Sent private messages highlight (transparent)",
		description = "Color of highlights in Private messages you've sent (transparent)",
		section = transparentSection
	)
	default Color transparentPrivateMessageSentHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 65,
		keyName = "transparentPrivateMessageReceived",
		name = "Received private messages (transparent)",
		description = "Color of Private messages you've received (transparent)",
		section = transparentSection
	)
	Color transparentPrivateMessageReceived();

	@ConfigItem(
		position = 66,
		keyName = "transparentPrivateMessageReceivedHighlight",
		name = "Received private messages highlight (transparent)",
		description = "Color of highlights in Private messages you've received (transparent)",
		section = transparentSection
	)
	default Color transparentPrivateMessageReceivedHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 67,
		keyName = "transparentClanChatInfo",
		name = "Clan chat info (transparent)",
		description = "Clan Chat Information (eg. when joining a channel) (transparent)",
		section = transparentSection
	)
	default Color transparentClanChatInfo()
	{
		return JagexColors.CHAT_GAME_EXAMINE_TEXT_TRANSPARENT_BACKGROUND;
	}

	@ConfigItem(
		position = 68,
		keyName = "transparentClanChatInfoHighlight",
		name = "Clan chat info highlight (transparent)",
		description = "Clan Chat Information highlight (used for the Raids plugin) (transparent)",
		section = transparentSection
	)
	default Color transparentClanChatInfoHighlight()
	{
		return Color.RED;
	}

	@ConfigItem(
		position = 69,
		keyName = "transparentClanChatMessage",
		name = "Clan chat message (transparent)",
		description = "Color of Clan Chat Messages (transparent)",
		section = transparentSection
	)
	Color transparentClanChatMessage();

	@ConfigItem(
		position = 70,
		keyName = "transparentClanChatMessageHighlight",
		name = "Clan chat message highlight (transparent)",
		description = "Color of highlights in Clan Chat Messages (transparent)",
		section = transparentSection
	)
	default Color transparentClanChatMessageHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 71,
		keyName = "transparentAutochatMessage",
		name = "Autochat (transparent)",
		description = "Color of Autochat messages (transparent)",
		section = transparentSection
	)
	Color transparentAutochatMessage();

	@ConfigItem(
		position = 72,
		keyName = "transparentAutochatMessageHighlight",
		name = "Autochat highlight (transparent)",
		description = "Color of highlights in Autochat messages (transparent)",
		section = transparentSection
	)
	Color transparentAutochatMessageHighlight();

	@ConfigItem(
		position = 73,
		keyName = "transparentTradeChatMessage",
		name = "Trade chat (transparent)",
		description = "Color of Trade Chat Messages (transparent)",
		section = transparentSection
	)
	Color transparentTradeChatMessage();

	@ConfigItem(
		position = 74,
		keyName = "transparentTradeChatMessageHighlight",
		name = "Trade chat highlight (transparent)",
		description = "Color of highlights in Trade Chat Messages (transparent)",
		section = transparentSection
	)
	Color transparentTradeChatMessageHighlight();

	@ConfigItem(
		position = 75,
		keyName = "transparentServerMessage",
		name = "Server message (transparent)",
		description = "Color of Server Messages (eg. 'Welcome to RuneScape') (transparent)",
		section = transparentSection
	)
	Color transparentServerMessage();

	@ConfigItem(
		position = 76,
		keyName = "transparentServerMessageHighlight",
		name = "Server message highlight (transparent)",
		description = "Color of highlights in Server Messages (transparent)",
		section = transparentSection
	)
	Color transparentServerMessageHighlight();

	@ConfigItem(
		position = 77,
		keyName = "transparentGameMessage",
		name = "Game message (transparent)",
		description = "Color of Game Messages (transparent)",
		section = transparentSection
	)
	Color transparentGameMessage();

	@ConfigItem(
		position = 78,
		keyName = "transparentGameMessageHighlight",
		name = "Game message highlight (transparent)",
		description = "Color of highlights in Game Messages (transparent)",
		section = transparentSection
	)
	default Color transparentGameMessageHighlight()
	{
		return Color.decode("#EF1020");
	}

	@ConfigItem(
		position = 79,
		keyName = "transparentExamine",
		name = "Examine (transparent)",
		description = "Color of Examine Text (transparent)",
		section = transparentSection
	)
	Color transparentExamine();

	@ConfigItem(
		position = 80,
		keyName = "transparentExamineHighlight",
		name = "Examine highlight (transparent)",
		description = "Color of highlights in Examine Text (transparent)",
		section = transparentSection
	)
	default Color transparentExamineHighlight()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		position = 81,
		keyName = "transparentFiltered",
		name = "Filtered (transparent)",
		description = "Color of Filtered Text (messages that aren't shown when Game messages are filtered) (transparent)",
		section = transparentSection
	)
	Color transparentFiltered();

	@ConfigItem(
		position = 82,
		keyName = "transparentFilteredHighlight",
		name = "Filtered highlight (transparent)",
		description = "Color of highlights in Filtered Text (transparent)",
		section = transparentSection
	)
	Color transparentFilteredHighlight();

	@ConfigItem(
		position = 83,
		keyName = "transparentUsername",
		name = "Usernames (transparent)",
		description = "Color of Usernames (transparent)",
		section = transparentSection
	)
	Color transparentUsername();

	@ConfigItem(
		position = 84,
		keyName = "transparentPrivateUsernames",
		name = "Private chat usernames (transparent)",
		description = "Color of Usernames in Private Chat (transparent)",
		section = transparentSection
	)
	Color transparentPrivateUsernames();

	@ConfigItem(
		position = 85,
		keyName = "transparentClanChannelName",
		name = "Clan channel name (transparent)",
		description = "Color of Clan Channel Name (transparent)",
		section = transparentSection
	)
	Color transparentClanChannelName();

	@ConfigItem(
		position = 86,
		keyName = "transparentClanUsernames",
		name = "Clan usernames (transparent)",
		description = "Color of Usernames in Clan Chat (transparent)",
		section = transparentSection
	)
	Color transparentClanUsernames();

	@ConfigItem(
		position = 87,
		keyName = "transparentPublicFriendUsernames",
		name = "Public friend usernames (transparent)",
		description = "Color of Friend Usernames in Public Chat (transparent)",
		section = transparentSection
	)
	Color transparentPublicFriendUsernames();
}
