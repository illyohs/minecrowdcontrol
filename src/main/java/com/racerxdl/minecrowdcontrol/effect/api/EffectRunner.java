package com.racerxdl.minecrowdcontrol.effect.api;

import java.util.HashMap;

public class EffectRunner {

    private HashMap<String, IEffect> effectRegistry = new HashMap<>();

    public EffectRunner() {

    }

    private void registerEffect(String trigger, IEffect effect) {
        effectRegistry.put(trigger, effect);
    }


    private void executor(String trigger, EffectCtx context) {
        effectRegistry.get(trigger).exec(context);
    }


}
