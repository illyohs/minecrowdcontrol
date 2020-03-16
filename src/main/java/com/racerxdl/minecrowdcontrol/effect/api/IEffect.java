package com.racerxdl.minecrowdcontrol.effect.api;

import com.racerxdl.minecrowdcontrol.CommandResult;

@FunctionalInterface
public interface IEffect
{
    CommandResult exec(EffectCtx etx);
}
