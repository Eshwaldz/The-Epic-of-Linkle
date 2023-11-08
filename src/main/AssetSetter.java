package main;

import data.Progress;
import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_Bat;
import monster.MON_GreenSlime;
import monster.MON_Orc;
import monster.MON_SkeletonLord;
import monster.Mon_RedSlime;
import object.OBJ_Axe;
import object.OBJ_BlueHeart;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Door_Iron;
import object.OBJ_Lantern;
import object.OBJ_Pickaxe;
import object.OBJ_Potion_Red;
import object.OBJ_Sword_Legend;
import object.OBJ_Shield_Legend;
import object.OBJ_Tent;
import tile_interactive.IT_DestructibleWall;
import tile_interactive.IT_DryTree;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		int mapNum = 0;
		int i = 0;
		gp.obj[mapNum][i] = new OBJ_BlueHeart(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 23;
		gp.obj[mapNum][i].worldY = gp.tileSize * 19;
		i++;
		gp.obj[mapNum][i] = new OBJ_Lantern(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 18;
		gp.obj[mapNum][i].worldY = gp.tileSize * 20;
		i++;
		gp.obj[mapNum][i] = new OBJ_Tent(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 19;
		gp.obj[mapNum][i].worldY = gp.tileSize * 20;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 12;
		gp.obj[mapNum][i].worldY = gp.tileSize * 12;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_Axe(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 33;
		gp.obj[mapNum][i].worldY = gp.tileSize * 7;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Sword_Legend(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 30;
		gp.obj[mapNum][i].worldY = gp.tileSize * 29;
		i++;
		
		// MAP 2
		i = 0;
		mapNum = 2;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Pickaxe(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 40;
		gp.obj[mapNum][i].worldY = gp.tileSize * 41;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Shield_Legend(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 13;
		gp.obj[mapNum][i].worldY = gp.tileSize * 16;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 8;
		gp.obj[mapNum][i].worldY = gp.tileSize * 17;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 27;
		gp.obj[mapNum][i].worldY = gp.tileSize * 15;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize * 20;
		gp.obj[mapNum][i].worldY = gp.tileSize * 22;
		i++;

		
		// MAP 3
		i = 0;
		mapNum = 3;
		gp.obj[mapNum][i] = new OBJ_Door_Iron(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 25;
		gp.obj[mapNum][i].worldY = gp.tileSize * 15;
		i++;
		gp.obj[mapNum][i] = new OBJ_BlueHeart(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize * 25;
		gp.obj[mapNum][i].worldY = gp.tileSize * 8;
		i++;
		
	}
	
	public void setNPC() {
		
		// MAP 0
		int i = 0;
		int mapNum = 0;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize * 21;
		gp.npc[mapNum][i].worldY = gp.tileSize * 21;
		i++;
		
		// MAP 1
		i = 0;
		mapNum = 1;
		gp.npc[mapNum][i] = new NPC_Merchant(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize * 12;
		gp.npc[mapNum][i].worldY = gp.tileSize * 7;
		i++;
		
	}
	
	public void setMonster() {
		
		// MAP 0
		int i = 0;
		int mapNum = 0;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 20;
		gp.monster[mapNum][i].worldY = gp.tileSize * 38;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 25;
		gp.monster[mapNum][i].worldY = gp.tileSize * 37;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 23;
		gp.monster[mapNum][i].worldY = gp.tileSize * 40;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 34;
		gp.monster[mapNum][i].worldY = gp.tileSize * 38;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 38;
		gp.monster[mapNum][i].worldY = gp.tileSize * 41;
		i++;
		gp.monster[mapNum][i] = new Mon_RedSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 38;
		gp.monster[mapNum][i].worldY = gp.tileSize * 41;
		i++;
		gp.monster[mapNum][i] = new Mon_RedSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 40;
		gp.monster[mapNum][i].worldY = gp.tileSize * 8;
		i++;
		gp.monster[mapNum][i] = new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 12;
		gp.monster[mapNum][i].worldY = gp.tileSize * 32;
		i++;
		
		// MAP 2
		i = 0;
		mapNum = 2;
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 34;
		gp.monster[mapNum][i].worldY = gp.tileSize * 39;
		i++;
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 36;
		gp.monster[mapNum][i].worldY = gp.tileSize * 25;
		i++;
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 39;
		gp.monster[mapNum][i].worldY = gp.tileSize * 26;
		i++;
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 28;
		gp.monster[mapNum][i].worldY = gp.tileSize * 11;
		i++;
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize * 10;
		gp.monster[mapNum][i].worldY = gp.tileSize * 19;
		i++;
		
		// MAP 2
		i = 0;
		mapNum = 3;
		if(Progress.skeletonLordDefeated == false) {
			gp.monster[mapNum][i] = new MON_SkeletonLord(gp);
			gp.monster[mapNum][i].worldX = gp.tileSize * 23;
			gp.monster[mapNum][i].worldY = gp.tileSize * 16;
			i++;
		}
		
		
	}
	
	public void setInteractiveTile() {
		int mapNum = 0;
		int i = 0;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 12); i++;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 28); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 29); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 30); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 31); i++;

		
		// MAP 2
		i = 0;
		mapNum = 2;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 30); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 31); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 32); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 34); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 34); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 33); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 10, 22); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 10, 24); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 18); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 19); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 20); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 21); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 13); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 14); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 22, 28); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 30, 28); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 32, 28); i++;

		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 22); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 19); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 18); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 13); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 12, 10); i++;
		

	}
}
