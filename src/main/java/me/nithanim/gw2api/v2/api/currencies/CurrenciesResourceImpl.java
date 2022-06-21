package me.nithanim.gw2api.v2.api.currencies;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

public class CurrenciesResourceImpl extends IdsResourceBaseInt<Currency>
    implements CurrenciesResource {
  public CurrenciesResourceImpl(IdsResourceWsInt<Currency> ws) {
    super(ws);
  }
}
