/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author zhengchao
 */
public class Apple implements Comparable {
    private String variety;
    private Color color;
    private Integer weight;
    
    public Apple(String variety, Color color,int weight){
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        
    }

    @Override
    public int compareTo(Object other) {
        
        Apple apple = (Apple) other;
        
        if (this.weight < apple.weight) {
            return -1;
        }
        if (Objects.equals(this.weight, apple.weight)) {
            return 0;
        }
        return 1;
    }
    
    public String getVariety() {
        return variety;
    }

    public Color getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }
}