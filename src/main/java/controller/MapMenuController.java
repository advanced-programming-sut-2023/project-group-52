package controller;

import model.map.Cell;
import model.map.Map;
import view.Menu;

import java.util.HashMap;
import java.util.regex.Matcher;

public class MapMenuController {
    public static Map map;
    public static Cell currentCell;
    public static void showAroundThisCell(){
        int xLeft=currentCell.getXCordinate();
        for(int i=0;i<3;i++){
            if(xLeft==0) break;
            xLeft-=1;
        }
        int xRight=currentCell.getXCordinate();
        for(int i=0;i<3;i++){
            if((xRight+1)== map.getLength()) break;
            xRight-=1;
        }
        int yUp=currentCell.getYCordinate();
        for(int i=0;i<3;i++){
            if(yUp==0) break;
            yUp-=1;
        }
        int yDown=currentCell.getYCordinate();
        for(int i=0;i<3;i++){
            if((yDown+1)== map.getLength()) break;
            yDown-=1;
        }
        for(int i=xLeft;i<=xRight;i++){
            for (int j=yDown;j<=yUp;j++){
                map.getCellByCordinat(i,j).show();
            }
        }
    }
    public String getDirection(String com){
        String regex="(?<dir>\\D+)\\d*";
        Matcher mather= Menu.getMatcher(com,regex);
        if(mather.find()) return mather.group("dir");
        return null;
    }

    public static void move(Matcher matcher){
        String direction=matcher.group("direction");
        String[] allDirection=direction.split(" ");


    }

}
