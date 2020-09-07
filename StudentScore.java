/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author THE UNIVERSE BOSS
 */
public class StudentScore {
    private String language;
    private double per;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public StudentScore(String language, double per) {
        this.language = language;
        this.per = per;
    }

    public StudentScore() {
    }
    
}
