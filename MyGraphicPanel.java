import java.awt.Graphics;

import javax.swing.JPanel;

public class MyGraphicPanel extends JPanel{
	public String cevap;
	public int x;
	public int y;

	public MyGraphicPanel(String cevap, int x, int y) {
	this.cevap=cevap;
	this.x=x;
	this.y=y;
	}
	public MyGraphicPanel() {
	this.cevap="";
	this.x=0;
	this.y=0;
	}
	public void paintOne(Graphics g, String cevap) {
		g.clearRect(10, 10, 770, 120);
		if(cevap.charAt(cevap.length()-1)=='0') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 730,60);
			g.drawLine(730, 60, 730,80);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='.') {
			g.drawLine(720, 80, 723,80);
		}
		if(cevap.charAt(cevap.length()-1)=='1') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='2') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(730, 60, 730,80);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='3') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='4') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 40, 730,60);
		}
		if(cevap.charAt(cevap.length()-1)=='5') {
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 730,60);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='6') {
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 730,60);
			g.drawLine(730, 60, 730,80);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='7') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 750,40);
		}
		if(cevap.charAt(cevap.length()-1)=='8') {
			
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 730,60);
			g.drawLine(730, 60, 730,80);
			g.drawLine(750, 40, 750, 60);
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='9') {
			g.drawLine(750, 40, 750,60);
			g.drawLine(750, 60, 750,80);
			g.drawLine(730, 40, 730,60);
			
			g.drawLine(730, 40, 750,40);
			g.drawLine(730, 60, 750,60);
			g.drawLine(730, 80, 750,80);
		}
		if(cevap.charAt(cevap.length()-1)=='-') {
			g.drawLine(730, 60, 750,60);
		}
		if(cevap.charAt(cevap.length()-2)=='0') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 690,60);
			g.drawLine(690, 60, 690,80);
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='.') {
			g.drawLine(680, 80, 683,80);
		}
		if(cevap.charAt(cevap.length()-2)=='1') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='2') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(690, 60, 690,80);
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='3') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='4') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 40, 690,60);
		}
		if(cevap.charAt(cevap.length()-2)=='5') {
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 690,60);
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='6') {
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 690,60);
			g.drawLine(690, 60, 690,80);
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='7') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 710,40);
		}
		if(cevap.charAt(cevap.length()-2)=='8') {
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 690,60);
			g.drawLine(690, 60, 690,80);
			g.drawLine(690, 40, 710,40);
			g.drawLine(710, 40, 710,60);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='9') {
			g.drawLine(710, 40, 710,60);
			g.drawLine(710, 60, 710,80);
			g.drawLine(690, 40, 690,60);
			
			g.drawLine(690, 40, 710,40);
			g.drawLine(690, 60, 710,60);
			g.drawLine(690, 80, 710,80);
		}
		if(cevap.charAt(cevap.length()-2)=='-') {
			g.drawLine(690, 60, 710,60);
		}
		if(cevap.charAt(cevap.length()-3)=='0') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 650,60);
			g.drawLine(650, 60, 650,80);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='.') {
			g.drawLine(640, 80, 643,80);
		}
		if(cevap.charAt(cevap.length()-3)=='1') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='2') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(650, 60, 650,80);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='3') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='4') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 40, 650,60);
		}
		if(cevap.charAt(cevap.length()-3)=='5') {
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 650,60);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='6') {
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 650,60);
			g.drawLine(650, 60, 650,80);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='7') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 670,40);
		}
		if(cevap.charAt(cevap.length()-3)=='8') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 650,60);
			g.drawLine(650, 60, 650,80);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='9') {
			g.drawLine(670, 40, 670,60);
			g.drawLine(670, 60, 670,80);
			g.drawLine(650, 40, 650,60);
			g.drawLine(650, 40, 670,40);
			g.drawLine(650, 60, 670,60);
			g.drawLine(650, 80, 670,80);
		}
		if(cevap.charAt(cevap.length()-3)=='-') {
			g.drawLine(650, 60, 670,60);
		}
	}
	
	public void paintTwo(Graphics g, String cevap) {
		paintOne(g, cevap);
		if(cevap.charAt(cevap.length()-4)=='0') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 610,60);
			g.drawLine(610, 60, 610,80);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='.') {
			g.drawLine(600, 80, 603,80);
		}
		if(cevap.charAt(cevap.length()-4)=='1') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='2') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(610, 60, 610,80);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='3') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='4') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 40, 610,60);
		}
		if(cevap.charAt(cevap.length()-4)=='5') {
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 610,60);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='6') {
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 610,60);
			g.drawLine(610, 60, 610,80);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='7') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 630,40);
		}
		if(cevap.charAt(cevap.length()-4)=='8') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 610,60);
			g.drawLine(610, 60, 610,80);
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='9') {
			g.drawLine(630, 40, 630,60);
			g.drawLine(630, 60, 630,80);
			g.drawLine(610, 40, 610,60);
			
			g.drawLine(610, 40, 630,40);
			g.drawLine(610, 60, 630,60);
			g.drawLine(610, 80, 630,80);
		}
		if(cevap.charAt(cevap.length()-4)=='-') {
			g.drawLine(610, 60, 630,60);
		}
	}
	public void paintThree(Graphics g, String cevap) {
		paintTwo(g,cevap);
		if(cevap.charAt(cevap.length()-5)=='0') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 570,60);
			g.drawLine(570, 60, 570,80);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='.') {
			g.drawLine(560, 80, 563,80);
		}
		if(cevap.charAt(cevap.length()-5)=='1') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='2') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(570, 60, 570,80);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='3') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='4') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 40, 570,60);
		}
		if(cevap.charAt(cevap.length()-5)=='5') {
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 570,60);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='6') {
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 570,60);
			g.drawLine(570, 60, 570,80);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='7') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 590,40);
		}
		if(cevap.charAt(cevap.length()-5)=='8') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 570,60);
			g.drawLine(570, 60, 570,80);
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='9') {
			g.drawLine(590, 40, 590,60);
			g.drawLine(590, 60, 590,80);
			g.drawLine(570, 40, 570,60);
			
			g.drawLine(570, 40, 590,40);
			g.drawLine(570, 60, 590,60);
			g.drawLine(570, 80, 590,80);
		}
		if(cevap.charAt(cevap.length()-5)=='-') {
			g.drawLine(570, 60, 590,60);
		}
	}
	public void paintFour(Graphics g, String cevap) {
		paintThree(g,cevap);
		if(cevap.charAt(cevap.length()-6)=='0') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 530,60);
			g.drawLine(530, 60, 530,80);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='.') {
			g.drawLine(520, 80, 523,80);
		}
		if(cevap.charAt(cevap.length()-6)=='1') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='2') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(530, 60, 530,80);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='3') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='4') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 40, 530,60);
		}
		if(cevap.charAt(cevap.length()-6)=='5') {
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 530,60);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='6') {
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 530,60);
			g.drawLine(530, 60, 530,80);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='7') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 550,40);
		}
		if(cevap.charAt(cevap.length()-6)=='8') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 530,60);
			g.drawLine(530, 60, 530,80);
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='9') {
			g.drawLine(550, 40, 550,60);
			g.drawLine(550, 60, 550,80);
			g.drawLine(530, 40, 530,60);
			
			g.drawLine(530, 40, 550,40);
			g.drawLine(530, 60, 550,60);
			g.drawLine(530, 80, 550,80);
		}
		if(cevap.charAt(cevap.length()-6)=='-') {
			g.drawLine(530, 60, 55,60);
		}
	}
	public void paintFive(Graphics g, String cevap) {
		paintFour(g,cevap);
		if(cevap.charAt(cevap.length()-7)=='0') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 490,60);
			g.drawLine(490, 60, 490,80);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='.') {
			g.drawLine(480, 80, 483,80);
		}
		if(cevap.charAt(cevap.length()-7)=='1') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='2') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(490, 60, 490,80);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='3') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='4') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 40, 490,60);
		}
		if(cevap.charAt(cevap.length()-7)=='5') {
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 490,60);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='6') {
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 490,60);
			g.drawLine(490, 60, 490,80);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='7') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 510,40);
		}
		if(cevap.charAt(cevap.length()-7)=='8') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 490,60);
			g.drawLine(490, 60, 490,80);
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='9') {
			g.drawLine(510, 40, 510,60);
			g.drawLine(510, 60, 510,80);
			g.drawLine(490, 40, 490,60);
			
			g.drawLine(490, 40, 510,40);
			g.drawLine(490, 60, 510,60);
			g.drawLine(490, 80, 510,80);
		}
		if(cevap.charAt(cevap.length()-7)=='-') {
			g.drawLine(490, 60, 510,60);
		}
	}
	public void paintSix(Graphics g, String cevap) {
		paintFive(g,cevap);
		if(cevap.charAt(cevap.length()-8)=='0') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 450,60);
			g.drawLine(450, 60, 450,80);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='.') {
			g.drawLine(440, 80, 443,80);
		}
		if(cevap.charAt(cevap.length()-8)=='1') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='2') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(450, 60, 450,80);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='3') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='4') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 40, 450,60);
		}
		if(cevap.charAt(cevap.length()-8)=='5') {
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 450,60);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='6') {
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 450,60);
			g.drawLine(450, 60, 450,80);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='7') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 470,40);
		}
		if(cevap.charAt(cevap.length()-8)=='8') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 450,60);
			g.drawLine(450, 60, 450,80);
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='9') {
			g.drawLine(470, 40, 470,60);
			g.drawLine(470, 60, 470,80);
			g.drawLine(450, 40, 450,60);
			
			g.drawLine(450, 40, 470,40);
			g.drawLine(450, 60, 470,60);
			g.drawLine(450, 80, 470,80);
		}
		if(cevap.charAt(cevap.length()-8)=='-') {
			g.drawLine(450, 60, 470,60);
		}
	}
	public void paintSeven(Graphics g, String cevap) {
		paintSix(g,cevap);
		if(cevap.charAt(cevap.length()-9)=='0') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 410,60);
			g.drawLine(410, 60, 410,80);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='.') {
			g.drawLine(410, 80, 413,80);
		}
		if(cevap.charAt(cevap.length()-9)=='1') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='2') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(410, 60, 410,80);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='3') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='4') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 40, 410,60);
		}
		if(cevap.charAt(cevap.length()-9)=='5') {
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 410,60);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='6') {
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 410,60);
			g.drawLine(410, 60, 410,80);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='7') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 430,40);
		}
		if(cevap.charAt(cevap.length()-9)=='8') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 410,60);
			g.drawLine(410, 60, 410,80);
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='9') {
			g.drawLine(430, 40, 430,60);
			g.drawLine(430, 60, 430,80);
			g.drawLine(410, 40, 410,60);
			
			g.drawLine(410, 40, 430,40);
			g.drawLine(410, 60, 430,60);
			g.drawLine(410, 80, 430,80);
		}
		if(cevap.charAt(cevap.length()-9)=='-') {
			g.drawLine(410, 60, 430,60);
		}
	}
	public void paintEight(Graphics g, String cevap) {
		paintSeven(g,cevap);
		if(cevap.charAt(cevap.length()-10)=='0') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 370,60);
			g.drawLine(370, 60, 370,80);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='.') {
			g.drawLine(360, 80, 363,80);
		}
		if(cevap.charAt(cevap.length()-10)=='1') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='2') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(370, 60, 370,80);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='3') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='4') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 40, 370,60);
		}
		if(cevap.charAt(cevap.length()-10)=='5') {
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 370,60);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='6') {
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 370,60);
			g.drawLine(370, 60, 370,80);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='7') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 390,40);
		}
		if(cevap.charAt(cevap.length()-10)=='8') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 370,60);
			g.drawLine(370, 60, 370,80);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-10)=='9') {
			g.drawLine(390, 40, 390,60);
			g.drawLine(390, 60, 390,80);
			g.drawLine(370, 40, 370,60);
			g.drawLine(370, 40, 390,40);
			g.drawLine(370, 60, 390,60);
			g.drawLine(370, 80, 390,80);
		}
		if(cevap.charAt(cevap.length()-4)=='-') {
			g.drawLine(370, 60, 390,60);
		}
	}
	public void paint(Graphics g) {
		this.setBounds(10, 10, 770, 120);

		if(cevap.length()<1) {
			g.clearRect(10, 10, 770, 120);
		}
		if(cevap.length()==1) {
			if(cevap.charAt(cevap.length()-1)=='0') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 730,60);
				g.drawLine(730, 60, 730,80);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='.') {
				g.drawLine(720, 80, 723,80);
			}
			if(cevap.charAt(cevap.length()-1)=='1') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='2') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(730, 60, 730,80);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='3') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='4') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 40, 730,60);
			}
			if(cevap.charAt(cevap.length()-1)=='5') {
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 730,60);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='6') {
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 730,60);
				g.drawLine(730, 60, 730,80);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='7') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 750,40);
			}
			if(cevap.charAt(cevap.length()-1)=='8') {
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 730,60);
				g.drawLine(730, 60, 730,80);
				g.drawLine(750,40,750,60);
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='9') {
				g.drawLine(750, 40, 750,60);
				g.drawLine(750, 60, 750,80);
				g.drawLine(730, 40, 730,60);
				
				g.drawLine(730, 40, 750,40);
				g.drawLine(730, 60, 750,60);
				g.drawLine(730, 80, 750,80);
			}
			if(cevap.charAt(cevap.length()-1)=='-') {
				g.drawLine(730, 60, 750,60);
			}
		}
		else if(cevap.length()>=11) {
			System.err.println("MAKSIMUM KARAKTER SINIRI ASILDI!!!");
			cevap=cevap.substring(0,10);
			System.out.println("Ilk 10 hanesi: " +cevap);
			paintEight(g, cevap);
		}
		else if(cevap.length()>=10) {
			paintEight(g, cevap);
		}
		else if(cevap.length()>=9) {
			paintSeven(g,cevap);
		}
		else if(cevap.length()>=8) {
			paintSix(g,cevap);
		}
		else if(cevap.length()>=7) {
			paintFive(g,cevap);
		}
		else if(cevap.length()>=6) {
			paintFour(g,cevap);
		}
		else if(cevap.length()>=5) {
			paintThree(g,cevap);
		}
		else if(cevap.length()>=4){
			paintTwo(g, cevap);
		}
		else if(cevap.length()>=3) {
			paintOne(g, cevap);
		}
	}	
}
