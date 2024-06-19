/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dilemma.cerveza;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author kevinlsn
 */
public class ButtonEdit extends JButton{

    /**
     * @return the over
     */
    public boolean isOver() {
        return over;
    }

    /**
     * @param over the over to set
     */
    public void setOver(boolean over) {
        this.over = over;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    /**
     * @return the colorOver
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * @param colorOver the colorOver to set
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * @return the colorClick
     */
    public Color getColorClick() {
        return colorClick;
    }

    /**
     * @param colorClick the colorClick to set
     */
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    /**
     * @return the borderColor
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderColor the borderColor to set
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public ButtonEdit(){
        //Color Inicial
        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 104, 144);
        borderColor = new Color(30, 136, 56);
        setContentAreaFilled(false);
        
        // Evento de Cursor
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me){
                setBackground(colorOver);
                over = true;
            }
            @Override
            public void mouseExited(MouseEvent me){
                setBackground(color);
                over = false;
            }
            @Override
            public void mousePressed(MouseEvent me){
                setBackground(colorClick);
            }
            @Override
            public void mouseReleased(MouseEvent me){
                if(over){
                    setBackground(colorOver);
                }else{
                    setBackground(color);
                }
            }
        });
    }
    
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    
    @Override
    protected void paintComponent(Graphics grphcs){
        
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Color Borde
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //Conjunto de bordes 2px
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs); //Para cambiar el cuerpo de metodos y herramientas
        
    }
    
}
