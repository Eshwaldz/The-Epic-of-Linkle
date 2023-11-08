package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Sword_Iron extends Entity {
	
	public static final String objName = "Iron Sword";

	public OBJ_Sword_Iron(GamePanel gp) {
		super(gp);
		
		type = type_sword;
		name = objName;
		down1 = setup("/objects/sword_iron", gp.tileSize, gp.tileSize);
		attackValue = 3;
		attackArea.width = 36;
		attackArea.height = 36;
		description = "[" + name + "]\n"
				+ "It's a iron sword\n"
				+ "Just scrub off the rust.";
		price = 200;
		knockBackPower = 2;
		motion1_duration = 5;
		motion2_duration = 25;
	}

}