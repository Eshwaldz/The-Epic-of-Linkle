package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Sword_Legend extends Entity {
	
	public static final String objName = "Ikael's Sword";

	public OBJ_Sword_Legend(GamePanel gp) {
		super(gp);
		
		type = type_sword;
		name = objName;
		down1 = setup("/objects/sword_legend", gp.tileSize, gp.tileSize);
		attackValue = 10;
		attackArea.width = 36;
		attackArea.height = 36;
		description = "[" + name + "]\n"
				+ "Filled with divine power\n"
				+ "One hit one kill.";
		price = 0;
		knockBackPower = 2;
		motion1_duration = 5;
		motion2_duration = 25;
	}

}