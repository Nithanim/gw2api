package me.nithanim.gw2api.v2.api.achievements;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.api.colors.Color;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("achievements")
public interface AchievementsResourceWs extends IdsResourceWsInt<Achievement> {}
