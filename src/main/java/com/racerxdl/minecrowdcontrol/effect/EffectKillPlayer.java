package com.racerxdl.minecrowdcontrol.effect;

import com.racerxdl.minecrowdcontrol.CommandResult;
import com.racerxdl.minecrowdcontrol.effect.api.EffectCtx;
import com.racerxdl.minecrowdcontrol.effect.api.IEffect;

public class EffectKillPlayer implements IEffect
{
    @Override
    public CommandResult exec(EffectCtx context)
    {
        CommandResult res = new CommandResult(context.getStates());
        return null;
    }
}
