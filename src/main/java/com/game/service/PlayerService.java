package com.game.repository;

import com.game.controller.PlayerOrder;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.model.Player;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PlayerService {

    List<Player> getPlayers(String name, String title, Race race, Profession profession, Long after, Long before, Boolean banned, Integer minExperience, Integer maxExperience, Integer minLevel, Integer maxLevel, PlayerOrder order, Integer pageNumber, Integer pageSize);

    List<Player> sortPlayers(List<Player> players, PlayerOrder order);

    List<Player> getPage(List<Player> sortedPlayers, Integer pageNumber, Integer pageSize);

    boolean isPlayerValid(Player player);

    Player savePlayer(Player player);

    Player getPlayer(Long id);

    Player updatePlayer(Player savedPlayer, Player player);

    void deletePlayer(Player player);
}
