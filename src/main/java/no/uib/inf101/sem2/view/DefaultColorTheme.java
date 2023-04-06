package no.uib.inf101.sem2.view;

import java.awt.Color;
import java.awt.Font;


public class DefaultColorTheme implements ColorTheme{

    @Override
    public Color getCellColor(char c) {
      Color color = switch(c) {
        case 'P' -> Color.BLACK;//spiller
        case 'Q' -> Color.cyan;//spiller
        //.... fyll ut dine favorittfarger
        case '-' -> new Color(0, 0, 0, 37);
        default -> throw new IllegalArgumentException(
            "No available color for '" + c + "'");
      };
      return color;
    }


    @Override
    public Color getFrameColor() {
        return new Color(0, 0, 0, 0);
    }

    @Override
    public Color getBackgroundColor() {
      return null;
    }
    
    
    @Override
    public Font getFont() {
        return new Font("Serif", Font.BOLD, 5);
    }


    @Override
    public Font getFontGameOver() {
        return new Font("Serif", Font.BOLD, 5);
    }


    @Override
    public Color getFontColor() {
        return Color.magenta;
    }


    @Override
    public Color getGameOverBackgroundColor() {
        return new Color(0, 0, 0, 128);
    }


    @Override
    public Color getWinnerBackground() {
        return new Color(0, 0, 0, 128);
    }

    @Override
    public Font getFontWinner() {
        return new Font("Serif", Font.BOLD, 50);
    }


    @Override
    public Color getLadderBackground() {
        return new Color(0, 150, 0, 128);
    }


    @Override
    public Color getSnakeBackground() {
        return new Color(150, 0, 0, 128);
    }

    
}

