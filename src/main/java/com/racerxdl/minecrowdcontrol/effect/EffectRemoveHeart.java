package com.racerxdl.minecrowdcontrol.effect;

import com.racerxdl.minecrowdcontrol.CommandResult;
import com.racerxdl.minecrowdcontrol.CrowdControl.EffectResult;
import com.racerxdl.minecrowdcontrol.CrowdControl.RequestType;
import com.racerxdl.minecrowdcontrol.effect.api.EffectCtx;
import com.racerxdl.minecrowdcontrol.effect.api.IEffect;
import net.minecraft.entity.player.PlayerEntity;

public class EffectRemoveHeart implements IEffect
{
    @Override
    public CommandResult exec(EffectCtx ctx)
    {

        CommandResult res = new CommandResult(ctx.getStates());
        PlayerEntity player = ctx.getPlayer();
        RequestType type = ctx.getType();

        if (ctx.getType() == RequestType.Test)
        {
            return  res.setEffectResult(EffectResult.Success);
        }

        if (ctx.getType() == RequestType.Stop)
        {
            return res.setEffectResult(EffectResult.Unavailable);
        }

        float health = ctx.getPlayer().getHealth();

        if (health > 2) {
           player.setHealth(player.getHealth());
           res.setEffectResult(EffectResult.Success);
        } else {
          res.setEffectResult(EffectResult.Unavailable);
        }

        return res;
    }
}
