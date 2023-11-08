package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Legend extends Entity {

	public static final String objName = "Everiel's Shield";
	
	public OBJ_Shield_Legend(GamePanel gp) {
		super(gp);

		type = type_shield;
		name = objName;
		down1 = setup("/objects/shield_legend", gp.tileSize, gp.tileSize);
		defenseValue = 10;
		description = "[" + name + "]\n"
				+ "Filled with divine power\n"
				+ "Divine artifacts of...";
		price = 0;
	}

}
