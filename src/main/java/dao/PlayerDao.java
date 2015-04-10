package dao;

import java.util.List;

import model.Player;

public interface PlayerDao {
	public void save(Player p);
	public List<Player> list();
	
}
