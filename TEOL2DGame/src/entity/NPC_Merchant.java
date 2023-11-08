package entity;

import java.awt.Rectangle;

import main.GamePanel;
import object.OBJ_Axe;
import object.OBJ_Key;
import object.OBJ_Pickaxe;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import object.OBJ_Sword_Iron;

public class NPC_Merchant extends Entity {
	
	public NPC_Merchant(GamePanel gp) {
		super(gp);
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidArea.width = 32;
		solidArea.height = 32;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		direction = "down";
		speed = 1;
		
		getImage();
		setDialogue();
		setItems();
	}
	
	public void getImage() {
		
		up1 = setup("/npc/merchant_up_1", gp.tileSize, gp.tileSize);
		up2 = setup("/npc/merchant_up_2", gp.tileSize, gp.tileSize);
		down1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
		down2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
		left1 = setup("/npc/merchant_left_1", gp.tileSize, gp.tileSize);
		left2 = setup("/npc/merchant_left_2", gp.tileSize, gp.tileSize);
		right1 = setup("/npc/merchant_right_1", gp.tileSize, gp.tileSize);
		right2 = setup("/npc/merchant_right_2", gp.tileSize, gp.tileSize);	
	}
	
	public void setDialogue() {
		
		dialogues[0][0] = "Got something that might interest ya \n"
						+ "heh-heh-heh-heh-heh.";
		
		dialogues[1][0] = "Come back anytime";
		dialogues[2][0] = "You need more coin to buy that!";
		dialogues[3][0] = "You cannot carry any more!";
		dialogues[4][0] = "You cannot sell an equipped item!";
	}
	
	public void setItems() {
		
		inventory.add(new OBJ_Sword_Iron(gp));
		inventory.add(new OBJ_Axe(gp));
		inventory.add(new OBJ_Pickaxe(gp));
		inventory.add(new OBJ_Shield_Blue(gp));
		inventory.add(new OBJ_Potion_Red(gp));
		inventory.add(new OBJ_Key(gp));
	}
	
	public void speak() {
		
		facePlayer();
		gp.gameState = gp.tradeState;
		gp.ui.npc = this;
	}
}
