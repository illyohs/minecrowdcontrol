package com.racerxdl.minecrowdcontrol.effect.api;

import com.racerxdl.minecrowdcontrol.CrowdControl.RequestType;
import com.racerxdl.minecrowdcontrol.PlayerStates;
import net.minecraft.entity.player.PlayerEntity;

public class EffectCtx
{
    PlayerStates    states;
    PlayerEntity    player;
    String          view;
    RequestType     type;

    public EffectCtx(PlayerStates states, PlayerEntity player, String view, RequestType type)
    {
        this.states = states;
        this.player = player;
        this.view = view;
        this.type = type;
    }

    public PlayerStates getStates()
    {
        return states;
    }

    public PlayerEntity getPlayer()
    {
        return player;
    }

    public String getView()
    {
        return view;
    }

    public RequestType getType()
    {
        return type;
    }
}
