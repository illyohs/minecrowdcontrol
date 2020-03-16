package com.racerxdl.minecrowdcontrol.effect;

import com.racerxdl.minecrowdcontrol.CommandResult;
import com.racerxdl.minecrowdcontrol.CrowdControl.EffectResult;
import com.racerxdl.minecrowdcontrol.CrowdControl.RequestType;
import com.racerxdl.minecrowdcontrol.effect.api.EffectCtx;
import com.racerxdl.minecrowdcontrol.effect.api.IEffect;
import net.minecraft.entity.player.PlayerEntity;

public class EffectSetPlayerOnFire implements IEffect
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

        if (player.getFireTimer() == -20)
        {
            player.setFire(5);
            res.setEffectResult(EffectResult.Success);
        } else {
            res.setEffectResult(EffectResult.Retry);
        }

        return res;
    }
}
