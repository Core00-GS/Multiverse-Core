/******************************************************************************
 * Multiverse 2 Copyright (c) the Multiverse Team 2020.                       *
 * Multiverse 2 is licensed under the BSD License.                            *
 * For more information please check the README.md file included              *
 * with this project.                                                         *
 ******************************************************************************/

package com.onarandombox.MultiverseCore.commandTools.contexts;

import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Player and its corresponding {@link MultiverseWorld}.
 */
public class PlayerWorld {

    private final Player player;
    private final MultiverseWorld world;

    public PlayerWorld(@NotNull Player player,
                       @Nullable MultiverseWorld world) {

        this.player = player;
        this.world = world;
    }

    public boolean isSender(@Nullable CommandSender sender) {
        return player.equals(sender);
    }

    @NotNull
    public Player getPlayer() {
        return player;
    }

    @Nullable
    public MultiverseWorld getWorld() {
        return world;
    }

    @Override
    public String toString() {
        return "CommandPlayer{" +
                "player=" + player +
                ", world=" + world +
                '}';
    }
}
