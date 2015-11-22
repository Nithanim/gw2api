package me.nithanim.gw2api.v2.api.traits;

public interface TraitedFact extends Fact {
    int getRequiresTrait();

    /**
     * Optional, -1 if not in response
     *
     * @return
     */
    public int getOverrides();
}
