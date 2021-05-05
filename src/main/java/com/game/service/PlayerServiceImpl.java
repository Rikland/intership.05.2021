package com.game.repository;

import com.game.controller.PlayerOrder;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.model.Player;
import com.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService{
private PlayerRepository playerRepository;
public PlayerServiceImpl(){}

@Autowired
public PlayerServiceImpl(PlayerRepository playerRepository){
    super();
    this.playerRepository = playerRepository;
}

    @Override
    public List<Player> getPlayers(String name, String title, Race race, Profession profession, Long after, Long before, Boolean banned, Integer minExperience, Integer maxExperience, Integer minLevel, Integer maxLevel, PlayerOrder order, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public List<Player> sortPlayers(List<Player> players, PlayerOrder order) {
        return null;
    }

    @Override
    public List<Player> getPage(List<Player> sortedPlayers, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public boolean isPlayerValid(Player player) {
        return false;
    }

    @Override
    public Player savePlayer(Player player) {
        return null;
    }

    @Override
    public Player getPlayer(Long id) {
        return null;
    }

    @Override
    public Player updatePlayer(Player savedPlayer, Player player) {
        return null;
    }

    @Override
    public void deletePlayer(Player player) {

    }
}
