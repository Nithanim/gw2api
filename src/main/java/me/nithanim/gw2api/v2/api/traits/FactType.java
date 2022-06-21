package me.nithanim.gw2api.v2.api.traits;

import me.nithanim.gw2api.v2.api.traits.facttypes.AttributeAdjustFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.BuffConversionFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.BuffFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.ComboFieldFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.ComboFinisherFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.DamageFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.DistanceFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.NoDataFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.NumberFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.PercentFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.PrefixedBuffFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.RadiusFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.RangeFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.RechargeFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.StunBreak;
import me.nithanim.gw2api.v2.api.traits.facttypes.TimeFact;
import me.nithanim.gw2api.v2.api.traits.facttypes.UnblockableFact;
import me.nithanim.gw2api.v2.util.jackson.SubtypeEnum;

public enum FactType implements SubtypeEnum<Fact> {
  ATTRIBUTE_ADJUST(AttributeAdjustFact.class),
  BUFF(BuffFact.class),
  BUFF_CONVERSION(BuffConversionFact.class),
  COMBO_FIELD(ComboFieldFact.class),
  COMBO_FINISHER(ComboFinisherFact.class),
  DAMAGE(DamageFact.class),
  DISTANCE(DistanceFact.class),
  NO_DATA(NoDataFact.class),
  NUMBER(NumberFact.class),
  PERCENT(PercentFact.class),
  PREFIXED_BUFF(PrefixedBuffFact.class),
  RADIUS(RadiusFact.class),
  RANGE(RangeFact.class),
  RECHARGE(RechargeFact.class),
  STUN_BREAK(StunBreak.class),
  TIME(TimeFact.class),
  UNBLOCKABLE(UnblockableFact.class);

  private final Class<? extends Fact> detailsClass;

  FactType(Class<? extends Fact> detailsClass) {
    this.detailsClass = detailsClass;
  }

  @Override
  public Class<? extends Fact> getEnumClass() {
    return detailsClass;
  }
}
