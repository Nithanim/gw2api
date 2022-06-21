package me.nithanim.gw2api.v2.api.build;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;

@RequiredArgsConstructor
public class BuildResourceImpl implements BuildResource {
  @Delegate private final BuildResourceWs bs;
}
